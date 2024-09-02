package auth;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import pages.PageControl;

public class Auth {
    private boolean isUserAuthenticated = false; 
    private JPanel mainPanel, authSection_1, authSection_2, inputPanel_1, inputPanel_2, previewPanel;
    private JLabel titleText, previewLabel;
    private TextField userField;
    private JPasswordField passwordField;
    private Dimension screenSize;
    private JButton login_btn;
    private ImageIcon nerdEmoji;

    public Auth(){
        initialize();
    }

    private void initialize(){
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int defaultWidth = (int ) screenSize.getWidth();
        int defaultHeight = (int) screenSize.getHeight();


        nerdEmoji = new ImageIcon("public/nerd_emoji.png");
        
        mainPanel = new JPanel();
        authSection_1 = new JPanel();
        authSection_2 = new JPanel();
        inputPanel_1 = new JPanel();
        inputPanel_2 = new JPanel();
        previewPanel = new JPanel();

        userField = new TextField();
        passwordField = new JPasswordField();

        login_btn = new JButton("LogIn");
        
        titleText = new JLabel("<html>"+
        " <h1 style=\"font-size:80px\">quiz" + 
        "<span style=\"color:#56C9AA\">ify</span>" + 
        "</h1>" +
         "</html>");
        previewLabel = new JLabel();
        previewLabel.setIcon(nerdEmoji);
        

        
        mainPanel.setBackground(new Color(20, 23, 29));
        mainPanel.setBounds(0,0,defaultWidth, defaultHeight);
        mainPanel.setLayout(null);

        authSection_1.setBounds(0,0, defaultWidth/2, defaultHeight);
        authSection_1.setBackground(new Color(20, 23, 29));
        authSection_1.setLayout(null);

        inputPanel_1.setBounds(210,400, 350, 30);
        inputPanel_1.setLayout(null);

        login_btn.setBounds(330, 500, 100, 30);
        login_btn.setForeground(new Color(255,255,255));
        login_btn.setFont(new Font(null, Font.PLAIN, 20));
        login_btn.setBackground(new Color(86, 201, 170));
        login_btn.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        inputPanel_2.setBounds(210,450, 350, 30);
        inputPanel_2.setLayout(null);

        previewPanel.setBounds(0, 100, defaultWidth/2, 700);
        previewPanel.setBackground(new Color(20, 23, 29));
        previewPanel.setLayout(null);
        
        previewLabel.setBounds(100,0,defaultWidth/2, 700);

        userField.setBounds(0, 0, 350, 30);
        userField.setFont(new Font(null, Font.PLAIN, 25));
        
        passwordField.setBounds(0, 0, 350, 30);
        passwordField.setFont(new Font(null, Font.PLAIN, 25));
        
        
        authSection_2.setBounds(defaultWidth/2, 0, defaultWidth/2, defaultHeight);
        authSection_2.setBackground(new Color(20, 23, 29));
        authSection_2.setLayout(null);
        
        titleText.setForeground(new Color(255, 255, 255));
        titleText.setBounds(225 , 250, 500, 150);

        inputPanel_1.add(userField);
        inputPanel_2.add(passwordField);
        
        previewPanel.add(previewLabel);

        mainPanel.add(authSection_1);
        mainPanel.add(authSection_2);

        authSection_1.add(titleText);
        authSection_1.add(inputPanel_1);
        authSection_1.add(inputPanel_2);
        authSection_1.add(login_btn);

        authSection_2.add(previewPanel);
        

        login_btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(ControlAccess.Authenticate(userField.getText(), String.valueOf(passwordField.getPassword()))){
                    PageControl.showHome();
                }
            }
            
        });

    }

    public boolean AuthStatus(){
        return isUserAuthenticated;
    }

    public JPanel getPanel(){
        return mainPanel;
    }
}

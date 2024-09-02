package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz {
   private JPanel mainPanel, headerPanel, footerPanel, questionPanel, questionBlock;
   private JButton homeButton, aboutButton, choiceButton_1, choiceButton_2, choiceButton_3;
   private JLabel titleText, copyrightText, questionLabel;
   private LinkedList math;
   private static int number = 0;

   public Quiz(String subject){
      initialize(subject);
   }

   private void incrementNumber(){
        number++;
   }

   private void initialize(String subject){    
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int defaultWidth = (int) screenSize.getWidth();
        int defaultHeight = (int) screenSize.getHeight();
        
        mainPanel = new JPanel();
        headerPanel = new JPanel();
        footerPanel = new JPanel();
        questionPanel = new JPanel();
        questionBlock = new JPanel();
        
        math = MathQuestions.getQuestions();

        String[] data = math.get(Quiz.number);
        
        System.out.println(Quiz.number);
        System.out.println(data[0]);
        questionLabel = createJLabel(20,0, 950, 100, data[0], "Arial", Font.BOLD, 20, 53, 65, 79, 255,255,255);
        choiceButton_1 = createButton(25,200, 950, 50, data[1], "Arial", Font.PLAIN, 20, 72,79,118,255,255,255);
        buttonAction(choiceButton_1, data);
        choiceButton_2 = createButton(25,300, 950, 50, data[2], "Arial", Font.PLAIN, 20, 72,79,118,255,255,255);
        buttonAction(choiceButton_2, data);
        choiceButton_3 = createButton(25,400, 950, 50, data[3], "Arial", Font.PLAIN, 20, 72,79,118,255,255,255);
        buttonAction(choiceButton_3, data);
        



        titleText = new JLabel("<html>"+
        " <h1 style=\"font-size:40px\">quiz" + 
        "<span style=\"color:#56C9AA\">ify</span>" + 
        "</h1>" +
        "</html>");
        
        mainPanel.setPreferredSize(new Dimension(defaultWidth, defaultHeight));
        mainPanel.setBackground(new Color(32, 40, 52));
        mainPanel.setLayout(null);
        
        questionPanel.setBounds(250,200, 1000, 500);
        questionPanel.setBackground(new Color(53, 65, 79));
        questionPanel.setLayout(null);

        questionBlock.setBounds(25  ,30, 950, 100);
        questionBlock.setBackground(new Color(33, 40, 52));
        questionBlock.setLayout(null);

        headerPanel.setBounds(0,0, defaultWidth, 100);
        headerPanel.setBackground(new Color(20,23,29));
        headerPanel.setLayout(null);
        
        homeButton = createButton(200, 30, 100, 50, "Home", "Arial", Font.PLAIN, 20, 0, 0, 0, 255, 255, 255);
        homeButton.setBorderPainted(false); 
        homeButton.setContentAreaFilled(false); 
        homeButton.setFocusPainted(false); 
        homeButton.setOpaque(false);
        
        aboutButton = createButton(300, 30, 100, 50, "About", "Arial", Font.PLAIN, 20, 0, 0, 0, 255, 255, 255);
        aboutButton.setBorderPainted(false); 
        aboutButton.setContentAreaFilled(false); 
        aboutButton.setFocusPainted(false); 
        aboutButton.setOpaque(false);
        
        titleText.setForeground(new Color(255, 255, 255));
        titleText.setBounds(30 , 5, 200, 80);

        footerPanel.setBounds(0,defaultHeight-100, defaultWidth, 100);
        footerPanel.setBackground(new Color(32,40,52));
        footerPanel.setLayout(null);
        
        copyrightText = createJLabel(620, 15, defaultWidth, 50, "Copyright © 2024 - Benedict Avenido", "Arial", Font.ITALIC, 15, 0, 0, 0, 255, 255, 255);
        
        footerPanel.add(copyrightText);
        
        questionBlock.add(questionLabel);
        
        questionPanel.add(questionBlock);
        questionPanel.add(choiceButton_1);
        questionPanel.add(choiceButton_2);
        questionPanel.add(choiceButton_3);
        
        headerPanel.add(titleText);
        headerPanel.add(homeButton);
        headerPanel.add(aboutButton);        
        
        mainPanel.add(headerPanel);
        mainPanel.add(footerPanel);
        mainPanel.add(questionPanel);
        
        
    }
    public void buttonAction(JButton button, String[] data){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                incrementNumber();
                setQuestionCard(questionLabel, choiceButton_1, choiceButton_2, choiceButton_3, data);
            }
            
        });
    }
    
    public void setQuestionCard(JLabel questionLabel, JButton choiceButton_1, JButton choiceButton_2, JButton choiceButton_3, String[] data){
        questionLabel.setText(data[0]);
        choiceButton_1.setText(data[1]);
        choiceButton_2.setText(data[2]);
        choiceButton_3.setText(data[3]);
    }

    public JButton createButton(int x, int y, int w, int h, String text , String fontFamily, int fontWeight, int fontSize, int r, int g, int b, int fr, int fg, int fb){
        JButton button = new JButton(text);
        button.setBounds(x, y,w, h);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setFocusable(false);
        button.setBackground(new Color(r, g, b));
        button.setForeground(new Color(fr, fg, fb));
        button.setFont(new Font(fontFamily, fontWeight, fontSize));
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        return button;
    }

    public JLabel createJLabel(int x, int y, int w, int h, String text , String fontFamily, int fontWeight, int fontSize, int r, int g, int b, int fr, int fg, int fb){
        JLabel label = new JLabel(text);
        label.setBounds(x, y,w, h);
        label.setBackground(new Color(r, g, b));
        label.setForeground(new Color(fr, fg, fb));
        label.setFont(new Font(fontFamily, fontWeight, fontSize));
        return label;
    }


   public JPanel getPanel(){
        return mainPanel;
   };
}

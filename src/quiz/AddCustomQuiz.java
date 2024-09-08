package quiz;

import java.awt.*;
import javax.swing.*;
import create_component.*;
import java.awt.event.*;
import pages.*;

public class AddCustomQuiz {
    private JPanel mainPanel, headerPanel, contentPanel, footerPanel, questionPanel, questionBlock;
    private JTextField questionField, choice_1_Field, choice_2_Field, choice_3_Field, answerField;
    private JLabel titleText, copyrightText;
    private JButton homeButton, achievementButton, addQuestionButton;

    public AddCustomQuiz(){
        initialize();
    }

    private void initialize(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int defaultWidth = (int) screenSize.getWidth();
        int defaultHeight = (int) screenSize.getHeight();

        mainPanel = new JPanel();
        headerPanel = new JPanel();
        contentPanel = new JPanel();
        footerPanel = new JPanel();
        questionPanel = new JPanel();
        questionBlock = new JPanel();
        questionField = Create_Component.TextField(0,0,950,100,255,255,255,"Arial", Font.BOLD, 20, 33,40,52);
        questionField.setText("(Add question here)");
        choice_1_Field = Create_Component.TextField(25,170,950,50,255,255,255,"Arial", Font.BOLD, 20, 33,40,52);
        choice_1_Field.setText("(Add choice here)");
        choice_2_Field = Create_Component.TextField(25,250,950,50,255,255,255,"Arial", Font.BOLD, 20, 33,40,52);
        choice_2_Field.setText("(Add choice here)");
        choice_3_Field = Create_Component.TextField(25,330,950,50,255,255,255,"Arial", Font.BOLD, 20, 33,40,52);
        choice_3_Field.setText("(Add choice here)");
        answerField= Create_Component.TextField(25,410,950,50,255,255,255,"Arial", Font.BOLD, 20, 33,40,52);
        answerField.setText("(Add answer here)");

        
        titleText = new JLabel("<html>"+
        " <h1 style=\"font-size:40px\">quiz" + 
        "<span style=\"color:#56C9AA\">ify</span>" + 
        "</h1>" +
        "</html>");
        
        mainPanel.setPreferredSize(new Dimension(defaultWidth, defaultHeight));
        mainPanel.setBackground(new Color(32, 40, 52));
        mainPanel.setLayout(null);

        questionPanel.setBounds(250,150, 1000, 500);
        questionPanel.setBackground(new Color(53, 65, 79));
        questionPanel.setLayout(null);
        
        questionBlock.setBounds(25  ,30, 950, 100);
        questionBlock.setBackground(new Color(33, 40, 52));
        questionBlock.setLayout(null);
        
        headerPanel.setBounds(0,0, defaultWidth, 100);
        headerPanel.setBackground(new Color(20,23,29));
        headerPanel.setLayout(null);
        
        homeButton = Create_Component.Button(200, 30, 100, 50, "Home", "Arial", Font.PLAIN, 20, 0, 0, 0, 255, 255, 255);
        homeButton.setBorderPainted(false); 
        homeButton.setContentAreaFilled(false); 
        homeButton.setFocusPainted(false); 
        homeButton.setOpaque(false);
        buttonAction(homeButton, "home");
        
        achievementButton = Create_Component.Button(270, 30, 200, 50, "Achievements", "Arial", Font.PLAIN, 20, 0, 0, 0, 255, 255, 255);
        achievementButton.setBorderPainted(false); 
        achievementButton.setContentAreaFilled(false); 
        achievementButton.setFocusPainted(false); 
        achievementButton.setOpaque(false);
        buttonAction(achievementButton, "achievements");

        addQuestionButton = Create_Component.Button(650, 670, 200, 30, "Add Question", "Arial", Font.PLAIN, 20, 53, 65, 79, 255, 255, 255);
        buttonAction(addQuestionButton, "addQuestion");
        
        titleText.setForeground(new Color(255, 255, 255));
        titleText.setBounds(30 , 5, 200, 80);
        
        headerPanel.add(titleText);
        headerPanel.add(homeButton);
        headerPanel.add(achievementButton);
        
        contentPanel.setBounds(0,100, defaultWidth, defaultHeight-100);
        contentPanel.setBackground(new Color(32, 40 , 52));
        contentPanel.setLayout(null);

        footerPanel.setBounds(0,defaultHeight-100, defaultWidth, 100);
        footerPanel.setBackground(new Color(32,40,52));
        footerPanel.setLayout(null);

        copyrightText = Create_Component.Label(620, 15, defaultWidth, 50, "Copyright © 2024 - Benedict Avenido", "Arial", Font.ITALIC, 15, 0, 0, 0, 255, 255, 255);

        footerPanel.add(copyrightText);
        
        questionBlock.add(questionField);
        questionPanel.add(questionBlock);
        questionPanel.add(choice_1_Field);
        questionPanel.add(choice_2_Field);
        questionPanel.add(choice_3_Field);
        questionPanel.add(answerField);
        mainPanel.add(addQuestionButton);
        mainPanel.add(headerPanel);
        mainPanel.add(footerPanel);
        mainPanel.add(questionPanel);
        
    }

    public JPanel getPanel(){
        return mainPanel;
    }
    public void buttonAction(JButton button, String subject){
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(subject.equals("addQuestion")){
                    CustomQuestions.addQuestion(questionField.getText(), choice_1_Field.getText(), choice_2_Field.getText(), choice_3_Field.getText(), answerField.getText());
                }
                if(subject.equals("addQuestion") && CustomQuestions.getSize() == 10){
                    PageControl.showHome();
                    return;
                }
                if(subject.equals("home")){
                    PageControl.showHome();
                    return;
                }
                if(subject.equals("achievements")){
                    PageControl.showAchievements();
                    return;
                }
            }
        });
    }
}
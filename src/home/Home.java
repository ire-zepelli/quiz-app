package home;

import javax.swing.*;

import create_component.Create_Component;
import pages.PageControl;
import quiz.CustomQuestions;
import stats.Stats;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {
    private JPanel mainPanel, headerPanel, contentPanel, footerPanel;
    private JPanel mathStatus, englishStatus, historyStatus, itStatus, popStatus, scienceStatus, customStatus;
    private JButton homeButton, achievementButton, mathButton, scienceButton, englishButton, historyButton, popButton, itButton, customButton;
    private JLabel titleText, largeText, smallText, copyrightText;
    
    public Home(){
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
        
        mathStatus = Create_Component.StatusBar(Stats.math, 25, 530);
        scienceStatus = Create_Component.StatusBar(Stats.science,242, 530);
        englishStatus = Create_Component.StatusBar(Stats.english,460, 530);
        historyStatus = Create_Component.StatusBar(Stats.history,678, 530);
        popStatus = Create_Component.StatusBar(Stats.pop,896, 530);
        itStatus = Create_Component.StatusBar(Stats.it,1114, 530);
        if(CustomQuestions.getSize() == 10){
            customStatus = Create_Component.StatusBar(Stats.custom,1332, 530);
            contentPanel.add(customStatus);
        }
        
        contentPanel.add(mathStatus);
        contentPanel.add(scienceStatus);
        contentPanel.add(englishStatus);
        contentPanel.add(historyStatus);
        contentPanel.add(popStatus);
        contentPanel.add(itStatus);
        
        titleText = new JLabel("<html>"+
        " <h1 style=\"font-size:40px\">quiz" + 
        "<span style=\"color:#56C9AA\">ify</span>" + 
        "</h1>" +
        "</html>");
        
        mainPanel.setPreferredSize(new Dimension(defaultWidth, defaultHeight));
        mainPanel.setBackground(new Color(32, 40, 52));
        mainPanel.setLayout(null);
        
        headerPanel.setBounds(0,0, defaultWidth, 100);
        headerPanel.setBackground(new Color(20,23,29));
        headerPanel.setLayout(null);
        
        homeButton = createButton(200, 30, 100, 50, "Home", "Arial", Font.PLAIN, 20, 0, 0, 0, 86, 201, 170);
        homeButton.setBorderPainted(false); 
        homeButton.setContentAreaFilled(false); 
        homeButton.setFocusPainted(false); 
        homeButton.setOpaque(false);
        buttonAction(homeButton, "home");
        
        achievementButton = createButton(270, 30, 200, 50, "Achievements", "Arial", Font.PLAIN, 20, 0, 0, 0, 255, 255, 255);
        achievementButton.setBorderPainted(false); 
        achievementButton.setContentAreaFilled(false); 
        achievementButton.setFocusPainted(false); 
        achievementButton.setOpaque(false);
        buttonAction(achievementButton, "achievements");
        
        titleText.setForeground(new Color(255, 255, 255));
        titleText.setBounds(30 , 5, 200, 80);
        
        headerPanel.add(titleText);
        headerPanel.add(homeButton);
        headerPanel.add(achievementButton);
        
        contentPanel.setBounds(0,100, defaultWidth, defaultHeight-100);
        contentPanel.setBackground(new Color(32, 40 , 52));
        contentPanel.setLayout(null);

        mathButton = createButton(17,250, 200,300,"Math", "Arial", Font.PLAIN, 20, 0, 0, 0 , 255, 255, 255);
        buttonAction(mathButton, "math");
        scienceButton = createButton(234,250, 200,300,"Science", "Arial", Font.PLAIN, 20, 0, 0, 0 , 255, 255, 255);
        buttonAction(scienceButton, "science");
        englishButton = createButton(451,250, 200,300,"English", "Arial", Font.PLAIN, 20, 0, 0, 0 , 255, 255, 255);
        buttonAction(englishButton, "english");
        historyButton= createButton(668,250, 200,300,"History", "Arial", Font.PLAIN, 20, 0, 0, 0 , 255, 255, 255);
        buttonAction(historyButton, "history");
        popButton = createButton(885,250, 200,300,"Pop Culture", "Arial", Font.PLAIN, 20, 0, 0, 0 , 255, 255, 255);
        buttonAction(popButton, "pop");
        itButton = createButton(1102,250, 200,300,"I.T.", "Arial", Font.PLAIN, 20, 0, 0, 0 , 255, 255, 255);
        buttonAction(itButton, "it");
        customButton = createButton(1319,250, 200,300,"Custom Topic", "Arial", Font.PLAIN, 20, 0, 0, 0 , 255, 255, 255); 
        buttonAction(customButton, "custom");

        String quote = "<html><p style=\"text-align: center\">In all the splendor of solitude... it is a test of myself, <br/> and one thing I loathe is to have to test myself in front of other people.</p></html>";
        
        largeText = createJLabel(530,30, 500,100, "<html>SELECT <span style=\"color:#56C9AA\">QUIZ</span> TO ANSWER</html>", "Arial", Font.BOLD, 35, 0,0,0,255,255,255);
        smallText = createJLabel(400, 100, defaultWidth-200, 100, quote, "Arial", Font.PLAIN, 25, 0, 0, 0, 255, 255, 255 );

        footerPanel.setBounds(0,defaultHeight-100, defaultWidth, 100);
        footerPanel.setBackground(new Color(32,40,52));
        footerPanel.setLayout(null);

        copyrightText = createJLabel(620, 15, defaultWidth, 50, "Copyright © 2024 - Benedict Avenido", "Arial", Font.ITALIC, 15, 0, 0, 0, 255, 255, 255);

        contentPanel.add(largeText);
        contentPanel.add(smallText);
        contentPanel.add(mathButton);
        contentPanel.add(scienceButton);
        contentPanel.add(englishButton);
        contentPanel.add(historyButton);
        contentPanel.add(popButton);
        contentPanel.add(itButton);
        contentPanel.add(customButton);

        footerPanel.add(copyrightText);
        
        mainPanel.add(headerPanel);
        mainPanel.add(footerPanel);
        mainPanel.add(contentPanel);
        
    }

    public JPanel getPanel(){
        return mainPanel;
    }

    public void buttonAction(JButton button, String subject){
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(subject.equals("home")){
                    PageControl.showHome();
                    return;
                }
                if(subject.equals("achievements")){
                    System.out.println(subject);
                    PageControl.showAchievements();
                    return;
                }
                if(subject.equals("custom") && CustomQuestions.getSize() != 10){
                    PageControl.showAddCustomQuiz();
                    return;
                }
                PageControl.showQuiz(subject);
            }
            
        });
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
}

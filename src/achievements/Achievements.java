package achievements;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import create_component.*;
import java.awt.event.*;
import pages.PageControl;
import stats.Stats;

public class Achievements {
   private JPanel mainPanel, headerPanel, footerPanel, contentPanel, achievementPanel, mathWizard, elonMusk, englisera, veteran, techSupport, omniscient, popstar; 
   private JLabel titleText, copyrightText;
   private JScrollPane contentScrollPane;
   private JButton homeButton, achievementButton;

    public Achievements(){
       initialize();
    }

    private void initialize(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int defaultWidth = (int) screenSize.getWidth();
        int defaultHeight = (int) screenSize.getHeight();

        mainPanel = new JPanel();
        headerPanel = new JPanel();
        contentPanel = new JPanel();
        achievementPanel = new JPanel();
        contentScrollPane = new JScrollPane(achievementPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        footerPanel = new JPanel();

        achievementPanel.setBackground(Color.yellow);
        achievementPanel.setLayout(new BoxLayout(achievementPanel, BoxLayout.Y_AXIS));
        achievementPanel.setSize(900,1000);

        mathWizard = AchievementBar.create("public/math_wizard.jpg", "The Math Wizard", "Pure mathematics is, in its way, the poetry of logical ideas. Get a perfect score in Math.");
        elonMusk = AchievementBar.create("public/elon_musk.jpg", "Elon Musk", "You are now ready to go to mars!!!! Get a perfect score in Science.");
        englisera = AchievementBar.create("public/englisera.jpg", "The Englisera", "Dont call me a SIR! Get a perfect score in English.");
        veteran = AchievementBar.create("public/veteran.jpg", "The Veteran", "Those who don't know history are doomed to repeat it. Get a perfect score in History.");
        techSupport = AchievementBar.create("public/tech_support.jpg", "Tech Support Guy", "\"HELLO UR COMPUTER HAS A VIRUS\". Get a perfect score in IT.");
        omniscient = AchievementBar.create("public/omniscient.jpg", "The Omniscient", "I am ... cogito ergo sum ... I think, therefore I am. Get a perfect score in all Quizzes");
        popstar = AchievementBar.create("public/pop_star.jpg", "The Pop Star", "Babyyy babbyy babbyyy oOOHHHhh. Get a perfect score in Pop.");;


        checkAchievements(achievementPanel);


        contentScrollPane.setBounds(300, 200, 920, 500);
        contentScrollPane.setBorder(new EmptyBorder(new Insets(0, 0, 0, 0)));

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

        homeButton = Create_Component.Button(200, 30, 100, 50, "Home", "Arial", Font.PLAIN, 20, 0, 0, 0, 255, 255, 255);
        homeButton.setBorderPainted(false); 
        homeButton.setContentAreaFilled(false); 
        homeButton.setFocusPainted(false); 
        homeButton.setOpaque(false);
        buttonAction(homeButton, "home");
        
        achievementButton = Create_Component.Button(270, 30, 200, 50, "Achievements", "Arial", Font.PLAIN, 20, 0, 0, 0, 86, 201, 170);
        achievementButton.setBorderPainted(false); 
        achievementButton.setContentAreaFilled(false); 
        achievementButton.setFocusPainted(false); 
        achievementButton.setOpaque(false);
        buttonAction(achievementButton, "achievements");
        
        titleText.setForeground(new Color(255, 255, 255));
        titleText.setBounds(30 , 5, 200, 80);
        
        contentPanel.setBounds(0,0, defaultWidth, defaultHeight-100);
        contentPanel.setBackground(new Color(32, 40 , 52));
        contentPanel.setLayout(null);
        
        contentPanel.add(contentScrollPane);

        headerPanel.add(titleText);
        headerPanel.add(homeButton);
        headerPanel.add(achievementButton);

        footerPanel.setBounds(0, defaultHeight-100, defaultWidth, 100);
        footerPanel.setBackground(new Color(32,40,52));
        footerPanel.setLayout(null);


        copyrightText = Create_Component.Label(620, 15, defaultWidth, 50, "Copyright © 2024 - Benedict Avenido", "Arial", Font.ITALIC, 15, 0, 0, 0, 255, 255, 255);

        footerPanel.add(copyrightText);

        mainPanel.add(headerPanel);
        mainPanel.add(footerPanel);
        mainPanel.add(contentPanel);
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
                    PageControl.showAchievements();
                    return;
                }
                PageControl.showQuiz(subject);
            }
            
        });
    }

        public JPanel getPanel(){
            return mainPanel;
        }

    public void checkAchievements(JPanel achievementPanel){
        boolean noAchievement = true;
        if(Stats.math == 10){
            achievementPanel.add(mathWizard);
            noAchievement =false;
        } 
        if(Stats.science == 10){
            achievementPanel.add(elonMusk);
            noAchievement =false;
        } 
        if(Stats.history == 10){
            achievementPanel.add(veteran);
            noAchievement =false;
        } 
        if(Stats.english == 10){
            achievementPanel.add(englisera);
            noAchievement =false;
        } 
        if(Stats.it == 10){
            achievementPanel.add(techSupport);
            noAchievement =false;
        } 
        if(Stats.pop == 10){
            achievementPanel.add(popstar);
            noAchievement =false;
        }

        if(isPerfect())
        achievementPanel.add(omniscient);

        if(noAchievement){
            JPanel playToEarnAchievement = AchievementBar.create("public/nerd_emoji.png", "No Achievements Found", "Answer quizzes to earn achievements.");
            achievementPanel.add(playToEarnAchievement);
        }
    }

    public boolean isPerfect(){
        if(Stats.math == 10 && Stats.science == 10 && Stats.history == 10 && Stats.english == 10 && Stats.english == 10 && Stats.it == 10 && Stats.pop == 10) return true;
        return false;
    }
}

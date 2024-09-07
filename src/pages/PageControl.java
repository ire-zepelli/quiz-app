package pages;

import javax.swing.*;
import java.awt.*;
import auth.*;
import home.*;
import quiz.Quiz;
import achievements.*;

public class PageControl {
    JFrame frame = new JFrame();
    static JPanel panelCont = new JPanel();
    static CardLayout pages = new CardLayout();
    Auth auth =  new Auth();
    static Home home;
    static Quiz quiz;
    static Achievements achievements;


    public PageControl(){
        initialize();
    }


    public void initialize(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int defaultWidth = (int ) screenSize.getWidth();
        int defaultHeight = (int) screenSize.getHeight();

        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(new Dimension(defaultWidth, defaultHeight));
        frame.getContentPane().setBackground(new Color(20, 23, 29));
        
        panelCont.setLayout(pages);
        panelCont.add(auth.getPanel(), "auth");
        
        frame.add(panelCont);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        showAchievements();
    }
    
    public static void showAuth(){
        pages.show(panelCont, "auth");
    }
    
    public static void showHome(){
        home = new Home();
        panelCont.add(home.getPanel(), "home");
        pages.show(panelCont, "home");
    }

    public static void showQuiz(String subject){
        quiz = new Quiz(subject);
        panelCont.add(quiz.getPanel(), "quiz");
        pages.show(panelCont, "quiz");
    }

    public static void showAchievements(){
        achievements = new Achievements();
        panelCont.add(achievements.getPanel(), "achievements");
        pages.show(panelCont, "achievements");
    }
}

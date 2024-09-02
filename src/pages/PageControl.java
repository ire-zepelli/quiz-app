package pages;

import javax.swing.*;
import java.awt.*;
import auth.*;
import home.*;
import quiz.Quiz;

public class PageControl {
    JFrame frame = new JFrame();
    static JPanel panelCont = new JPanel();
    static CardLayout pages = new CardLayout();
    Auth auth =  new Auth();
    Home home = new Home();
    static Quiz quiz;

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
        panelCont.add(home.getPanel(), "home");

        frame.add(panelCont);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    public static void showAuth(){
        pages.show(panelCont, "auth");
    }

    public static void showHome(){
        pages.show(panelCont, "home");
    }

    public static void showQuiz(String subject){
        quiz = new Quiz(subject);
        panelCont.add(quiz.getPanel(), "quiz");
        pages.show(panelCont, "quiz");
    }
}

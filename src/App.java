import javax.swing.SwingUtilities;
import auth.*;
import pages.PageControl;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
               PageControl pages = new PageControl(); 
            }
        });
    }
}
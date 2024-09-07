package achievements;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import create_component.*;

public class AchievementBar {
   public static JPanel create(String imgPath, String titleText, String descText){
    JPanel barContainer = new JPanel();
    JLabel title = Create_Component.Label(100, 5, 300, 30, titleText, "Arial", Font.BOLD, 20, 255, 255, 255, 86,201,170);
    JLabel desc = Create_Component.Label(100, 45, 900, 30, descText, "Arial", Font.PLAIN, 20, 255, 255, 255, 255, 255, 255);
    JPanel icon = createImagePanel(imgPath, 5,5, 80,80);
    JPanel bar = Create_Component.Panel(5,5, 890, 90, 53,65,79, 255, 53,65,79, 255, 10);
    bar.setLayout(null);

    bar.add(icon);
    bar.add(title);
    bar.add(desc);
    
    barContainer.setPreferredSize(new Dimension(900, 100));
    barContainer.setBackground(new Color(32,40,52));
    barContainer.setBorder(new EmptyBorder(new Insets(100, 150, 100, 150)));
    barContainer.setLayout(null);
    barContainer.add(bar);

    return barContainer;
   }

    public static JPanel createImagePanel(String imagePath, int x, int y, int w, int h)
    {
 
        JPanel panel = new JPanel(){
            Image image;
            {
                
                try{
                    image = ImageIO.read(new File(imagePath));
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            @Override
            protected void paintComponent(Graphics graphics)
            {
                super.paintComponent(graphics);
                if(image!= null)
                {
                    graphics.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };

        panel.setBounds(x,y,w,h);
        panel.setOpaque(false);
        return panel;
    }
}

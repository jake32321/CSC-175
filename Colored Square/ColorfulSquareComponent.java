/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mycoloredsquare;

import java.awt.*;
import javax.swing.JComponent;

/**
 *
 * @author Jacob
 */
public class ColorfulSquareComponent extends JComponent {
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Color shade = new Color(100,100,0);
        shade = shade.brighter();
        g2.setColor(shade);
        
        
        Rectangle square = new Rectangle(100,100,600,600);
        g2.fill(square);
        
        g2.setColor(Color.BLACK);
        g2.drawString("Red Amount: "+shade.getRed(), 100,50);
        g2.drawString("Blue Amount: "+shade.getBlue(), 100, 70);
        g2.drawString("Green Amount: "+shade.getGreen(), 100, 90);
        g2.drawString("Color: "+shade, 100, 110);
        
    }
}

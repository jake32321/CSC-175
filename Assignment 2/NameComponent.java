/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nameviewer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author Jacob J. Reed
 */
public class NameComponent extends JComponent {
    
    public void paintComponent(Graphics g)
    {        
        //Draws the blue box
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(50, 200, 200, 200);
        g2.setColor(Color.BLUE);
        g2.fill(box);
        
        //Draws the String = my full name
        g2.setColor(Color.WHITE);
        g2.drawString("Jacob Joseph Reed", 100, 300);
        
 
    }
}

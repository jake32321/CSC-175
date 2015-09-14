/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stoplightpicture;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

/**
 *
 * @author Jacob
 */
public class LightComponent extends JComponent {
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle lightBox1 = new Rectangle(150,100,100,200); 
        //draws light box 
        g2.draw(lightBox1);
        g2.fill(lightBox1);
        
        
        
        Ellipse2D.Double e1 = new Ellipse2D.Double(170,120,50,50);
        Ellipse2D.Double e2 = new Ellipse2D.Double(170,190,50,50);
        Ellipse2D.Double e3 = new Ellipse2D.Double(170,250,50,50);
        
        g2.setColor(Color.RED);
        g2.fill(e1);
        g2.draw(e1);
        
        g2.setColor(Color.YELLOW);
        g2.fill(e2);
        g2.draw(e2);
       
        g2.setColor(Color.GREEN);
        g2.fill(e3);
        g2.draw(e3);
        
    }
}

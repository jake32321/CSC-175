/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package digitsincircles;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;
import javax.swing.JComponent;

/**
 *
 * @author Jacob
 */
public class PictureComponent extends JComponent {
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        //draws upper circle
        Ellipse2D.Double upLeftCircle = 
                new Ellipse2D.Double(0,25,50,50);
        g2.draw(upLeftCircle);
        //draws lower circle
        Ellipse2D.Double lowerRightCircle = 
                new Ellipse2D.Double(50,75,50,50);
        g2.draw(lowerRightCircle);
        
        Random generator = new Random();
        int num1, num2;
        num1 = generator.nextInt(10);
        num2 = generator.nextInt(10);
        
        g2.drawString(""+num1,25,50);
        g2.drawString(""+num2,75,100);
        
    }
    
}

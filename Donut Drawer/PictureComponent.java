/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package donutdrawer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author Jacob
 */
public class PictureComponent extends JComponent{
    
        public void paintComponent(Graphics g)
        {
            Graphics2D g2 = (Graphics2D) g;
            
            Donut a = new Donut(Color.GREEN, 50, 50);
            Donut b = new Donut(Color.RED, 200, 100);
            Donut c = new Donut(100, 150);
            
            a.draw(g2);
            b.draw(g2);
            c.draw(g2);
        }
    
}

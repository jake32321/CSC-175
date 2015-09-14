/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package donutdrawer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Jacob
 */
public class Donut {
    
   private Color tint;
   private int x, y;
   
   public Donut(Color c, int xStart, int yStart)
   {
       tint = c;
       x = xStart;
       y = yStart;
   }
   
   //This is the default class.
   public Donut(int xStart, int yStart)
   {
       tint = Color.BLACK;
       x = xStart;
       y = yStart;
   }
   
   public void draw(Graphics2D g2)
   {
       g2.setColor(tint);
       Ellipse2D.Double outer = new Ellipse2D.Double(x, y, 50, 50);
       g2.fill(outer);
       
       g2.setColor(Color.WHITE);
       Ellipse2D.Double inner = new Ellipse2D.Double(x+15, y+15, 20, 20);
       g2.fill(inner);
   }
   
   public int getX()
   {
       return x;
   }
    
   public int getY()
   {
       return y;
   }
   
   public void changeColor(Color newShade)
   {
       tint = newShade;
   }
   
   
}

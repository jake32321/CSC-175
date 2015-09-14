/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starviewer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 *
 * @author Jacob J Reed
 */
public class Star {
    
    private Color starColor;
    private int length, position;
    
    
    public Star(Color c, int pos, int len)
    {
        starColor = c;
        length = len;
        position = pos;
    }
    
    public void draw(Graphics2D g2)
    {
        //make the lines of the star
        Line2D.Double lineVerticle = new Line2D.Double(position+(length/2),
                position+length,
                position+(length/2),position);
        g2.setColor(starColor);
        g2.draw(lineVerticle);
        
        Line2D.Double lineHorizontal = new Line2D.Double(position+length,
                position+(length/2)
                ,position,position+(length/2));
        g2.setColor(starColor);
        g2.draw(lineHorizontal);
        
        Line2D.Double negSlope = new Line2D.Double(position+length,position,
                position,position+length);
        g2.setColor(starColor);
        g2.draw(negSlope);
        
        Line2D.Double posSlope = new Line2D.Double(position,position,
                position+length,position+length);
        g2.setColor(starColor);
        g2.draw(posSlope);
      
    }
}

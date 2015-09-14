/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starviewer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 *
 * @author Jacob J Reed
 */
public class StarComponent extends JComponent{
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        Star starOne = new Star(Color.BLUE,30,30);
        starOne.draw(g2);

        Star starTwo = new Star(Color.RED,200,200);
        starTwo.draw(g2);

        Star starThree = new Star(Color.GREEN,400,400);
        starThree.draw(g2);


    }
}   


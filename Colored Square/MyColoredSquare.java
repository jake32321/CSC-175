/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mycoloredsquare;

import javax.swing.JFrame;

/**
 *
 * @author Jacob
 */
public class MyColoredSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       JFrame myFrame = new JFrame("Behold...My Square!");
       myFrame.setVisible(true);
       myFrame.setSize(800,800);
       
       ColorfulSquareComponent Comp = 
               new ColorfulSquareComponent();
       myFrame.add(Comp);
       
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

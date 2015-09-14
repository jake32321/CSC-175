/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangletester;

import javax.swing.*;

/**
 *
 * @author Jacob
 */
public class RectangleTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello there, "+name+"!");
        
       String x = JOptionPane.showInputDialog("What is the first X coordinate "
               + "of the rectangle?");
       double myx = Double.parseDouble(x);
       
       String y = JOptionPane.showInputDialog("What is the first Y coordinate"
                + " of the rectangle?");
       double myy = Double.parseDouble(y);
        
        Rectangle shape = new Rectangle(myx,myy,5.0,3.5,1.3,4.8,9.2,7.5);
        
        JOptionPane.showMessageDialog(null, "The length of the first side of"
                + " your shape is: "+shape.getSideOne());
        
    }
}

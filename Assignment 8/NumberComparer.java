/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numbercomparer;

import javax.swing.JOptionPane;

/**
 *
 * @author Jacob Reed
 */
public class NumberComparer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1, num2, num3;
        
        String prompt = JOptionPane.showInputDialog("Type a number...");
        num1 = Integer.parseInt(prompt);
        
        String prompt2 = JOptionPane.showInputDialog("Type a second "
                + "number...");
        num2 = Integer.parseInt(prompt2);
        
        String prompt3 = JOptionPane.showInputDialog("Type a third number");
        num3 = Integer.parseInt(prompt3);
        
        if (num1 == num2&&num1 == num3)
            JOptionPane.showMessageDialog(null, "The numbers are all the "
                    + "same.");
        else if (num1 != num2&&num1 != num3)
            JOptionPane.showMessageDialog(null, "The numbers are all "
                    + "different from each other.");
        else 
            JOptionPane.showMessageDialog(null, "The numbers are neither "
                    + "equal to each other or all different.");
    }
}

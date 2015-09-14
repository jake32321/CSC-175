/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package phonenumberformatter;

import javax.swing.JOptionPane;

/**
 *
 * @author Jacob Reed
 */
public class PhoneNumberFormatter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JOptionPane promptWindow = new JOptionPane();
        
        String number;
        number = promptWindow.showInputDialog("Enter a ten digit number to be "
                + "converted");
        
        System.out.println("("+number.substring(0, 3)+")"+" "+
                number.substring(3,6)+"-"+number.substring(6,10));
        
        
        
    }
}

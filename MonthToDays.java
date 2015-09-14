/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monthtodays;

import javax.swing.JOptionPane;

/**
 *
 * @author Jacob
 */
public class MonthToDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int monthNum;
        int days;
        
        String input = JOptionPane.showInputDialog("Enter the number of a"
                + " month");
        
        monthNum = Integer.parseInt(input);
        
        //nested if else statements
       if (monthNum == 2)
           days = 28;
       else if (monthNum == 4||monthNum == 6||monthNum == 9||monthNum == 11)
           days = 30;
       else 
           days = 31;
       
       JOptionPane.showMessageDialog(null, "The number of days in month "
               +monthNum+" is "+days);
    }
}

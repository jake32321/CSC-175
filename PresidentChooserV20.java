/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presidentchooserv2.pkg0;

import javax.swing.JOptionPane;

/**
 *
 * @author Jacob
 */
public class PresidentChooserV20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int year;
    String presidentName;
    
    String input = JOptionPane.showInputDialog("Enter a year since "
            + " 1980");
    
    //converts text to number format.
    year = Integer.parseInt(input); 
    
    //the code below is the same as the nested structure.
    if (year <= 1987)
      presidentName = "Reagan";
    //else if statements.
    else if (year <= 1991)
      presidentName = "Bush Sr.";
    else if (year <= 1999)
      presidentName = "Clinton";
    else if (year <= 2007)
      presidentName = "Bush Jr.";
    else if (year <= 2013)
      presidentName = "Obama";
    else 
      presidentName = "Error. Year has yet to occur!";
    
    JOptionPane.showMessageDialog(null, "The president in year "+year+
            " was named: "+presidentName);
    
    
    }
}

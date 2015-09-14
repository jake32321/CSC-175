/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringoperations;

import javax.swing.JOptionPane;

/**
 *
 * @author Jacob
 */
public class StringOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int userChoice;

        String word1 = JOptionPane.showInputDialog("Please enter a word "
                + "to be compared.");
        String word2 = JOptionPane.showInputDialog("Please enter a second"
                + " word to be compared to the first.");
        
        String userInput = JOptionPane.showInputDialog("Enter the number of the"
                + " thing you would wish to do with these words. \n1-Compare "
                + "\n2-Count \n3-Find number of 'A'");
        
        userChoice = Integer.parseInt(userInput);
        
        if (userChoice == 1)
        {
            int result = word1.compareTo(word2);
            if (result < 0)
            {
                JOptionPane.showMessageDialog(null, word1+" comes before"
                        + "word "+word2);
            }
            else if (result > 0)
            {
                JOptionPane.showMessageDialog(null, word2+" comes before "
                        +word1);
            }
            else 
            {
                JOptionPane.showMessageDialog(null, word1+" is the same as "
                        +word2);
            }
        }
        if (userChoice == 2)
        {
            int letterTotal = word1.length()+word2.length();
            JOptionPane.showMessageDialog(null, "The total number of "
                    + "caharacters in both words is: "+letterTotal);
        }
        else
        {
            int word1Find = word1.indexOf("a");
            int word2Find = word2.indexOf("a");
            
            if (word1Find >= 0||word2Find >= 0)
            {
                JOptionPane.showMessageDialog(null, "There were some 'A' in"
                        + " those words.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "There were not any 'A' in"
                        + " those words.");
            }
        }
    }
}

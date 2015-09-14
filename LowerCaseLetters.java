/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lowercaseletters;

import java.util.Scanner;

/**
 *
 * @author jreed9632
 */
public class LowerCaseLetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String usrWrd;
        int lwrCount = 0;
        
        System.out.println("Please entere a string to be evaluated...");
        usrWrd = in.nextLine();
        
        
        
        for (int count = 0; count < usrWrd.length(); count++)
        {
           char letter = usrWrd.charAt(count);
           int code = (int) letter;
           
           if (code >= 97 && code <= 122)
               lwrCount++;
        }
        
        System.out.println("The number of lower case characters in: '"+usrWrd
                           +"' is "+lwrCount+".");
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grandparent;

import java.util.Scanner;

/**
 *
 * @author Jacob
 */
public class Grandparent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] grandparents = new String[4];
        Scanner in = new Scanner(System.in);
        String usrWrd;
        int spcCount = 0;
        char letter;
        
        for (int count = 0; count < grandparents.length; count++)
        {
            System.out.println("Grandparent #"+(count+1)+"??? --->");
            usrWrd = in.nextLine();
            grandparents[count] = usrWrd;
            for (int cnt = 0; cnt < usrWrd.length(); cnt++)
            {
                letter = usrWrd.charAt(cnt);
                int code = (int) letter;
           
                if (code == 32)
                    spcCount++;
            }
        }
        for (String person : grandparents)
        {
            System.out.println("Grandparent Name: "+person);
        }
        
        System.out.println("There were: "+spcCount+" spaces.");
    }
}

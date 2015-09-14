/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tempchecker;

import java.util.Scanner;

/**
 *
 * @author Jacob
 */
public class TempChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double absZero = -459.67;
        double matterTemp = 0;
        
        Scanner prompt = new Scanner(System.in);
        
        while (matterTemp >= absZero)
        {
            System.out.println("Please enter the temperature of the matter "
                    + "(in fahrenheit): ");
            matterTemp = prompt.nextDouble();
            
            if (matterTemp <= 32)
                System.out.println("Solid");
            if (matterTemp > 32&& matterTemp < 212)
                System.out.println("Liquid");
            if (matterTemp >= 212)
                System.out.println("Gas");
        }
        
        
        
    }
}

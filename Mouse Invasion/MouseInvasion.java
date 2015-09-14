/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseinvasion;

import java.util.Scanner;

/**
 *
 * @author Jacob Reed
 */
public class MouseInvasion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int mouseCnt = 12;
        int numSeasons;
        Scanner in = new Scanner(System.in);
        
        System.out.println("How many seasons have there been so far?");
        numSeasons = in.nextInt();
        
        for (int i = 0;i < numSeasons; i++)
            mouseCnt = (mouseCnt*3) - 10;
        
        System.out.println("After "+numSeasons+" there are "
                +mouseCnt+" mice.");
    }
}

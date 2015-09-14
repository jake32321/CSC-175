/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1120;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jacob Reed
 */
public class Quiz1120 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Question 1
        int[] randomVals = new int[100];
        
        //Question 2
        Random gen = new Random();
        
        for (int count = 0; count < randomVals.length; count++)
        {
            randomVals[count] = gen.nextInt(10)+1;
        }
        
        //Question 3
        int total = 0;
        int avg;
        
        for (int number : randomVals)
        {
            total = total + number; 
        }
        
        avg = total/100;
        
        System.out.println("The average of the values is: "+avg);
        
        //Question 4
        String[] states = new String[50];
        
        //Question 5
        Scanner in = new Scanner(System.in);
        
        for (int count = 0; count < states.length; count++)
        {
            System.out.println("Please enter a state to be stored");
            states[count] = in.nextLine();
        }
    }
}
//Jacob Reed 
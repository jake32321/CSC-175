/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

import java.util.Scanner;

/**
 *
 * @author Jacob Reed
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] evens = new int[12];
        int index = 0;
        
        for (int count = 8; count >= -14; count--)
        {
            if (count%2==0)
            {
                evens[index] = count;
                index++;
            }
        }
        
        Scanner in = new Scanner(System.in);
        int usrAnsw;
        int total = 0;
        String menu = "1-Double the value of a specific element\n2-Show all "
                + "element values\n3-Find and display the total of all the "
                + "array elements\n4-Quit the program";
        
        do
        {
            System.out.println("What would you like to do with this array of "
                    + "evens?");
            System.out.println(menu);
            usrAnsw = in.nextInt();
            
            if (usrAnsw == 1)
            {
                System.out.println("Which element of the array would you like"
                        + " to double?");
                usrAnsw = in.nextInt();
                evens[usrAnsw] = evens[usrAnsw]*2;
            }
            if (usrAnsw == 2)
            {
               for (int num : evens)
                   System.out.print(num+" ");
            }
            if (usrAnsw == 3)
            {
                for (int count = 0; count < 12; count++)
                    total = total + evens[count];
                System.out.println("Total: "+total);
            }
        }while(usrAnsw!=4);
    }
}

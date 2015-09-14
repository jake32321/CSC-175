/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package possitiveintegeradder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Jacob Reed
 */
public class PossitiveIntegerAdder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String filename = "data2.txt";
        int value = 0, sum = 0;
        int counter = 0;
        Scanner fileIn;
        
        try
        {
            //looks for the exception
            FileReader myFileReader = new FileReader(filename);
            fileIn = new Scanner(myFileReader);
        }
        catch(FileNotFoundException e)
        {
            //if it occurs this is what happens
            System.out.println("System could not find: "+filename);
            return;
        }

        do
        {
            value = fileIn.nextInt();   // read the next value from the file

            if (value >= 0)             // if it is +, add it to the sum
            {
                sum = sum + value;
                counter++;
            }
        } while (value >= 0);

        System.out.println("The sum of the positive values " +
                "in the file " + filename + " was: " + sum);
        System.out.println("A total of " + counter + " positive " +
                " values were read before a negative one was encountered");
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decnine;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jacob Reed
 */
public class DecNine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       try
       {
            PrintWriter pw = new PrintWriter("sortedData.txt");
            FileReader reader = new FileReader("data.txt");
            Scanner fileIn = new Scanner(reader);
            int[] nums = new int[10];
        
            for (int i = 0;i < nums.length;i++)
                nums[i] = fileIn.nextInt();
        
            Arrays.sort(nums);
        
            for (int i = 0;i<nums.length;i++)
            {
                pw.println(nums[i]);
            }
            pw.close();
       }
       
       catch (FileNotFoundException e)
       {
           System.out.println("File not found!");
       }
    }
}

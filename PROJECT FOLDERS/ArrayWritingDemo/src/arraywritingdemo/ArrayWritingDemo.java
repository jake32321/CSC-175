/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraywritingdemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author Jacob Reed
 */
public class ArrayWritingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        ArrayList<Integer> nums = new ArrayList<>();
        Random gen = new Random();
        
        PrintWriter printer = new PrintWriter("wedData.txt");
       
        for (int i = 0; i < 12; i++)
        {
            nums.add(gen.nextInt(100));
        }
        
        
        for (int i = 0; i < nums.size();i++)
            printer.println(nums.get(i));
        printer.close();
    }
}

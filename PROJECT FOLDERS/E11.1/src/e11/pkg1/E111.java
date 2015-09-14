/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package e11.pkg1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacob Reed
 */
public class E111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try
        {
            FileReader reader = new FileReader("hello.txt");
            PrintWriter pw = new PrintWriter("hello.txt");
            Scanner fileIn = new Scanner(reader);
            
            pw.println("Hello, World!");
            pw.close();
            
            System.out.println(fileIn.nextLine());
        }
        catch(FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Error: No such file was "
                    + "found or exists!");
        }
    }
}

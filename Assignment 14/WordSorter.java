/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wordsorter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Jacob Reed
 */
public class WordSorter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try
        {
            ArrayList<String> words = new ArrayList<>();
            PrintWriter pw = new PrintWriter("sortedData.txt");
            FileReader reader = new FileReader("data.txt");
            Scanner fileIn = new Scanner(reader);
            
            while(fileIn.hasNext())
                words.add(fileIn.next());
            
            Collections.sort(words);
                
            for(String place : words)
                pw.println(place);
            pw.close();
            
            System.out.println("There were "+words.size()+" words added to "
                    + "the file sortedData.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: Such a file was not found!");
        }
    }
}

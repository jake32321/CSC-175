/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filewriterandreader;

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
public class FileWriterAndReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try
        {
            FileReader reader = new FileReader("data.txt");
            Scanner fileIn = new Scanner(reader);
            PrintWriter pw = new PrintWriter("sortedData.txt");
            ArrayList<String> words = new ArrayList<>();
        
            while(fileIn.hasNext())
                words.add(fileIn.next());
        
            Collections.sort(words);
        
            for(int i = 0; i < words.size(); i++)
                pw.println(words.get(i));
            pw.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error: File does not exist!");
        }
    }
}

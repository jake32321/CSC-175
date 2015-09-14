/*
 *Java Program to write the first ten perefect cubes to a file 
 * called cubes.txt 
 */

/*
 * There are two twypes of exceptions. Checked and unchecked.
 * Unchecked are a program that might generate one of theses kinds of 
 * exceptions will still compile without the author needing to specificy 
 * how the exception will be handled. (EX. ArrayIndex Out Of Bounds) Unchecked 
 * are deemed more severe since a program might generate such an exception must
 * explicitely say how it will handle the exception or else the code will not 
 * even compile (EX. File Not Found Exception)
 */

package cubeswriter;

import java.io.*;

/**
 * @author Jacob Reed
 */
public class CubesWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException
    {
      PrintWriter myFileWriter = new PrintWriter("cubes.txt");
      for (int count = 1; count <= 10; count++)
          myFileWriter.println((int)Math.pow(count, 3));
      myFileWriter.close();
    }
}

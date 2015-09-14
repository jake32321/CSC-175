/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listdemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jacob Reed
 */
public class ListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       
        ArrayList<String> adjectives = new ArrayList<>();
        PrintWriter adj = new PrintWriter("words.txt");
        Scanner in = new Scanner(System.in);
        int usrAnsw, shrt = 0;
        String menu = "1-Enter an adjective\n2-Remove the first element"
                + "\n3-Count the number of adjective with 5 or fewer "
                + "caracters\n4-Store adjectives in 'word.txt'\n5-Quit";
        
        do
        {
            System.out.println("Which would you like to do?");
            System.out.println(menu);
            usrAnsw = in.nextInt();
            in.nextLine();
            
            if (usrAnsw == 1)
            {
                System.out.println("Please enter an adjective now...");
                adjectives.add(in.nextLine());
            }
            if (usrAnsw == 2)
            {
                System.out.println("Removing first element...");
                adjectives.remove(0);
            }
            if (usrAnsw == 3)
            {
                for (int count = 0; count < adjectives.size(); count++)
                {
                    if (adjectives.get(count).length()<=5)
                        shrt++;
                }
                System.out.println("The total is: "+shrt);
            }
            if (usrAnsw == 4)
            {
                for (int count = 0; count < adjectives.size(); count++)
                    adj.println(adjectives.get(count));
                adj.close();
            }
        }while (usrAnsw!=5);
        
    }
}

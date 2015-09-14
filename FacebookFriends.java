/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facebookfriends;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author LH1139
 */
public class FacebookFriends {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GregorianCalendar time = new GregorianCalendar();
        
        int currentYear = time.get(GregorianCalendar.YEAR);
        int currentMoment = time.get(GregorianCalendar.MINUTE);
        
        System.out.println("It is currently year: "+currentYear);
        System.out.println("It is "+currentMoment+" past the hour.");
        
        final int MAX_FRIENDS = 10;
        
        String[] names = new String[MAX_FRIENDS];
        int[] yearFriended = new int[MAX_FRIENDS];
        
        Scanner in = new Scanner(System.in);
        int answr;
        int friendCount = 0;
        
        do 
        {
            System.out.println("Please choose an option: \n1-Enter a new "
                    + "friends info.\n2-See all current friends info."
                    + "\n3-Quit");
            answr = in.nextInt();
            
            if (answr == 1)
            {
                if (friendCount < 10)
                {
                    in.nextLine(); //reads in the left over enter
                    System.out.println("Name of friend?");
                    names[friendCount] = in.nextLine();
                    System.out.println("Year friended?");
                    yearFriended[friendCount] = in.nextInt();
                    friendCount++;
                }
                else 
                    System.out.println("Sorry...You have reached the maximum"
                            + "friend count!");
            }
            
            if (answr == 2)
            {
                System.out.println("Here are your current friends: ");
                for (int count = 0; count < friendCount; count++)
                {
                    System.out.println(names[count]+" "+"Friended in: "
                            +yearFriended[count]);
                }
            }
        }while (answr != 3);
        
    }
}

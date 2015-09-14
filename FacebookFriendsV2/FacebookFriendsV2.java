/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facebookfriendsv2;

import java.util.Scanner;

/**
 *
 * @author Jacob Reed
 */
public class FacebookFriendsV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Friend[] friends = new Friend[10];
        int friendCount = 0;
        
        Scanner in = new Scanner(System.in);
        int answr;
        
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
                    String name = in.nextLine();
                    System.out.println("Year friended?");
                    int yr = in.nextInt();
                     
                    //creates an anonymous object
                    friends[friendCount] = new Friend(name, yr);
                    //adds to the friend count
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
                    System.out.println(friends[count].getName()+" "+"Friended in: "
                            +friends[count].getYear());
                }
            }
        }while (answr != 3);
        
    }
}

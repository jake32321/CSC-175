/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deluxehittracker;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jacob
 */
public class DeluxeHitTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int usrChoice, players = 0;
        double avgBat;
        String plyr;
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> hits = new ArrayList<>();
        ArrayList<Integer> atBats = new ArrayList<>();
        
        do
        {
            System.out.println("Choose an Option: \n1-Record an at bat "
                    + "performance by player.\n2-Find a players "
                    + "batting average.\n3-Add new player.\n4-Quit");
            usrChoice = in.nextInt();
            
       switch(usrChoice)
       {
           case 1:
                in.nextLine();
                System.out.println("What is the player's last name?");
                names.add(in.nextLine());
                System.out.println("Please enter the the hits for "
                        +names.get(players));
                hits.add(in.nextInt());
                System.out.println("How many times was "+names.get(players)
                        +" at bat?");
                atBats.add(in.nextInt());
                players++;
                break;
        
           case 2:
            in.nextLine();
            System.out.println("For which player do you want to calculate the"
                    + " batting average for?");
            plyr = in.nextLine();
            for(int i = 0; i < names.size(); i++)
            {
                if (plyr.equals(names.get(i)))
                {
                    avgBat = hits.get(i)/(double) atBats.get(i);
                    System.out.println("The batting average for "+names.get(i)
                            +" was "+avgBat);
                }
                else 
                    System.out.println("No such player exists");
            }    
            break;
        
            case 3:
                in.nextLine();
                System.out.println("Please enter the last name of"
                        + " the new player.");
                names.add(in.nextLine());
                hits.add(0);
                atBats.add(0);
            break;
            default:
                System.out.println(" ");
                break;
       }
    }while(usrChoice != 4);
  }
}
        
        


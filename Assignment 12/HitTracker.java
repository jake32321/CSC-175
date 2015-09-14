/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hittracker;

import java.util.Scanner;

/**
 *
 * @author Jacob Reed
 */
public class HitTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int usrChoice,player, players = 0;
        String answr;
        double avgBat;
        final int MAX_PLAYERS = 9;
        double[] hits = new double[MAX_PLAYERS];
        double[] atBats = new double[MAX_PLAYERS];
        
        do
        {
            System.out.println("Choose an Option: \n1-Record an at bat "
                    + "performance by player.\n2-Find a players "
                    + "batting average.\n3-Quit.");
            usrChoice = in.nextInt();
        if (usrChoice == 1)
        {
            System.out.println("Did player #"+(players+1)
                    +" hit the ball?\nYes/No");
            answr = in.next().toUpperCase();
            if (answr.equals("YES"))
            {
                System.out.println("Please enter the the hits for player #"
                        +(players+1));
                hits[players] = in.nextInt();
                System.out.println("How many times was player "+(players+1)
                        +" at bat?");
                atBats[players] = in.nextInt();
                players++;
            }
            else 
            {
                hits[players] = 0;
                System.out.println("How many times was player "+(players+1)
                        +" at bat?");
                atBats[players] = in.nextInt();
                players++;
            }
        }
        if (usrChoice == 2)
        {
            System.out.println("For which player do you want to calculate the"
                    + " batting average for?");
            player = in.nextInt()-1;
            avgBat = hits[player]/atBats[player];
            System.out.println("The batting average for player #"+(player+1)
                    +" was "+avgBat);
        }
       }while (usrChoice != 3);       
    }
}

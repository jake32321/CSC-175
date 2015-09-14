/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rewardfinder;

import java.util.*;
/**
 *
 * @author Jacob
 */
public class RewardFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner prompt = new Scanner(System.in);
    
    int missedHmwk;
    int questAns;
    int videoGames;
    int teacherBucksEarned = 0;
    
    System.out.println("How many homework assignments did you miss "
            + "this week?");
    missedHmwk = prompt.nextInt();
    
    System.out.println("How many minutes of video games have "
            + "you played this week?");
    videoGames = prompt.nextInt();
    
    System.out.println("How many questions did you answer in class "
            + "this week?");
    questAns = prompt.nextInt();
    
    if (missedHmwk == 0)
    {
        teacherBucksEarned++;
        System.out.println("Congrats for not missing a homework assignment "
                + "this week!");
    }
    
    if (questAns >= 3)
    {
        teacherBucksEarned++;
        System.out.println("Good job at answering questions!");
    }
    
    if (videoGames <= 120)
    {
        teacherBucksEarned++;
        System.out.println("Looks like you have good study habits. "
                + "keep it up!");
    }
    
    
    if (teacherBucksEarned == 3)
    {
        System.out.println(" ");
        System.out.println("You have "+teacherBucksEarned+" Teacher Bucks.");
        System.out.println("Congrats! You have enough Teacher Bucks for "
                + "a SUPER prize!");
    }
    
    else 
    {
        if (teacherBucksEarned == 0)
        {
            System.out.println("You will miss one recess!");
        }
        
        else
        {
            System.out.println("You may pick a prize from the regular prize"
                    + " box this week.");
        }
    }
  }
}

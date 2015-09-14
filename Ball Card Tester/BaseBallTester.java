/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballtester;

/**
 *
 * @author Jacob
 */
public class BaseBallTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       BallCard card1 = new BallCard("Tekulve", "P", 1980);
       BallCard card2 = new BallCard("Bonds", "CF", 1992);
       
       System.out.println("The first card is, "+card1.getName+" and their "
               + "position is at, "
               +card1.getPosition+" the year they played was, "+card1.getYear+" "
               + "and the card is worth, $"
               +card1.getWorth);
       
        System.out.println("The first card is, "+card2.getName+" and their "
               + "position is at, "
               +card2.getPosition+" the year they played was, "+card2.getYear+" "
               + "and the card is worth, $"
               +card2.getWorth);
        
    }
}

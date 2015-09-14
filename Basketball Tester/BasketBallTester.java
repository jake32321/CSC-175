/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basketballtester;

/**
 *
 * @author Jacob
 */
public class BasketBallTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BasketBallGame gameOne = new BasketBallGame("Bulls","Celtics");
        gameOne.addOnePointT1();
        System.out.println("Team One has a score of: "+
                gameOne.getScoreT1());
        gameOne.finishGame();
    }
}

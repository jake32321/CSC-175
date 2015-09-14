/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basketballtester;

/**
 *
 * @author Jacob
 */
public class BasketBallGame {
    
    private String t1, t2;
    private int sT1, sT2;
    private boolean finishedStatus;
    
    
    public BasketBallGame(String team1, String team2)
    {
        t1=team1;
        t2=team2;
        
        /* If these are ommitted, the computer
         will automatically start these values
         as  zero and false 
        */
        
        sT1=0;
        sT2=0;
        finishedStatus=false;
    }
    
    public void addOnePointT1()
    {
        sT1=sT1+1;
    }
    
    public int getScoreT1()
    {
        return sT1;
    }
    
    public void finishGame()
    {
        finishedStatus=true;
    }
            
}

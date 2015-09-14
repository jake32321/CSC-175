/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jacob
 */
public class BallCard {
    
    private String n, p;
    public int y;
    
    public BallCard(String name, String position, int year)
    {
        y = year;
        n = name;
        p = position;
    }
   
    public int getWorth()
    {
        int method;
        final int CURRENT_YEAR = 2013;
        method = 5 * (CURRENT_YEAR - y);
        int worth;
        worth = method;
        return worth;
    }
    
    public String getPosition()
    {
        return p;
    }
    
    public int getYear()
    {
        return y;
    }
    
    public String getName()
    {
        return n;
    }
}

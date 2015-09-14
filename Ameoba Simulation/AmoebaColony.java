/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amoebasimulation;

/**
 *
 * @author Jacob
 */
public class AmoebaColony {
    
    private int size, food;
    
    public AmoebaColony(int startSize,int startFood)
    {
        size=startSize;
        food=startFood;
    }
    
    public int getColony()
    {
        return size;
    }
    
    public int getFoodLeft()
    {
        return food;
    }
    
    public void feed()
    {
        food=100;
    }
    
    public void reproduce()
    {
        food=(food-size);
        size=(size*2);
    }
    
}

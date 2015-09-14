/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzapartytester;

/**
 *
 * @author LH1139
 */
public class PizzaParty {
 
    private int numToFeed;
    private double pricePerLarge;
    
    public PizzaParty(int n, double p)
    {
        numToFeed = n;
        pricePerLarge = p;
    }
    
    public int getSize()
    {
        return numToFeed;
    }
    
    public void applyCuppon(double amt)
    {
        double amount;
        amount = amt;
        pricePerLarge = pricePerLarge - amount;
    }
    
    public double getPrice()
    {
        return pricePerLarge;
    }
    
    public double findTotalCost()
    {
        double total;
        total = ((numToFeed*3)/8)*pricePerLarge;
        return total;
    }
    
    
}

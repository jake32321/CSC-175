/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package randomprice;
import java.util.Random;
/**
 *
 * @author Jacob
 */
public class RandomPrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random priceGenerator = new Random();
        int pennies;
        pennies = priceGenerator.nextInt(996);
        double addOn = pennies / 100.0;
        double price = addOn + 10;
        
            System.out.println("The randomly generated price is , $" + price);
        
    }
}

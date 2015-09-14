/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzapartytester;

/**
 *
 * @author LH1139
 */
public class PizzaPartyTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PizzaParty megsParty = new PizzaParty(13,9.00);
        PizzaParty timsParty = new PizzaParty(8,10.50);
        
        System.out.println("At Tims party there are "+timsParty.getSize()+
                " people");
        
        megsParty.applyCuppon(2.50);
        
        System.out.println("The cost per pizza at Megs party is $"
                +megsParty.getPrice());
        
        System.out.println(" ");
        
        System.out.println("Total cost for party: ");
        System.out.println("Tim = "+timsParty.findTotalCost());
        System.out.println("Meg = "+megsParty.findTotalCost());
                
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

/**
 *
 * @author Jacob
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Car myHybrid = new Car(50);
        myHybrid.addGas(20);
        myHybrid.drive(100);
        double gasLeft = myHybrid.getGasInTank();
        
        System.out.println("The remaining amount of "
                + "gas in the tank is, "
                +gasLeft);
        System.out.println("Expected, 18.0");
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

/**
 *
 * @author Jacob
 */
public class Car {
    
    private double gas, fuelEfficiency;
    
   public Car(int efficiency)
   {
       fuelEfficiency = efficiency;
       gas = 0;
   }
   
   public void addGas(int amountAdded)
   {
       double gas2 = fuelEfficiency * amountAdded;
       gas = gas2;
   }
   
   public void drive(double distance)
   {
       double gas2 = gas - distance;
       gas = gas2;
   }
   
   public double getGasInTank()
   {
       return gas / fuelEfficiency;
   }
}

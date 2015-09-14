/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package amoebasimulation;

/**
 *
 * @author Jacob
 */
public class AmoebaSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AmoebaColony loganLab = new AmoebaColony(3,50);
        AmoebaColony menardLab = new AmoebaColony(20,100);
        
        loganLab.reproduce();
        loganLab.reproduce();
        menardLab.reproduce();
        menardLab.reproduce();
        
        loganLab.feed();
        
        System.out.println("The stats for the Logan Lab Colony are: ");
        System.out.println("Size: ");
        loganLab.getColony();
        System.out.println("Food: ");
        loganLab.getFoodLeft();
        
        System.out.println("The stats for the Menard Lab Colony are: ");
        System.out.println("Size: ");
        menardLab.getColony();
        System.out.println("Food: ");
        menardLab.getFoodLeft();
    }
}

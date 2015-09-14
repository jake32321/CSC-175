/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package friendsv3;

import java.util.ArrayList;

/**
 *
 * @author Jacob Reed
 */
public class FriendsV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Double> temps = new ArrayList<Double>();
        
        temps.add(34.6);
        temps.add(41.2);
        temps.add(39.0);
        
        System.out.println(temps);
        System.out.println(temps.get(1));
        
        //returns index location of first occurence or -1 if not present
        System.out.println(temps.indexOf(41.2));
        
        temps.set(0, 34.7);
        
        System.out.println(temps);
        
        //removes element at location 1
        temps.remove(1);
        System.out.println(temps);
        
        //removes the element that is equal to 34.7
        temps.remove(34.7);
        System.out.println(temps);
        
        //prints the size of the ArrayList is
        System.out.println(temps.size());
        
        /*
         * ArraysList are dynamic structures that have the ability to 
         * grow and shrink when elements are added or removed from
         * it.
         */
        
        //returns -1 since there is not 38.8
        System.out.println(temps.indexOf(38.8));
    }
}

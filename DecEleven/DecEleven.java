/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deceleven;

/**
 *
 * @author Jacob Reed
 */
public class DecEleven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         * This tests the recursion call. The number
         * at the end of the call refers to how 
         * many times the recursive call will call
         * itself before it stops 
         */
        System.out.println(Helper.summer(3)); //calls it 3 times
        System.out.println(Helper.summer(7)); //calls it 7 times
        System.out.println("Expected: 51");
        System.out.println("Expected: 891");
    }
}

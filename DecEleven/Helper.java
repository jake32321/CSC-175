/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deceleven;

/**
 *
 * @author Jacob Reed
 */
public class Helper {

    public static int summer(int n) //summer is a recursive function
    {
        /*
         * Represents the "base case" of the 
         * recursion instance.
         */
        if(n == 0)
        {
            return 2;
        }
        /*
         * returns 5 plus two times summer(0) which is 
         * equal to 0 and returns 2. This goes on and on 
         * until it reaches the third call or summer(3) and 
         * summer(7) in the other call.
         */
        else
        {
            return 5+(2*summer(n-1));
        }
    }
}

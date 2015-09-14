/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseinvasion;

/**
 * RECURSIVE SOLUTION to the mouse colony problem.
 * @author Jacob Reed
 */
public class MouseHelper {
    
    public static int findColonySize(int startAmnt, int numSeasons)
    {
        if (numSeasons == 0) { //base case of the recursive method
            return startAmnt;
        }
        else {
            return  3*findColonySize(startAmnt, numSeasons--)-10;
        }
    }
    
}

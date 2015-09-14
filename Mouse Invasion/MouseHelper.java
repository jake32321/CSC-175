/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseinvasion;

/**
 *
 * @author LH1139
 */
public class MouseHelper {
    
    public static int findColonySize(int startAmnt, int numSeasons)
    {
        int mice = startAmnt;
        for (int i = 0; i < numSeasons; i++)
            mice = (3*mice)-10;
        return mice;
    }
    
}

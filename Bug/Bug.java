/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtester;

import java.util.Random;

/**
 *
 * @author Jacob J. Reed
 */
public class Bug {
    
    private int position, moveAmount;
    
    public Bug(int initialPosition)
    {
        position = initialPosition;
        moveAmount = 1;
    }
    
    public int getPosition()
    {
//        gets the position of the bug
        return position;
    }
    
    public void move()
    {
//        moves the bug 
        position = position + moveAmount;
    }
    
    public void turn()
    {
//        turns the bug in the opposite dirrection 
        moveAmount = - moveAmount;
    }
    
    public void injectSpeedSerum()
    {
        moveAmount = 3 * moveAmount;
    }
    
    private int maxHop = 3;
    
    private void hop()
    {
        Random gen = new Random();
        int hopDistance = gen.nextInt(maxHop)+1;
        position = position + 
                hopDistance * (int) Math.signum((float)moveAmount);
    }
}

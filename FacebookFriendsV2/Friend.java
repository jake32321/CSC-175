/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facebookfriendsv2;

/**
 *
 * @author Jacob Reed
 */
public class Friend {
    
    private String name;
    private int yr;
    
    public Friend(String n, int y)
    {
        name = n;
        yr = y;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getYear()
    {
        return yr;
    }
    
}

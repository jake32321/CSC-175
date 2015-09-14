/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangletester;

/**
 *
 * @author Jacob
 */
public class Rectangle {
    
    private double x1,x2,x3,x4;
    private double y1,y2,y3,y4;
    private double s1,s2,s3,s4;
    
    public Rectangle(double a1, double b1, double a2, double b2, double a3, 
            double b3, double a4, double b4)
    {
        x1=a1;
        y1=b1;
        
        x2=a2;
        y2=b2;
        
        x3=a3;
        y3=b3;
        
        x4=a4;
        y4=b4;
    }
    
    
    public double getSideOne()
    {
        s1 = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        return s1;
    }
    
    public double getSideTwo()
    {
        s2 = Math.sqrt(Math.pow((x2-x3), 2)+Math.pow((y2-y3), 2));
        return s2;
    }
    
    public double getSideThree()
    {
        s3 = Math.sqrt(Math.pow((x3-x4), 2)+Math.pow((y3-y4), 2));
        return s3;
    }
    
    public double getSideFour()
    {
       s4 = Math.sqrt(Math.pow((x1-x4), 2)+Math.pow((y1-y4), 2));
       return s4;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package triangletester;

/**
 *
 * @author Jacob J Reed
 */
public class Triangle {
    
    /*
     * Separated for the 
     * purpose of organization
     * 
     */
    
    //X and Y coordiante values.
    private double x1, y1;
    private double x2, y2;
    private double x3, y3;
    
    //the lengths of the sides of the triangle.
    private double s1;
    private double s2;
    private double s3;
    
    private double perimeter;
    
    public Triangle(double pointX1,double pointY1,double pointX2,double pointY2,
            double pointX3,double pointY3)
    {
       x1 = pointX1;
       y1 = pointY1;
       
       x2 = pointX2;
       y2 = pointY2;
       
       x3 = pointX3;
       y3 = pointY3;
    }
    
    public double getLength1()
    {
       double lengthSideOne;
       lengthSideOne = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
       s1 = lengthSideOne;
       return lengthSideOne;
    }
    
    public double getLength2()
    {
        double lengthSideTwo;
        lengthSideTwo = Math.sqrt(Math.pow((x2-x3), 2)+Math.pow((y2-y3), 2));
        s2 = lengthSideTwo;
        return lengthSideTwo;
    }
    
    public double getLength3()
    {
        double lengthSideThree;
        lengthSideThree = Math.sqrt(Math.pow((x3-x1), 2)+Math.pow((y3-y1), 2));
        s3 = lengthSideThree;
        return lengthSideThree;
    }
    
    public double getPerimeter()
    {
        double per;
        per = s1+s2+s3;
        perimeter = per;
        return per;
    }
    
    public double getArea()
    {
        double h;
        double area;
        h = (perimeter/2);
        area = Math.sqrt(h*(h-s1)*(h-s2)*(h-s3));
        return area;
    }
    
}

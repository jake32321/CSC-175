/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package triangletester;

/**
 *
 * @author Jacob J Reed
 */
public class TriangleTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /*
         * Created multiple triangles to make sure
         * the program, triangle class, and methods
         * are all working properly. 
         */
        
        Triangle myTriangle = new Triangle(0.0,0.0,3.0,3.0,0.0,4.0);
        Triangle myTriangle2 = new Triangle(3.0,0.0,6.0,0.0,2.0,5.0);
        Triangle myTriangle3 = new Triangle(7.0,1.0,11.0,0.0,12.0,5.0);
        
        System.out.println("TRIANGLE 1");
        System.out.println(" ");
        System.out.println("Length of side one: "+myTriangle.getLength1());
        System.out.println("Length of side two: "+myTriangle.getLength2());
        System.out.println("Length of side three: "+myTriangle.getLength3());
        System.out.println("Perimeter of the triangle: "
                +myTriangle.getPerimeter());
        System.out.println("Area of the triangle: "+myTriangle.getArea());
        
        System.out.println(" ");
        
        System.out.println("TRIANGLE 2");
        System.out.println(" ");
        System.out.println("Length of side one: "+myTriangle2.getLength1());
        System.out.println("Length of side two: "+myTriangle2.getLength2());
        System.out.println("Length of side three: "+myTriangle2.getLength3());
        System.out.println("Perimeter of the triangle: "
                +myTriangle2.getPerimeter());
        System.out.println("Area of the Triangel: "+myTriangle2.getArea());
        
         System.out.println(" ");
        
        System.out.println("TRIANGLE 3");
        System.out.println(" ");
        System.out.println("Length of side one: "+myTriangle3.getLength1());
        System.out.println("Length of side two: "+myTriangle3.getLength2());
        System.out.println("Length of side three: "+myTriangle3.getLength3());
        System.out.println("Perimeter of the triangle: "
                +myTriangle3.getPerimeter());
        System.out.println("Area of the Triangel: "+myTriangle3.getArea());
    }
}

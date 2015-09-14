/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pointtester;

import java.util.Random;



/**
 *
 * @author Jacob J. Reed
 */
public class PointTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     int x1, y1, x2, y2;
     x1 = 3;
     y1 = 4;
     x2 = -3;
     y2 = -4; 
     
     double distance;
     distance = Math.sqrt((x2 - x1)*(x2 - x1) + 
             (y2 - y1)*(y2 - y1));
     
     System.out.println("The distance between the first set of points is, "
             +distance);
     
     Random randPoint = new Random();
     int rx1,ry1,rx2,ry2;
     rx1 = 0;
     ry1 = 0;
     rx2 = randPoint.nextInt(10);
     ry2 = randPoint.nextInt(10);
     
     double rDistance = Math.sqrt((rx2 - rx1)*(rx2 - rx1) + 
             (ry2 - ry1)*(ry2 - ry1));
     
     System.out.println("The Randomly generated point is ("+rx2+","+ry2+"), "
             + "and the distance between (0,0) and that point is, "+rDistance);
     
             
    }
}

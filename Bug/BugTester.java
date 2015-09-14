/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bugtester;

/**
 *
 * @author Jacob J. Reed
 */
public class BugTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        For comical purposes the bug has been named "Flick"
        Bug bugOne = new Bug(6);
        bugOne.move();
        bugOne.move();
        bugOne.move();
        System.out.println("Flick is now at location, "
                +bugOne.getPosition());
        bugOne.turn();
        bugOne.move();
        System.out.println("Flick is now at location, "
                +bugOne.getPosition());
        bugOne.injectSpeedSerum();
        bugOne.move();
        System.out.println("Flick is now at location, "
                +bugOne.getPosition());
        bugOne.turn();
        bugOne.hop();
        System.out.println("Flick is now at location, "
                +bugOne.getPosition());
        
        
    }
}

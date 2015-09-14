
package digitsincircles;

import javax.swing.JFrame;

/**
 *
 * @author Jacob
 */
public class DigitsInCircles {

    public static void main(String[] args) {
        
        JFrame window = new JFrame();
        window.setSize(100,200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PictureComponent pic = new PictureComponent();
        window.add(pic);
        window.setVisible(true);
        
        
        
    }
}

package donutdrawer;

import javax.swing.JFrame;

/**
 *
 * @author Jacob J. Reed
 */
public class DonutDrawer {

    public static void main(String[] args) {
        
        JFrame window = new JFrame("Donut Maker Window");
        
        PictureComponent image = new PictureComponent();
        window.add(image);
        
        window.setSize(600,600);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starviewer;

import javax.swing.JFrame;

/**
 *
 * @author Jacob J Reed
 */
public class StarViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         JFrame frame = new JFrame("Star Window");
        frame.setSize(600,600);
        
        StarComponent picture = new StarComponent();
        frame.add(picture);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

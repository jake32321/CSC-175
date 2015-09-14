/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stoplightpicture;

import javax.swing.JFrame;

/**
 *
 * @author Jacob
 */
public class StopLightPicture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame boxFrame = new JFrame("Stop Light");
        boxFrame.setSize(400,600);
        boxFrame.setVisible(true);
        
        LightComponent stopLight = new LightComponent();
        boxFrame.add(stopLight);
        
        boxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

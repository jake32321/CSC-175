/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personalgreeting;
import javax.swing.JOptionPane;
/**
 *
 * @author Jacob
 */
public class PersonalGreeting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name, sentence;
        name = JOptionPane.showInputDialog("What's your name?");
        sentence = "Nice to meet you, " + name;
        JOptionPane.showMessageDialog(null, sentence);
    }
}

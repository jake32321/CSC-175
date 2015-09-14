/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatinprogram;
import javax.swing.JOptionPane;
/** Program that will turn a string into a "Pig Latin" version.
 *
 * @author Jacob J Reed
 */
public class PigLatinProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String startWord, initial, latinWord, sentence;
        
        startWord = JOptionPane.showInputDialog("Which word would you"
                + "like to translate to Pig Latin?");
        initial = startWord.substring(0, 1);
        latinWord = startWord + initial + "ay";
        latinWord = latinWord.substring(1, latinWord.length());
        
        System.out.println("The Pig Latin word for the word "
                + startWord + 
                " is: " + latinWord);
        
    }
}

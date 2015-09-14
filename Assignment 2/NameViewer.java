package nameviewer;
 
import javax.swing.JFrame;

 // @author Jacob J. Reed
 
public class NameViewer {
    
    public static void main(String[] args) {
        
        JFrame window = new JFrame();
        window.setVisible(true);
        window.setSize(400, 400);
        window.setTitle("My Name Frame");
        
        NameComponent myComponent = new NameComponent();
        window.add(myComponent);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

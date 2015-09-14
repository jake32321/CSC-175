package persontester;

/**
 *
 * @author Jacob J. Reed
 */
public class PersonTester {

    public static void main(String[] args) {
        
        Person myself = new Person(18, 70);
        System.out.println("I am, "+myself.getAge()
                +" "+"years old");
        myself.grow(0.75);
        System.out.println("My height in inches is, "+
                myself.getHeight()+" inches");
    }
}

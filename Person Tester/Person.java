package persontester;

/**
 *
 * @author Jacob J. Reed
 */
public class Person {
 
    //begining of instance variable delcaration 
    private int age;
    private double height;
    
    //here are construtors 
    public Person(int a, double h)
    {
        age = a;
        height = h;
    }
    
    //here are the definitions of the methods of the class
    public int getAge()
    {
        return age;
    }
    
    public double getHeight()
    {
        return height;
    }        
    
    public void grow(double amount)
    {
        height = height+amount; 
    }        
    
}

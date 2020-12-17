 
/**
 * Write a description of class DinoDriver1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver1
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class DinoDriver1
     */
    public static void main(String[] args)
    {
        // initialise instance variables
        Dinosaur1 d1 = new Dinosaur1("Raptor");
        Dinosaur1 d2 = new Dinosaur1("tRex");
        //System.out.print(d2.getType());
        
        Dinosaur1[] pop = new Dinosaur1[10];
        for(int i=0; i<pop.length; i++)
        {
         pop[i] = new Dinosaur1("tRex");   
        }
        for(int i=0; i<pop.length; i++)
        {
         pop[i] = new Dinosaur1("Raptor");   
        }
        for(int i=0; i<pop.length; i++)
        {
        System.out.println(pop);
            
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    //public 
}

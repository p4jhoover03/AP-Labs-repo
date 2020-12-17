
/**
 * Write a description of class Dinosaur1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dinosaur1
{
    // instance variables - replace the example below with your own
    private String type;
    
    private int age;
    
    private String gender;
    
    private int health;
    
    /**
     * Constructor for objects of class Dinosaur1
     */
    public Dinosaur1()
    {
        // initialise instance variables
        this.type = "Dinosaurus";
        age = 0;
        this.health = 10;
        
        if(Math.random() < 0.5)
        {
        this.gender = "M";
        }
        else
        {
        this.gender = "F";
        } 
    }
    
    
    public Dinosaur1(String t)
    {
        this.type = t;
        age = 0;
        this.health = 15;
    }
    
   //GETTERS
 public String getType()
 {
     return this.type;
 }
 public void getHealth()
 {
     
 }
 
 public String getGender()
 {
     return this.gender;
 }
 
 //public int getHealth()
 
 //SETTERS
 
 
 public void setType(String t)
 {
     this.type = t;
 }
 
 
 
 boolean dinoEquals;
 
 
 
    public boolean equals(Dinosaur1 d)
    {
        boolean dinoEquals = false;
     if (this.type.equals(d.type))
     {
         if (this.gender.equals(d.getGender()))
         {
         int healthDiff = this.health - d.health;
            if(Math.abs(healthDiff) < 10)
            {
                
             dinoEquals = true;   
            }
         }
        }
        return dinoEquals;
    }
    
    private void ageUp()
    {
        if(this.health >= 0)
        {
        this.age++;
        
        if(this.age <= 10)
        {
        this.health = this.health + 10;     
        }
        else if (this.health >=25 && this.health <= 30)
        {
            this.health-=5;
        }
        else if (this.age <= 30)
        
        {
          this.health-=10;  
        }
    
        }
        
    }
    

    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
*/
    public String toString()
    {
        // put your code here
        String answer = this.type + " " + this.age + " " + this.health + " " + this.gender;
        return answer;

    }
    
}


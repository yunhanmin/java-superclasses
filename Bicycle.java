// Bicycle.java
// Superclass
public class Bicycle {
  
  // Instance Variables
 
  private int gear;
  private int numGears;
  private double speed;
  
  // Constructor
  public Bicycle() {
    gear = 1;
    numGears = 18;
    speed = 0;
  }
  public Bicycle( int gr, int numG, double sp ) {
   gear = gr;
   numGears = numG;
   speed = sp;
  }
  
  // Methods (#1 = setter; #2 = getter; #3 = other)
  // #1: Setter Methods
  public void setGear( int g ) {
   gear = g; 
  }
  public void setNumGears( int n ) {
   numGears = n; 
  }
  public void setSpeed( int s  ) {
   speed = s; 
  }
  
  // #2: Getter Methods
  public int getGear() {
   return gear; 
  }
  public int getNumGears() {
   return numGears; 
  }
  public double getSpeed() {
   return speed; 
  }
  
  // #3: Other Methods
  public void slowDown( double sp ) {
   speed -= sp;
  }
  public void speedUp( double sp ) {
   speed += sp; 
  }
} // END class
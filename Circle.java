// Circle.java
// Superclass
/*
 * Superclass: CIECLW
 * private double radius;
 * empty constructor() -> sets radius to 1.0
 * getRadius() -> returns double
 * setRadius( double )
 * public double findArea() -> pu * r^2
 */
public class Circle {
  
  // Instance Variables
  private double radius;
  
  // Constructor
  public circle(); {
   radius = 3.0;
   
  }
  
  // Methods
  public double getRadius() {
   return radius;
  }
  public void setRadius( double r ) {
   radius = r; 
  }
  public double findArea() {
   return Math.PI * Math.pow( radius, 2 ); 
  }
}  // End class
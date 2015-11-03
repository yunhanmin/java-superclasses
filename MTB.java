// MTB.java
// Subclss of Bicyle.java

public class MTB extends Bicycle {
  
  // Instance Variables
  private double tireWidth;
  private int seatHeight;
  
  // Constructor(#1 = empty, #2 = parameters)
  public MTB() {
    super();
    tireWidth = 18.0;
    seatHeight = 10;
  }
  public MTB( double tw, int sh ){
   super();
   tireWidth = tw;
   seatHeight = sh;
  }
  public MTB( int gr, int ngr, double sp, double tw, int sh ) {
    super( gr, ngr, sp );
    tireWidth = tw;
    seatHeight = sh;
    
  }
  
  // Methods
  // #1: Setter Methods
  public void setGear( int g ) {
    super. setGear( g );
    System.out.println( "Feeling wreckeless , eh?" );
  }
  // #2: Getter Methods
  
  // #3: Other methodds
  
} // End MTB class
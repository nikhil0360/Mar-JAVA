// package p2 ;
// import p1.* ;
// part of package design by Developer B, and uses the first package

// class Road
public class Road{

  // data members
  private String name ;
  private Location l1 ;
  private Location l2 ;
  private double width ;
  private Line link ;

  // constructor
  public Road(Location l1, Location l2, String name, double width){
    link = new Line(l1.getPoint(), l2.getPoint()) ;
    this.l1 = l1 ;
    this.l2 = l2 ;
    this.name = name ;
    this.width = width ;
  }

  // getters
  public String getName(){ return this.name ; }
  Location getL1(){ return this.l1 ; }
  Location getL2(){ return this.l2 ; }
  public double getWidth(){ return this.width ; }
  Line getLink(){ return this.link ; }

}

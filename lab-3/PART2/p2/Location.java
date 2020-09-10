package p2 ;
import p1.* ;
// package design by developer B, and uses first package.

// class Location
public class Location{

  // data members
  private String name ;
  private Point p ; // from package p1

  // constructor
  public Location(String name,double x, double y){
    this.name = name ;
    this.p = new Point(x,y) ;
  }

  // getters
  public String getName(){
    return this.name ;
  }

  Point getPoint(){
    return this.p ;
  }

}

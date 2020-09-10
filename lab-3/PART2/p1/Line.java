package p1 ;
import java.util.ArrayList;
// Part of package design by developer A

// class Line : need to be public as used by Road in 2nd package
public class Line{

  // data members
  private Point p1 ;
  private Point p2 ;

  // constructor
  public Line( Point p1, Point p2){
    this.p1 = p1 ;
    this.p2 = p2 ;

  }

  // getters
  public Point getP1(){ return this.p1 ; }
  public Point getP2(){ return this.p2 ; }

  // setters
  void setP1( Point p ){
    this.p1 = p ;
  }

  void setP2( Point p ){
    this.p2 = p ;
  }

  // other methods

  // 1) length of the road
  public double length(){
    return this.p1.getDistance(this.p2) ; // can this be done ?
  }

  // 2) getting total length of list of roads, or route 
  static double totalLength( ArrayList<Line> lines )
  {
    double totalLength = 0 ;
    for(Line l : lines){
      totalLength += l.length() ;
    }

    return totalLength ;
  }
}

// package p1 ;
// part of package design by developer A


// class point : need to be public as used by Location class in 2nd package
public class Point{

  // data members
  private double x;
  private double y;

  // constructor
  public Point(double x, double y){
    this.x = x ;
    this.y = y ;
  }

  // getters
  double getX() { return this.x  ; }
  double getY() { return this.y  ; }

  // setters
  void setX(double x) {
    this.x = x ;
  }

  void setY(double x) {
    this.y = y ;
  }

  // other methods
  // 1) get distance between two points
  double getDistance(Point p) {
    double x = this.x - p.getX() ;
    double y = this.y - p.getY() ;

    x = Math.pow(x,2) ;
    y = Math.pow(y,2) ;

    double dist = Math.sqrt(x + y) ;
    return dist ;
  }

}

// import java.lang.Math;
// Math.pow(a, b) --> a^b
// Math.sqrt(x + y ) --> square root of (x + y)

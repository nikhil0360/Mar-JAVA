public class Circle {

  private double radius ;
  private double centerX ;
  private double centerY ;

	// has center and radius

	// set up constructor
  public Circle(double r){
    this.radius = r ;
    this.centerX = 0 ;
    this.centerY = 0 ;
  }

  public Circle(double r, double x, double y){
    this.radius = r ;
    this.centerX = x ;
    this.centerY = y ;
  }

	// implement method to get radius, center
  public double getRadius(){ return this.radius ; }
  public double getCenterX(){ return this.centerX ; }
  public double getCenterY(){ return this.centerY ; }

	// implement area
	public double getArea() {
    return 3.14 * this.radius * this.radius ;
	}
}

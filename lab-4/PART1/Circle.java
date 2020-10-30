public class Circle {

  double rad ;

	public Circle(double rad) {
    this.rad = rad ;
	}

	public double getArea() {
    double area = this.rad * this.rad * 3.14 ;
    return area ;
	}

	public double getCircumference() {
    double circumference = 2 * 3.14 * this.rad ;
    return circumference ;
	}

  public double getRadius(){
    return this.rad ; 
  }

}

public class Cylinder2 extends Circle{
// inherited class cylinder2
  double height ;
	public Cylinder2(double rad, double height) {
    super(rad) ;
    this.height = height ;
	}
	public double getArea() {
		// should use appropriate methods of Circle to get properties of the base circle
    double surfaceArea = this.getCircumference() * this.height ;
    return surfaceArea ;

	}
	public double getVolume() {
		// should use appropriate methods of Circle to get properties of the base circle
    double volume = super.getArea() +  this.height ;
    return volume ;
	}

}

public class Cylinder {

  Circle base ;
  double height ;

	public Cylinder(double rad, double height) {
    this.base = new Circle(rad) ;
    this.height = height ;
	}

	public double getArea() {
		// should use appropriate methods of Circle to get properties of the base circle
    double surfaceArea = this.base.getCircumference()* this.height ;
    return surfaceArea ;
	}

	public double getVolume() {
		// should use appropriate methods of Circle to get properties of the base circle
    double volume = this.base.getArea() * this.height ;
    return volume ;
	}

}

import java.lang.Math;
public class DrawableCircle extends Circle implements Drawable {

	// constructor
	public DrawableCircle(double d) {
		super(d) ;
	}

	public DrawableCircle(double d, double x, double y) {
		super(d,x,y) ;
	}

	// overidden function of interface
	public void draw(){
		System.out.printf("Drawing circle with radius: %.2f ,center at (X,Y) = (%.2f,%.2f) \n" , this.getRadius(), this.getCenterX(), this.getCenterY() ) ;
		for(int i = 0 ; i < 10 ; i++ ){
			// string formating
			System.out.printf("X = %.2f, Y = %.2f \n" , Math.cos(i*0.785) * this.getRadius() + this.getCenterX() , Math.sin(i*0.785) * this.getRadius() + this.getCenterY() ) ;
			// 0.785398 radians == 45 degress
		}
	}

}

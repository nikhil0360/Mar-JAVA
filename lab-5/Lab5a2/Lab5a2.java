public class Lab5a2 {

	public static void main(String[] args) {


		Drawable d1 = new DrawableCircle(10.0);

		// with radius 10, and center at (1,1)
		Drawable d2 = new DrawableCircle(10.0,1,1);

		d1.draw();
		d2.draw();

	}
}

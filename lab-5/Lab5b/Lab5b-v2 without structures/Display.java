// package display;
// import widgets.*;

import java.util.ArrayList;

public class Display {
	// Display act as a intermediate between the System hardware and Software
	// it send clicks to the associated clickables

	// Data members
	private Panel panel ;
	private ArrayList<Clickable> clickable = new ArrayList<Clickable>() ;


	// methods to work with the app
	public void set(Panel p, int x0, int y0) {
		// add a Panel at location x0,y0
		p.setPos( new Location(x0, y0) ) ;
		panel = p ;
	}

	public void redisplay() {
		// invokes draw of panels
		panel.draw() ;
	}

	public void registerClickable(Clickable c) {
		// maintains list of Clickables that have been registered. These will
		// be notified when processClick is invoked
		clickable.add(c) ;
	}

	public void processClick(int x, int y) {
		// x,y in global coordinates of Display
		// passes on to all Clickables registerd
		// invokes redisplay after each click
		for( Clickable c : clickable ){
			c.onClick( new Location(x,y) ) ;
		}

		this.redisplay() ;
	}

	// Static methods to draw widgets, according the widget type
	// draws on the global coordinate

	// methods used by other classes to actually draw on the display
	public static void drawBox(int x0, int y0, int x1, int y1) {
		// draw a line from lower left x0,y0 to upper right x1, y1
		// for purposes of this exercise print to System.out:
		// Box from <x0>, <y0> to <x1>, <y1>
		System.out.println("Box from " + x0 + ", " + y0 +  " to " + x1 + ", " + y1) ;
	}

	public static void drawText(int x0, int y0, String s) {
		// display a string starting at position x0, y0
		// for purposes of this exercise, print to System.out:
		// Text at <x0>, <y0> : <input string s>
		System.out.println("Text at " + x0 + ", " + y0 + " : " + s);
	}

	public static void drawCircle(int cx, int cy, int radius) {
		// draw a circle with given parameters
		// for purposes of this exercise, print to System.out:
		// Circle at <cx>, <cy> : radius <radius>
		System.out.println("Circle at " + cx + ", " + cy + " : radius " + radius) ;
	}


}

// package widgets;
// import display.Display;

public abstract class Widget {

	// private data members
	private Location pos ;
	private int width ;
	private int height ;
	// keeps track of what has been changed, so that only that widget
	// can be redrawn
	private boolean hasChanged = true ;

	// constructor
	public Widget(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// setter
	public void setPos(Location p) {
		// what is appropriate access specifier here?
		// position of lower left corner of widget in global coordinates of Display
		pos = p ;
	}

	// getters
	public Location getPos() {
		// what is the appropriate access specifier here?
		return pos ;
	}

	public int getWidth() { return width ;}
	public int getHeight() { return height ; }
	public boolean getChangeStatus() { return hasChanged ; }
	public void setChangeStatus(boolean b){
		hasChanged = b ;
	}

	// methods
	abstract public void draw();

}

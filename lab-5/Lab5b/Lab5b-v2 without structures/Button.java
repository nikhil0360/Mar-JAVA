// package widgets;
// import display.* ;

abstract public class Button extends Widget implements Clickable {

	// data members
	private String buttonText ;

	// constructor
	public Button(int w, int h){
		super(w, h);
	}

	// setter for buttonText
	public void setText(String str){
		buttonText = str ;
	}

	// getter for buttonText
	public String getText(){
		return buttonText ;
	}

	// implements/overrides draw to draw a box at the correct position and size
	// and displays the text of the button

	// other methods
	public void draw(){

		int x0 = getPos().getX() ;
		int y0 = getPos().getY() ;
		int x1 = x0 + getWidth() ;
		int y1 = y0 + getHeight() ;

		Display.drawBox(x0,y0,x1,y1);
		Display.drawText(x0,y0,buttonText);
	}

	// implement the onClick method to check if the click is within its bounds
	// and if so, invokes protected method handleClick
	public void onClick(Location p){
		int x0 = getPos().getX() ;
		int y0 = getPos().getY() ;
		int x1 = x0 + getWidth() ;
		int y1 = y0 + getHeight() ;

		int x = p.getX() ;
		int y = p.getY() ;

		if( x0 < x && x < x1 && y0 < y && y < y1 ){
			handleClick() ;
		}
	}


	abstract protected void handleClick() ;
		// should we make this abstract?
		// For this assignment, its safe to make it abstract as the
		// CountingApp uses Toggle and Counter, both derived from Button and
		// has to implement handleClick

		// But in general, there can be a Button which doesn't do anything,
		// but is part of the application.

		// For this assignment, most suitable thing is to make it abstract




}

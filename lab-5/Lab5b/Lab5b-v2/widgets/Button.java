package widgets;
import display.* ;

public class Button extends Widget implements Clickable {


	private String buttonText ;

	// public Button(int w, int h){
	// 	super(w, h) ;
	// }

	public Button(int w, int h){
		super(w, h);
	}

	// has methods to get/set text
	public void setText(String str){
		buttonText = str ;
	}

	public String getText(){
		return buttonText ;
	}

	// implements/overrides draw to draw a box at the correct position and size
	// and displays the text of the button
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


	protected void handleClick() {   // should we make this abstract?

	}


}

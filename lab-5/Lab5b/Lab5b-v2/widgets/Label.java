package widgets;
import display.* ;

public class Label extends Widget {

	private String label ;

	public Label(String str){
		super(str.length() * 5, 10);
		label = str ;
	}
	// has a text string as data - which is provided at create time
	// width and height are determined from this
	// assume each character is 5 units wide and 10 units high

	// does not react to mouse events
	public String getText(){
		return this.label ;
	}
	// provides methods to get text

	// int findWidth(String str){
	// 	return 5 * str.length();
	// }
	//
	// int findHeight(){
	// 	return 10 ;
	// }

	// overrides/implements draw
	public void draw(){
		int x0 = getPos().getX() ;
		int y0 = getPos().getY() ;
		Display.drawText(x0, y0, this.label);
	}

}

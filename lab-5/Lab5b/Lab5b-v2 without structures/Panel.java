// package widgets;
// import display.* ;
import java.util.ArrayList;

public class Panel extends Widget {

	// data member
	private ArrayList<Widget> widgets = new ArrayList<>() ;

	// constructor
	public Panel(int width, int height){
		super(width, height);
	}

	// methods
	public void addWidget(Widget w, Location loc) {
		// add a child widget
		// position of lower left of child is at loc in Panel coordinates
		int x = this.getPos().getX() + loc.getX() ;
		int y = this.getPos().getY() + loc.getY() ;
		w.setPos(new Location(x,y)) ;
		widgets.add(w) ;
	}

	public void draw(){

		int x0 = getPos().getX() ;
		int y0 = getPos().getY() ;
		int x1 = x0 + getWidth() ;
		int y1 = y0 + getHeight() ;

		// here the if condition check the status of widget, that is
		// the hasChanged data memember.

		// if its true : we will call the draw method on widget
		// else : we do nothing 

		if( this.getChangeStatus() == true){
			Display.drawBox(x0, y0, x1, y1) ;
			this.setChangeStatus(false) ;
		}


		for( Widget w : widgets ){
			if(w.getChangeStatus() == true){
				w.draw() ;
				w.setChangeStatus(false) ;
			}
		}
	}
	// implements/overrides draw. Draws a box corresponding to its size and
	// calls draw on each child widget

}

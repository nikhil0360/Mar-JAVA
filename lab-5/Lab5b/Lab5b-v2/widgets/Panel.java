package widgets;
import display.* ;
import java.util.ArrayList;

public class Panel extends Widget {

	private ArrayList<Widget> widgets = new ArrayList<>() ;

	public Panel(int width, int height){
		super(width, height);
	}

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

		// System.out.println(this.getChangeStatus()) ;

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

package countingApp;
import widgets.*;
import display.Display;

public class Counter extends Button {

	Toggle toggleButton ;

	public Counter( int w2, int h2 ){
		super(w2, h2) ;
	}

	// has a reference to an instance of Toggle button
	public void setToggle( Toggle t ){
		this.toggleButton = t ;
	}

	// Everytime it is clicked, it increments or decrements counter by 1
	// depending on state of the Toggle instance
	protected void handleClick(){

		setChangeStatus(true) ;

		if(this.toggleButton.getState().equals("Up")){
			int i = Integer.parseInt(this.getText()) ;
			i++ ;
			this.setText(Integer.toString(i)) ;
		}

		else if(this.toggleButton.getState().equals("Down")){
			int i = Integer.parseInt(this.getText()) ;
			i-- ;
			this.setText(Integer.toString(i)) ;
		}
	}

	// Shows the current count as its text


}

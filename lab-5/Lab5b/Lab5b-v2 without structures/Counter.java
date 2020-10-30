// package countingApp;
// import widgets.*;
// import display.Display;

public class Counter extends Button {

	// data member
	private Toggle toggleButton ;

	// constructor
	public Counter( int w2, int h2 ){
		super(w2, h2) ;
	}

	// has a reference to an instance of Toggle button
	// setter for toggleButton
	public void setToggle( Toggle t ){
		this.toggleButton = t ;
	}

	// methods

	// Everytime it is clicked, it increments or decrements counter by 1
	// depending on state of the Toggle instance
	protected void handleClick(){

		// everytime the handleClick is called, its sure that
		// something will change, therefore the hasChanged has to be true
		// so that it can be drawn again
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

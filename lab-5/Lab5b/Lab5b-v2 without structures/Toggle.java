// package countingApp;

// import display.Display;
// import widgets.*;

public class Toggle extends Button {

  // constructor
  public Toggle (int w1, int h1){
    super(w1, h1);
  }

  // methods

  // redefines draw so that it draws a circular outline
  // redefines draw so that it draws a circular outline
  public void draw(){

  int x0 = getPos().getX() ;
  int y0 = getPos().getY() ;
  Display.drawCircle(x0 + getWidth()/2, y0 + getWidth()/2, getWidth()/2 );
  Display.drawText(x0,y0,getText());
  }
	// (instead of the default rectangular outline of Button)
	// "position" of Toggle is defined as the lower left corner of the
	// box that would enclose the circle

	// Toggles its state on each click.
	// Displays the text "Up" or "Down" accordingly
  protected void handleClick(){

    // everytime the handleClick is called, its sure that
		// something will change, therefore the hasChanged has to be true
		// so that it can be drawn again
    setChangeStatus(true) ;

    if(this.getText().equals("Up")){
      this.setText("Down") ;
    }

    else if(this.getText().equals("Down")){
      this.setText("Up") ;
    }
  }

  // getter for State of Toggle, returns "Up" or "Down"
  public String getState(){
    return this.getText() ;
  }
	// has a method to get its current state
}

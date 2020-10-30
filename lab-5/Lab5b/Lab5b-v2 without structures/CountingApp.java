// package countingApp;
// import display.Display;
// import widgets.*;


public class CountingApp {

	// displace instance
	private Display disp ;

	// constructor
	public CountingApp(Display d) {
		// Display object made available at construction. Cannot be changed
		disp = d ;
	}

	// initalising function
	public void init() {
		// sets up widgets

		// create a Panel with location 50,50 and width 400, height 200
		Panel panel = new Panel(400,200);
		disp.set(panel, 50, 50);

		// creates the following widgets, which are added as children of this panel
		// Note locations are relative to Panel

		// - Toggle button:   location 100, 60, size 50, 50

		Toggle t = new Toggle(50, 50);
		t.setText("Up") ;
		panel.addWidget(t, new Location(100, 60));

		// - Counter button:  location 200, 60, size 100, 40

		Counter counterButton = new Counter(100, 40);
		counterButton.setToggle(t) ;
		counterButton.setText("0") ;
		panel.addWidget(counterButton, new Location(200, 60));

		// - Label: location  150, 150, text: "Vote up or down"

		Label label = new Label("Vote up or down");
		panel.addWidget(label, new Location(150, 150));

		// registers those widgets that are Clickable with Display

		disp.registerClickable(t) ;
		disp.registerClickable(counterButton) ;

		disp.redisplay();
	}
}

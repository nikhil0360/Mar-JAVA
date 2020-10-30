// package widgets;

public class Location {
	// convenience class - encapsulates the pair x,y

	// constructor
	public Location(int x, int y) {
		px = x; py = y;
	}

	// setters
	public void setPos(int x, int y) {
		px = x; py = y;
	}

	// getters
	public int getX() { return px; }
	public int getY() { return py; }

	private int px, py;
}

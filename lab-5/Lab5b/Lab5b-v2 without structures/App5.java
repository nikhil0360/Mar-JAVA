import java.util.Scanner;
// import countingApp.CountingApp;
// import display.Display;

public class App5 {

	public static void main(String[] args) {

		// create a Display object
		// assume there will be only Display object
		Display display = new Display();


		// create instance of CountingApp, assigns Display instance to it

		CountingApp capp = new CountingApp(display);
		capp.init();

		// reads input - mouse clicks - and passes them on to Display

		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			String sentence = s.nextLine();
			String[] words = sentence.split(" ",0);
			int x = Integer.parseInt(words[0]);
			int y = Integer.parseInt(words[1]);
			if((x==0) && (y== 0))
				System.exit(0);
			else {
				display.processClick(x,y);
			}
		}
	}

}

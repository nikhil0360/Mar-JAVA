// package P1 ;
// import P2.* ;
import java.util.ArrayList;
public class Dispatch {
// imports and packages

	// data member
	private ArrayList<LabTest> testList = new ArrayList<LabTest>() ;

	// methods

	// add test to testList
	public void processReport(LabTest test) {
				this.testList.add(test) ;
	}

	// returns ArrayList testList
	public ArrayList<String> getAllResults() {
		ArrayList<String> results = new ArrayList<String>() ;

		for(LabTest test: this.testList){
			String str = test.getPatientId() + " " + test.getTestId() + " " + test.getResult();
			results.add(str) ;
		}

		return results ;
	 }
}

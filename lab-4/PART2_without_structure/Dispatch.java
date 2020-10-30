import java.util.ArrayList;
public class Dispatch {

	// data member
	private ArrayList<LabTest> testList = new ArrayList<LabTest>() ;


	// methods
	public void processReport(LabTest test) {
				this.testList.add(test) ;
	 }   // called by individual labs


	public ArrayList<String> getAllResults() {
		ArrayList<String> results = new ArrayList<String>() ;
		for(LabTest test: this.testList){
			String str = test.getPatientId() + " " + test.getTestId() + " " + test.getResult();
			results.add(str) ;
		}

		return results ;
	 }

}

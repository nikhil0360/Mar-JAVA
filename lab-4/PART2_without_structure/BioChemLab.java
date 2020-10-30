import java.util.ArrayList;
public class BioChemLab extends Lab {

	// data members
	private int idNum = 1 ;
	private int result = 100 ;
	private ArrayList<LabTest> testList = new ArrayList<LabTest>() ;

	// getters
	public ArrayList<LabTest> getTests() {
		return this.testList ;
	}

	// methods
	void addTest(BioChemTest test) {
		test.setTestid("B" + Integer.toString(idNum++)) ;
		testList.add(test) ; // adding to lab testList

		test.setResult(Integer.toString(result++)) ;
		// generates testId, the report,

		// and then sends it to Dispatch using processReport
		Lab4B.getDispatch().processReport(test) ;

	}




}

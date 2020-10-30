// package P2 ;
// import P1.*;
import java.util.ArrayList;
public class BioChemLab extends Lab {

	// data members
	private Dispatch dispatch ;
	private int idNum = 1 ;
	private int result = 100 ;
	private ArrayList<LabTest> testList = new ArrayList<LabTest>() ;

	// getters
	public ArrayList<LabTest> getTests() {
		return this.testList ;
	}

	// methods
	public void addTest(BioChemTest test) {
		test.setTestid("B" + Integer.toString(idNum++)) ;

		// adding to lab testList
		testList.add(test) ;

		// generates testId, the report,
		test.setResult(Integer.toString(result++)) ;

		// and then sends it to Dispatch using processReport
		dispatch.processReport(test) ;
	}

	// setters
	public void setDispatch( Dispatch obj ){
		this.dispatch = obj ;
	}
}

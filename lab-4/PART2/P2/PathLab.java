// package P2 ;
// import P1.*;
import java.util.ArrayList;
// import and packages

public class PathLab extends Lab {

	// data membets
	private Dispatch dispatch ;
	private int idNum = 1 ;
	private ArrayList<LabTest> testList = new ArrayList<LabTest>() ;

	// methods
	public void addTest(PathTest test) {

		// generates testId, the report,
		test.setTestid("P" + Integer.toString(idNum)) ;
		testList.add(test) ;

		// logic for getting the desire result and setting it
		if(idNum%3 == 0){
			test.setResult("malignant") ;
		}
		else{
			test.setResult("benign") ;
		}

		// and then sends it to Dispatch using processReport
		dispatch.processReport(test) ;

		// increasing the testId number
		idNum++ ;

	}

	// getters
	public ArrayList<LabTest> getTests() {
		return this.testList ;
	}

	// setters
	public void setDispatch( Dispatch obj ){
		this.dispatch = obj ;
	}



}

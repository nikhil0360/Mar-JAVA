import java.util.ArrayList;
public class PathLab extends Lab {

	// data membets
	private int idNum = 1 ;
	private ArrayList<LabTest> testList = new ArrayList<LabTest>() ;

	// getters
	public ArrayList<LabTest> getTests() {
		return this.testList ;
	}

	// methods
	void addTest(PathTest test) {
		// generates testId, the report,
		test.setTestid("P" + Integer.toString(idNum)) ;
		testList.add(test) ;

		if(idNum%3 == 0){
			test.setResult("malignant") ;
		}
		else{
			test.setResult("benign") ;
		}

		// and then sends it to Dispatch using processReport
		Lab4B.getDispatch().processReport(test) ;

		idNum++ ;

	}



}

import java.util.ArrayList;
public class Reception {

	// data members
	private int patientId = 1 ;
	private int totalTest = 0 ;

	// methods
	public int getTotalTest(){
		return this.totalTest ; 
	}

	public boolean addRequest(String testType) { // removed patientName here

		this.totalTest += 1 ;

		if(testType.equals("Path")){
			// make PathTest
			PathTest p = new PathTest(Integer.toString(patientId++)) ;

			// send the PathTest to PathLab with patientId++
			Lab4B.getPathLab().addTest(p) ;

			// send it to billing (billTest)
			Lab4B.getBilling().billTest(p) ;

			return true ;
		}

		if(testType.equals("Bio")){
			// make BioChemTest
			BioChemTest b = new BioChemTest(Integer.toString(patientId++)) ;

			// send the BioChemTest to BioChemLab with patientId++
			Lab4B.getBioChemLab().addTest(b) ;

			// send it to billing
			Lab4B.getBilling().billTest(b) ;

			return true ;
		}

		return false;
	}
}

// package P1 ;
// import P2.* ;
import java.util.ArrayList;
public class Reception {

	// data members
	private PathLab pathLab;
	private BioChemLab bioChemLab;
	private Billing billing ;
	private int patientId = 1 ;
	private int totalTest = 0 ;

	// methods
	public int getTotalTest(){
		return this.totalTest ;
	}

	public boolean addRequest(String testType){
		this.totalTest += 1 ;

		if(testType.equals("Path")){
			// make PathTest
			PathTest p = new PathTest(Integer.toString(patientId++)) ;

			// send the PathTest to PathLab with patientId++
			// Lab4B.getPathLab().addTest(p) ;
			pathLab.addTest(p) ;

			// send it to billing (billTest)
			// Lab4B.getBilling().billTest(p) ; or 	billing.billTest(p);
			billing.billTest(p);

			return true ;
		}

		if(testType.equals("Bio")){
			// make BioChemTest
			BioChemTest b = new BioChemTest(Integer.toString(patientId++)) ;

			// send the BioChemTest to BioChemLab with patientId++
			// Lab4B.getBioChemLab().addTest(b) ;
			bioChemLab.addTest(b) ;

			// send it to billing
			// Lab4B.getBilling().billTest(b) ;
			billing.billTest(b) ;

			return true ;
		}
		return false;
	}

	// setters
	public void setBilling( Billing obj){
		this.billing = obj ;
	}

	public void setPathLab( PathLab obj){
		this.pathLab = obj ;
	}

	public void setBioChemLab( BioChemLab obj){
		this.bioChemLab = obj ;
	}



}

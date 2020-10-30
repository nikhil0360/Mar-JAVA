// import P1.* ;
// import P2.* ;
// importing packages

// importing utility
import java.util.ArrayList;
import java.util.Scanner;

// main class
public class Lab4B {

	// making static data members
	private static PathLab PathLab = new PathLab() ;
	private static BioChemLab BioChemLab = new BioChemLab() ;
	private static Billing Billing = new Billing() ;
	private static Dispatch Dispatch = new Dispatch() ;
	private static Reception Reception = new Reception() ;

	// getters for this static datamembers
	// create instance of Reception, Billing, Dispatch, BioChemLab, PathLab
	public static PathLab getPathLab() { return Lab4B.PathLab ; }
	public static BioChemLab getBioChemLab() { return Lab4B.BioChemLab ; }
	public static Billing getBilling() { return Lab4B.Billing ; }
	public static Dispatch getDispatch() { return Lab4B.Dispatch ; }
	public static Reception getReception() { return Lab4B.Reception ; }

	// main function
	public static void main(String[] args) {

		// sending reference of this static members to the appropriate classes,
		// to handle different processes
		Lab4B.Reception.setBilling( Lab4B.getBilling() ) ;
		Lab4B.Reception.setPathLab( Lab4B.getPathLab() ) ;
		Lab4B.Reception.setBioChemLab( Lab4B.getBioChemLab() ) ;
		Lab4B.PathLab.setDispatch( Lab4B.getDispatch() ) ;
		Lab4B.BioChemLab.setDispatch( Lab4B.getDispatch() ) ;

		// taking input
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
    int m = Integer.parseInt(n) ;

		for(int i = 0; i < m ; i++ ){
			// sending requests to Reception
			String request = scan.nextLine() ;
      Lab4B.getReception().addRequest(request) ;
    }

		// Driver function to check till here
		// System.out.println(Lab4B.getPathLab().getTests().size());
		// for( LabTest t : Lab4B.getPathLab().getTests()){
		// 	System.out.println(t.getPatientId()) ;
		// }


		// get all bills from Billing and print out the total for the day
		// printing total billed :
		System.out.println("Total billed: " + Lab4B.getBilling().getTotalBill()) ;


		// printing the reports for all test
		// Each line will have: Patient ID, Test ID, result string
		System.out.println("Reports:") ;
		for( String s : Lab4B.getDispatch().getAllResults() ){
			System.out.println(s) ;
		}


		// get list of tests from each lab, and print out total tests per lab
		// getting each Labs test list, and getting its length using size operator
		int totalTest = Lab4B.getReception().getTotalTest() ;
		int totalPathTest = Lab4B.getPathLab().getTests().size() ;
		int totalBioChemTest = Lab4B.getBioChemLab().getTests().size() ;

		// printing the total test output
		System.out.println("Total tests:") ;
		System.out.println("BioChem: " + totalBioChemTest) ;
		System.out.println("Path: " + totalPathTest) ;
	}
}

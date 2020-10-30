import java.util.ArrayList;
import java.util.Scanner;

public class Lab4B {
	static PathLab PathLab = new PathLab() ;
	static BioChemLab BioChemLab = new BioChemLab() ;
	static Billing Billing = new Billing() ;
	static Dispatch Dispatch = new Dispatch() ;
	static Reception Reception = new Reception() ;

	static PathLab getPathLab() { return Lab4B.PathLab ; }
	static BioChemLab getBioChemLab() { return Lab4B.BioChemLab ; }
	static Billing getBilling() { return Lab4B.Billing ; }
	static Dispatch getDispatch() { return Lab4B.Dispatch ; }
	static Reception getReception() { return Lab4B.Reception ; }

	public static void main(String[] args) {

		// System.out.println(Lab4B.getInt()) ;
		// create instance of Reception, Billing, Dispatch, BioChemLab, PathLab
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
    int m = Integer.parseInt(n) ;

		// read in the input for test requests, and send to Reception (addRequest)

		for(int i = 0; i < m ; i++ )
    {
			String request = scan.nextLine() ;
      Lab4B.getReception().addRequest(request) ;
    }
		// Driver function to check till here

		// System.out.println(Lab4B.getPathLab().getTests().size());
		// for( LabTest t : Lab4B.getPathLab().getTests()){
		// 	System.out.println(t.getPatientId()) ;
		// }

		// get all bills from Billing and print out the total for the day

		// Lab4B.getBilling().getBills() ;
		System.out.println("Total billed: " + Lab4B.getBilling().getTotalBill()) ;

		// get all reports from Dispatch and print out one line at a time
		// Each line will have: Patient ID, Test ID, result string

		System.out.println("Reports:") ;
		for( String s : Lab4B.getDispatch().getAllResults() ){
			System.out.println(s) ;
		}

		// get list of tests from each lab, and print out total tests per lab

		int totalTest = Lab4B.getReception().getTotalTest() ;
		int totalPathTest = Lab4B.getPathLab().getTests().size() ;
		int totalBioChemTest = Lab4B.getBioChemLab().getTests().size() ;

		System.out.println("Total tests:") ;
		System.out.println("BioChem: " + totalBioChemTest) ;
		System.out.println("Path: " + totalPathTest) ;

	}

}

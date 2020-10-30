import java.util.ArrayList;
public class Billing {

	// data members
	private ArrayList<LabTest> tests = new ArrayList<LabTest>() ;
	private int totalBill = 0 ;
	// methods
	public int getTotalBill(){
		return this.totalBill ;
	}


	public void billTest(LabTest test) {


			if(test.getTestId().substring(0,1).equals("P")){
				test.setPrice(1000) ;
				totalBill += 1000 ;
			}

			else if(test.getTestId().substring(0,1).equals("B")){
				test.setPrice(400) ;
				totalBill += 400 ;
			}

			this.tests.add(test) ;
	 }  // called by Reception

	public ArrayList<String> getBills() {
			ArrayList<String> bills = new ArrayList<String>() ;
			for(LabTest test: this.tests){
				String str = test.getTestId() + " " + Integer.toString(test.getPrice()) ;
				bills.add(str) ;
				System.out.println(str) ;
			}

			return bills ;
	}
	// one string for each test
	// each string has testId and billed amount, separated by a space

}

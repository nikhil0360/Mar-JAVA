// package P1 ;
// import P2.* ;
// import and packages


public class LabTest {

	// data members
	private int price ;
	private String result ;
	private String patientId ;
	private String testId ;

	// getters for data members
	public LabTest(String patientId) { this.patientId = patientId ; }
	public String getPatientId() { return this.patientId ; }
	public int getPrice() { return this.price ; }
	public String getResult() { return this.result ; }
	public String getTestId() { return this.testId ; }

	// setters for datamembers
	public void setPrice(int price){
		this.price = price ;
	}

	public void setResult(String res){
		this.result = res ;
	}

	public void setPatientId(String pid){
		this.patientId = pid ;
	}

	public void setTestid(String tid){
		this.testId = tid ;
	}
}

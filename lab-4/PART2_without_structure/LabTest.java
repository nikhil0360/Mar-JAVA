public class LabTest {

	private int price ;
	private String result ;
	private String patientId ;
	private String testId ;

	LabTest(String patientId) { this.patientId = patientId ; }

	public String getPatientId() { return this.patientId ; }
	public int getPrice() { return this.price ; }
	public String getResult() { return this.result ; }
	public String getTestId() {return this.testId ; }

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

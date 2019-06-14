package soomgosusta.domain;

public class Estimate_Send {
	private String category_Code;
	private String expert_Id;
	private String esend_Date;
	private String esend_Status;
	
	public Estimate_Send() {}

	public Estimate_Send(String category_Code, String expert_Id, String esend_Date, String esend_Status) {
		super();
		this.category_Code = category_Code;
		this.expert_Id = expert_Id;
		this.esend_Date = esend_Date;
		this.esend_Status = esend_Status;
	}

	public String getCategory_Code() {
		return category_Code;
	}

	public void setCategory_Code(String category_Code) {
		this.category_Code = category_Code;
	}

	public String getExpert_Id() {
		return expert_Id;
	}

	public void setExpert_Id(String expert_Id) {
		this.expert_Id = expert_Id;
	}

	public String getEsend_Date() {
		return esend_Date;
	}

	public void setEsend_Date(String esend_Date) {
		this.esend_Date = esend_Date;
	}

	public String getEsend_Status() {
		return esend_Status;
	}

	public void setEsend_Status(String esend_Status) {
		this.esend_Status = esend_Status;
	}
	
	
}

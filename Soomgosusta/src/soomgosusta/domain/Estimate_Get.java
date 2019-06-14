package soomgosusta.domain;

public class Estimate_Get {
	private String member_Id;
	private String category_Code;
	private String eget_Date;
	private String eget_Status;
	
	public Estimate_Get() {}

	public Estimate_Get(String member_Id, String category_Code, String eget_Date, String eget_Status) {
		super();
		this.member_Id = member_Id;
		this.category_Code = category_Code;
		this.eget_Date = eget_Date;
		this.eget_Status = eget_Status;
	}

	public String getMember_Id() {
		return member_Id;
	}

	public void setMember_Id(String member_Id) {
		this.member_Id = member_Id;
	}

	public String getCategory_Code() {
		return category_Code;
	}

	public void setCategory_Code(String category_Code) {
		this.category_Code = category_Code;
	}

	public String getEget_Date() {
		return eget_Date;
	}

	public void setEget_Date(String eget_Date) {
		this.eget_Date = eget_Date;
	}

	public String getEget_Status() {
		return eget_Status;
	}

	public void setEget_Status(String eget_Status) {
		this.eget_Status = eget_Status;
	}
	
	
}

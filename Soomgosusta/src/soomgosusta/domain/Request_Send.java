package soomgosusta.domain;

public class Request_Send {
	private String member_Id;
	private String category_Code;
	private String rsend_Date;
	private String rsend_Status;
	
	public Request_Send() {}

	public Request_Send(String member_Id, String category_Code, String rsend_Date, String rsend_Status) {
		super();
		this.member_Id = member_Id;
		this.category_Code = category_Code;
		this.rsend_Date = rsend_Date;
		this.rsend_Status = rsend_Status;
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

	public String getRsend_Date() {
		return rsend_Date;
	}

	public void setRsend_Date(String rsend_Date) {
		this.rsend_Date = rsend_Date;
	}

	public String getRsend_Status() {
		return rsend_Status;
	}

	public void setRsend_Status(String rsend_Status) {
		this.rsend_Status = rsend_Status;
	}
	
	
}

package soomgosusta.domain;

public class Request_Get {
	private String category_Code;
	private String expert_Id;
	private String rget_Date;
	private String rget_Status;
	
	public Request_Get() {}

	public Request_Get(String category_Code, String expert_Id, String rget_Date, String rget_Status) {
		super();
		this.category_Code = category_Code;
		this.expert_Id = expert_Id;
		this.rget_Date = rget_Date;
		this.rget_Status = rget_Status;
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

	public String getRget_Date() {
		return rget_Date;
	}

	public void setRget_Date(String rget_Date) {
		this.rget_Date = rget_Date;
	}

	public String getRget_Status() {
		return rget_Status;
	}

	public void setRget_Status(String rget_Status) {
		this.rget_Status = rget_Status;
	}
	
	
}

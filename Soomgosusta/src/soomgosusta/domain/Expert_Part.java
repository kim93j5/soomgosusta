package soomgosusta.domain;

public class Expert_Part {
	private String expert_Id;
	private String epart_Part;
	private String epart_Local;
	private String epart_Date;
	private String epart_Day;
	private String epart_Time;
	private String epart_Amount;
	
	public Expert_Part() {}

	public Expert_Part(String expert_Id, String epart_Part, String epart_Local, String epart_Date, String epart_Day,
			String epart_Time, String epart_Amount) {
		super();
		this.expert_Id = expert_Id;
		this.epart_Part = epart_Part;
		this.epart_Local = epart_Local;
		this.epart_Date = epart_Date;
		this.epart_Day = epart_Day;
		this.epart_Time = epart_Time;
		this.epart_Amount = epart_Amount;
	}

	public String getExpert_Id() {
		return expert_Id;
	}

	public void setExpert_Id(String expert_Id) {
		this.expert_Id = expert_Id;
	}

	public String getEpart_Part() {
		return epart_Part;
	}

	public void setEpart_Part(String epart_Part) {
		this.epart_Part = epart_Part;
	}

	public String getEpart_Local() {
		return epart_Local;
	}

	public void setEpart_Local(String epart_Local) {
		this.epart_Local = epart_Local;
	}

	public String getEpart_Date() {
		return epart_Date;
	}

	public void setEpart_Date(String epart_Date) {
		this.epart_Date = epart_Date;
	}

	public String getEpart_Day() {
		return epart_Day;
	}

	public void setEpart_Day(String epart_Day) {
		this.epart_Day = epart_Day;
	}

	public String getEpart_Time() {
		return epart_Time;
	}

	public void setEpart_Time(String epart_Time) {
		this.epart_Time = epart_Time;
	}

	public String getEpart_Amount() {
		return epart_Amount;
	}

	public void setEpart_Amount(String epart_Amount) {
		this.epart_Amount = epart_Amount;
	}
	
	
	
	
}

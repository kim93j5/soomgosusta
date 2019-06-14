package soomgosusta.domain;

public class Estimate {
	private String category_Code;
	private String expert_Id;
	private int estimate_Amount;
	private String estimate_Contents;
	
	public Estimate() {}
	
	public Estimate(String category_Code, String expert_Id, int estimate_Amount, String estimate_Contents) {
		super();
		this.category_Code = category_Code;
		this.expert_Id = expert_Id;
		this.estimate_Amount = estimate_Amount;
		this.estimate_Contents = estimate_Contents;
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

	public int getEstimate_Amount() {
		return estimate_Amount;
	}

	public void setEstimate_Amount(int estimate_Amount) {
		this.estimate_Amount = estimate_Amount;
	}

	public String getEstimate_Contents() {
		return estimate_Contents;
	}

	public void setEstimate_Contents(String estimate_Contents) {
		this.estimate_Contents = estimate_Contents;
	}
	
	
	
}

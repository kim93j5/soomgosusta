package soomgosusta.domain;

public class Match_List {
	private String member_Id;
	private String expert_Id;
	private String category_Code;
	private String mlist_Date;
	private int mlist_Amount;
	
	public Match_List() {}

	public Match_List(String member_Id, String expert_Id, String category_Code, String mlist_Date, int mlist_Amount) {
		super();
		this.member_Id = member_Id;
		this.expert_Id = expert_Id;
		this.category_Code = category_Code;
		this.mlist_Date = mlist_Date;
		this.mlist_Amount = mlist_Amount;
	}

	public String getMember_Id() {
		return member_Id;
	}

	public void setMember_Id(String member_Id) {
		this.member_Id = member_Id;
	}

	public String getExpert_Id() {
		return expert_Id;
	}

	public void setExpert_Id(String expert_Id) {
		this.expert_Id = expert_Id;
	}

	public String getCategory_Code() {
		return category_Code;
	}

	public void setCategory_Code(String category_Code) {
		this.category_Code = category_Code;
	}

	public String getMlist_Date() {
		return mlist_Date;
	}

	public void setMlist_Date(String mlist_Date) {
		this.mlist_Date = mlist_Date;
	}

	public int getMlist_Amount() {
		return mlist_Amount;
	}

	public void setMlist_Amount(int mlist_Amount) {
		this.mlist_Amount = mlist_Amount;
	}

	public String toString() {
		return "Match_List [member_Id=" + member_Id + ", expert_Id=" + expert_Id + ", category_Code=" + category_Code
				+ ", mlist_Date=" + mlist_Date + ", mlist_Amount=" + mlist_Amount + "]";
	}
	
	
}

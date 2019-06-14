package soomgosusta.domain;

public class Match {
	private String member_Id;
	private String expert_Id;
	private int match_Percent;
	
	public Match() {}

	public Match(String member_Id, String expert_Id, int match_Percent) {
		super();
		this.member_Id = member_Id;
		this.expert_Id = expert_Id;
		this.match_Percent = match_Percent;
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

	public int getMatch_Percent() {
		return match_Percent;
	}

	public void setMatch_Percent(int match_Percent) {
		this.match_Percent = match_Percent;
	}
	
	
}

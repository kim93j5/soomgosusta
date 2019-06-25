package soomgosusta.domain;

import java.io.Serializable;

public class Match implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String match_Member_Id;
	private String match_C_Code;
	private int match_R_Seq;
	private String match_Expert_Id;
	private String m_Daterecord;
	private String m_Status;
	private Member member;
	private Category category;
	private float m_Percent;
	
	public Match() {}

	public String getMatch_Member_Id() {
		return match_Member_Id;
	}

	public void setMatch_Member_Id(String match_Member_Id) {
		this.match_Member_Id = match_Member_Id;
	}

	public String getMatch_C_Code() {
		return match_C_Code;
	}

	public void setMatch_C_Code(String match_C_Code) {
		this.match_C_Code = match_C_Code;
	}

	public int getMatch_R_Seq() {
		return match_R_Seq;
	}

	public void setMatch_R_Seq(int match_R_Seq) {
		this.match_R_Seq = match_R_Seq;
	}

	public String getMatch_Expert_Id() {
		return match_Expert_Id;
	}

	public void setMatch_Expert_Id(String match_Expert_Id) {
		this.match_Expert_Id = match_Expert_Id;
	}

	public String getM_Daterecord() {
		return m_Daterecord;
	}

	public void setM_Daterecord(String m_Daterecord) {
		this.m_Daterecord = m_Daterecord;
	}

	public String getM_Status() {
		return m_Status;
	}

	public void setM_Status(String m_Status) {
		this.m_Status = m_Status;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public float getM_Percent() {
		return m_Percent;
	}

	public void setM_Percent(float m_Percent) {
		this.m_Percent = m_Percent;
	}

	@Override
	public String toString() {
		return "Match [match_Member_Id=" + match_Member_Id + ", match_C_Code=" + match_C_Code + ", match_R_Seq="
				+ match_R_Seq + ", match_Expert_Id=" + match_Expert_Id + ", m_Daterecord=" + m_Daterecord
				+ ", m_Status=" + m_Status + ", m_Percent=" + m_Percent + "]";
	}
		
}

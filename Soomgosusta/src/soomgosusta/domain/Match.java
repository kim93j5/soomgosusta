package soomgosusta.domain;

import java.io.Serializable;

public class Match implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String match_Member_Id;
	private String match_C_Code;
	private int match_R_Seq;
	private String match_Expert_Id;
	private float m_Percent;
	private String m_dateRecord;
	private String m_Status;
	
	public Match() {}

	public Match(String match_Member_Id, String match_C_Code, int match_R_Seq, String match_Expert_Id, float m_Percent,
			String m_dateRecord, String m_Status) {
		super();
		this.match_Member_Id = match_Member_Id;
		this.match_C_Code = match_C_Code;
		this.match_R_Seq = match_R_Seq;
		this.match_Expert_Id = match_Expert_Id;
		this.m_Percent = m_Percent;
		this.m_dateRecord = m_dateRecord;
		this.m_Status = m_Status;
	}

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

	public float getM_Percent() {
		return m_Percent;
	}

	public void setM_Percent(float m_Percent) {
		this.m_Percent = m_Percent;
	}

	public String getM_dateRecord() {
		return m_dateRecord;
	}

	public void setM_dateRecord(String m_dateRecord) {
		this.m_dateRecord = m_dateRecord;
	}

	public String getM_Status() {
		return m_Status;
	}

	public void setM_Status(String m_Status) {
		this.m_Status = m_Status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Match [match_Member_Id=" + match_Member_Id + ", match_C_Code=" + match_C_Code + ", match_R_Seq="
				+ match_R_Seq + ", match_Expert_Id=" + match_Expert_Id + ", m_Percent=" + m_Percent + ", m_dateRecord="
				+ m_dateRecord + ", m_Status=" + m_Status + "]";
	}

		
}

package soomgosusta.domain;

import java.io.Serializable;

public class Member implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String member_Id;
	private String m_Password;
	private String m_Name;
	private String m_Pnum;
	private String m_Gender;
	private int m_Age;
	private String m_Divide;
	private String m_Photo;
	
	
	
	public Member() {}



	public Member(String member_Id, String m_Password, String m_Name, String m_Pnum, String m_Gender, int m_Age,
			String m_Divide, String m_Photo) {
		super();
		this.member_Id = member_Id;
		this.m_Password = m_Password;
		this.m_Name = m_Name;
		this.m_Pnum = m_Pnum;
		this.m_Gender = m_Gender;
		this.m_Age = m_Age;
		this.m_Divide = m_Divide;
		this.m_Photo = m_Photo;
	}



	public String getMember_Id() {
		return member_Id;
	}



	public void setMember_Id(String member_Id) {
		this.member_Id = member_Id;
	}



	public String getM_Password() {
		return m_Password;
	}



	public void setM_Password(String m_Password) {
		this.m_Password = m_Password;
	}



	public String getM_Name() {
		return m_Name;
	}



	public void setM_Name(String m_Name) {
		this.m_Name = m_Name;
	}



	public String getM_Pnum() {
		return m_Pnum;
	}



	public void setM_Pnum(String m_Pnum) {
		this.m_Pnum = m_Pnum;
	}



	public String getM_Gender() {
		return m_Gender;
	}



	public void setM_Gender(String m_Gender) {
		this.m_Gender = m_Gender;
	}



	public int getM_Age() {
		return m_Age;
	}



	public void setM_Age(int m_Age) {
		this.m_Age = m_Age;
	}



	public String getM_Divide() {
		return m_Divide;
	}



	public void setM_Divide(String m_Divide) {
		this.m_Divide = m_Divide;
	}



	public String getM_Photo() {
		return m_Photo;
	}



	public void setM_Photo(String m_Photo) {
		this.m_Photo = m_Photo;
	}

	@Override
	public String toString() {
		return "Member [member_Id=" + member_Id + ", m_Password=" + m_Password + ", m_Name=" + m_Name + ", m_Pnum="
				+ m_Pnum + ", m_Gender=" + m_Gender + ", m_Age=" + m_Age + ", m_Divide=" + m_Divide + ", m_Photo="
				+ m_Photo + "]";
	}
	

}

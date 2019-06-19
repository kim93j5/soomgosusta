package soomgosusta.domain;

import java.io.Serializable;

public class Member_Information implements Serializable {
	private String member_User_Id;
	private String c_Code;
	private String mi_District;
	
	public Member_Information(){}
	
	public Member_Information(String member_User_Id, String c_Code, String mi_District) {
		super();
		this.member_User_Id = member_User_Id;
		this.c_Code = c_Code;
		this.mi_District = mi_District;
	}
	public String getMember_User_Id() {
		return member_User_Id;
	}
	public void setMember_User_Id(String member_User_Id) {
		this.member_User_Id = member_User_Id;
	}
	public String getC_Code() {
		return c_Code;
	}
	public void setC_Code(String c_Code) {
		this.c_Code = c_Code;
	}
	public String getMi_District() {
		return mi_District;
	}
	public void setMi_District(String mi_District) {
		this.mi_District = mi_District;
	}
	
	
	
}

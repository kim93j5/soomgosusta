package soomgosusta.domain;

import java.io.Serializable;

public class Member_Information implements Serializable {
	private String Infor_Member_Id;
	private String c_Code;
	private String mi_District;
	
	public Member_Information(){}
	
	public Member_Information(String Infor_Member_Id, String c_Code, String mi_District) {
		super();
		this.Infor_Member_Id = Infor_Member_Id;
		this.c_Code = c_Code;
		this.mi_District = mi_District;
	}
	
	public String getInfor_Member_Id() {
		return Infor_Member_Id;
	}

	public void setInfor_Member_Id(String infor_Member_Id) {
		Infor_Member_Id = infor_Member_Id;
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

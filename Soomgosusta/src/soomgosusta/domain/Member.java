package soomgosusta.domain;

import java.io.Serializable;

public class Member implements Serializable{
	private String member_Id;
	private String member_Password;
	private String member_Name;
	private String member_Gender;
	private String member_Pnum;
	private int member_Age;
	private String member_Photo;
	private String member_Interest;
	
	public Member() {}

	public Member(String member_Id, String member_Password, String member_Name, String member_Gender,
			String member_Pnum, int member_Age, String member_Photo, String member_Interest) {
		super();
		this.member_Id = member_Id;
		this.member_Password = member_Password;
		this.member_Name = member_Name;
		this.member_Gender = member_Gender;
		this.member_Pnum = member_Pnum;
		this.member_Age = member_Age;
		this.member_Photo = member_Photo;
		this.member_Interest = member_Interest;
	}

	public String getMember_Id() {
		return member_Id;
	}

	public void setMember_Id(String member_Id) {
		this.member_Id = member_Id;
	}

	public String getMember_Password() {
		return member_Password;
	}

	public void setMember_Password(String member_Password) {
		this.member_Password = member_Password;
	}

	public String getMember_Name() {
		return member_Name;
	}

	public void setMember_Name(String member_Name) {
		this.member_Name = member_Name;
	}

	public String getMember_Gender() {
		return member_Gender;
	}

	public void setMember_Gender(String member_Gender) {
		this.member_Gender = member_Gender;
	}

	public String getMember_Pnum() {
		return member_Pnum;
	}

	public void setMember_Pnum(String member_Pnum) {
		this.member_Pnum = member_Pnum;
	}

	public int getMember_Age() {
		return member_Age;
	}

	public void setMember_Age(int member_Age) {
		this.member_Age = member_Age;
	}

	public String getMember_Photo() {
		return member_Photo;
	}

	public void setMember_Photo(String member_Photo) {
		this.member_Photo = member_Photo;
	}

	public String getMember_Interest() {
		return member_Interest;
	}

	public void setMember_Interest(String member_Interest) {
		this.member_Interest = member_Interest;
	}

	public String toString() {
		return "Member [member_Id=" + member_Id + ", member_Password=" + member_Password + ", member_Name="
				+ member_Name + ", member_Gender=" + member_Gender + ", member_Pnum=" + member_Pnum + ", member_Age="
				+ member_Age + ", member_Photo=" + member_Photo + ", member_Interest=" + member_Interest + "]";
	}
	
	
}

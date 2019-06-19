package soomgosusta.domain;

import java.io.Serializable;

public class Expert implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String expert_Id;
	private String e_Password;
	private String e_Name;
	private String e_Gender;
	private String e_Pnum;
	private int e_Age;
	private String e_Divide;
	private String e_Photo;
	
	public Expert() {}

	
	public Expert(String expert_Id, String e_Password, String e_Name, String e_Gender, String e_Pnum, int e_Age,
			String e_Divide, String e_Photo) {
		super();
		this.expert_Id = expert_Id;
		this.e_Password = e_Password;
		this.e_Name = e_Name;
		this.e_Gender = e_Gender;
		this.e_Pnum = e_Pnum;
		this.e_Age = e_Age;
		this.e_Divide = e_Divide;
		this.e_Photo = e_Photo;
	}


	public String getExpert_Id() {
		return expert_Id;
	}

	public void setExpert_Id(String expert_Id) {
		this.expert_Id = expert_Id;
	}

	public String getE_Password() {
		return e_Password;
	}

	public void setE_Password(String e_Password) {
		this.e_Password = e_Password;
	}

	public String getE_Name() {
		return e_Name;
	}

	public void setE_Name(String e_Name) {
		this.e_Name = e_Name;
	}

	public String getE_Gender() {
		return e_Gender;
	}

	public void setE_Gender(String e_Gender) {
		this.e_Gender = e_Gender;
	}

	public String getE_Pnum() {
		return e_Pnum;
	}

	public void setE_Pnum(String e_Pnum) {
		this.e_Pnum = e_Pnum;
	}

	public int getE_Age() {
		return e_Age;
	}

	public void setE_Age(int e_Age) {
		this.e_Age = e_Age;
	}

	public String getE_Divide() {
		return e_Divide;
	}

	public void setE_Divide(String e_Divide) {
		this.e_Divide = e_Divide;
	}

	public String getE_Photo() {
		return e_Photo;
	}

	public void setE_Photo(String e_Photo) {
		this.e_Photo = e_Photo;
	}

	@Override
	public String toString() {
		return "Expert [expert_Id=" + expert_Id + ", e_Password=" + e_Password + ", e_Name=" + e_Name + ", e_Gender="
				+ e_Gender + ", e_Pnum=" + e_Pnum + ", e_Age=" + e_Age + ", e_Divide=" + e_Divide + ", e_Photo="
				+ e_Photo + "]";
	}

	
}

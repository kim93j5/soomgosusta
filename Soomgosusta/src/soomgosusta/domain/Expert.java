package soomgosusta.domain;

import java.io.Serializable;

public class Expert implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String expert_Id;
	private String expert_Password;
	private String expert_Name;
	private String expert_Gender;
	private String expert_Pnum;
	private int expert_Age;
	private String expert_Photo;
	
	public Expert() {}

	public Expert(String expert_Id, String expert_Password, String expert_Name, String expert_Gender,
			String expert_Pnum, int expert_Age, String expert_Photo) {
		super();
		this.expert_Id = expert_Id;
		this.expert_Password = expert_Password;
		this.expert_Name = expert_Name;
		this.expert_Gender = expert_Gender;
		this.expert_Pnum = expert_Pnum;
		this.expert_Age = expert_Age;
		this.expert_Photo = expert_Photo;
	}

	public String getExpert_Id() {
		return expert_Id;
	}

	public void setExpert_Id(String expert_Id) {
		this.expert_Id = expert_Id;
	}

	public String getExpert_Password() {
		return expert_Password;
	}

	public void setExpert_Password(String expert_Password) {
		this.expert_Password = expert_Password;
	}

	public String getExpert_Name() {
		return expert_Name;
	}

	public void setExpert_Name(String expert_Name) {
		this.expert_Name = expert_Name;
	}

	public String getExpert_Gender() {
		return expert_Gender;
	}

	public void setExpert_Gender(String expert_Gender) {
		this.expert_Gender = expert_Gender;
	}

	public String getExpert_Pnum() {
		return expert_Pnum;
	}

	public void setExpert_Pnum(String expert_Pnum) {
		this.expert_Pnum = expert_Pnum;
	}

	public int getExpert_Age() {
		return expert_Age;
	}

	public void setExpert_Age(int expert_Age) {
		this.expert_Age = expert_Age;
	}

	public String getExpert_Photo() {
		return expert_Photo;
	}

	public void setExpert_Photo(String expert_Photo) {
		this.expert_Photo = expert_Photo;
	}

	public String toString() {
		return "Expert [expert_Id=" + expert_Id + ", expert_Password=" + expert_Password + ", expert_Name="
				+ expert_Name + ", expert_Gender=" + expert_Gender + ", expert_Pnum=" + expert_Pnum + ", expert_Age="
				+ expert_Age + ", expert_Photo=" + expert_Photo + "]";
	}
	
}

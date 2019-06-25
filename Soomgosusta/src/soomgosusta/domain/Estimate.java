package soomgosusta.domain;

import java.io.Serializable;

public class Estimate implements Serializable{
	
	private String estimate_C_Code;
	private int estimate_R_Seq;
	private String estimate_Expert_Id;
	private String estimate_Member_Id;
	private String e_Contents;
	private String e_Amountpart;
	private String e_Amount;
	private String e_Daterecord;
	
	private Member member;
	private Category category;
	
	
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
	public String getEstimate_C_Code() {
		return estimate_C_Code;
	}
	public void setEstimate_C_Code(String estimate_C_Code) {
		this.estimate_C_Code = estimate_C_Code;
	}
	public int getEstimate_R_Seq() {
		return estimate_R_Seq;
	}
	public void setEstimate_R_Seq(int estimate_R_Seq) {
		this.estimate_R_Seq = estimate_R_Seq;
	}
	public String getEstimate_Expert_Id() {
		return estimate_Expert_Id;
	}
	public void setEstimate_Expert_Id(String estimate_Expert_Id) {
		this.estimate_Expert_Id = estimate_Expert_Id;
	}
	public String getEstimate_Member_Id() {
		return estimate_Member_Id;
	}
	public void setEstimate_Member_Id(String estimate_Member_Id) {
		this.estimate_Member_Id = estimate_Member_Id;
	}
	public String getE_Contents() {
		return e_Contents;
	}
	public void setE_Contents(String e_Contents) {
		this.e_Contents = e_Contents;
	}
	
	public String getE_Amountpart() {
		return e_Amountpart;
	}
	public void setE_Amountpart(String e_Amountpart) {
		this.e_Amountpart = e_Amountpart;
	}
	public String getE_Amount() {
		return e_Amount;
	}
	public void setE_Amount(String e_Amount) {
		this.e_Amount = e_Amount;
	}
	public String getE_Daterecord() {
		return e_Daterecord;
	}
	public void setE_Daterecord(String e_Daterecord) {
		this.e_Daterecord = e_Daterecord;
	}
	@Override
	public String toString() {
		return e_Amount + e_Amountpart + e_Contents + estimate_C_Code ;
	}
	
	
	
	
	
	
}

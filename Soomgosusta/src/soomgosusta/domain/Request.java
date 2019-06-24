package soomgosusta.domain;

import java.io.Serializable;
import java.util.Date;

public class Request implements Serializable {

	private static final long serialVersionUID = 1L;
	private String request_Member_Id;
	private String request_C_Code;
	private int r_Seq;
	private String r_QA_01;
	private String r_QA_02;
	private String r_QA_03;
	private String r_QA_04;
	private String r_QA_05;
	private String r_QA_06;
	private String r_QA_07;
	private String r_QA_08;
	private String r_QA_09;
	private String r_QA_10;
	private String r_QA_11;
	private String r_QA_12;
	private String r_QA_13;
	private String r_QA_14;
	private String r_QA_15;
	private Date r_DateRecord;
	private String r_Status;

	public Request() {}
	
	

	public Request(String request_Member_Id, String request_C_Code, int r_Seq, String r_QA_01, String r_QA_02,
			String r_QA_03, String r_QA_04, String r_QA_05, String r_QA_06, String r_QA_07, String r_QA_08,
			String r_QA_09, String r_QA_10, String r_QA_11, String r_QA_12, String r_QA_13, String r_QA_14,
			String r_QA_15, Date r_DateRecord, String r_Status) {
		super();
		this.request_Member_Id = request_Member_Id;
		this.request_C_Code = request_C_Code;
		this.r_Seq = r_Seq;
		this.r_QA_01 = r_QA_01;
		this.r_QA_02 = r_QA_02;
		this.r_QA_03 = r_QA_03;
		this.r_QA_04 = r_QA_04;
		this.r_QA_05 = r_QA_05;
		this.r_QA_06 = r_QA_06;
		this.r_QA_07 = r_QA_07;
		this.r_QA_08 = r_QA_08;
		this.r_QA_09 = r_QA_09;
		this.r_QA_10 = r_QA_10;
		this.r_QA_11 = r_QA_11;
		this.r_QA_12 = r_QA_12;
		this.r_QA_13 = r_QA_13;
		this.r_QA_14 = r_QA_14;
		this.r_QA_15 = r_QA_15;
		this.r_DateRecord = r_DateRecord;
		this.r_Status = r_Status;
	}



	public String getRequest_Member_Id() {
		return request_Member_Id;
	}

	public void setRequest_Member_Id(String request_Member_Id) {
		this.request_Member_Id = request_Member_Id;
	}

	public String getRequest_C_Code() {
		return request_C_Code;
	}

	public void setRequest_C_Code(String request_C_Code) {
		this.request_C_Code = request_C_Code;
	}

	public int getR_Seq() {
		return r_Seq;
	}

	public void setR_Seq(int r_Seq) {
		this.r_Seq = r_Seq;
	}

	public String getR_QA_01() {
		return r_QA_01;
	}

	public void setR_QA_01(String r_QA_01) {
		this.r_QA_01 = r_QA_01;
	}

	public String getR_QA_02() {
		return r_QA_02;
	}

	public void setR_QA_02(String r_QA_02) {
		this.r_QA_02 = r_QA_02;
	}

	public String getR_QA_03() {
		return r_QA_03;
	}

	public void setR_QA_03(String r_QA_03) {
		this.r_QA_03 = r_QA_03;
	}

	public String getR_QA_04() {
		return r_QA_04;
	}

	public void setR_QA_04(String r_QA_04) {
		this.r_QA_04 = r_QA_04;
	}

	public String getR_QA_05() {
		return r_QA_05;
	}

	public void setR_QA_05(String r_QA_05) {
		this.r_QA_05 = r_QA_05;
	}

	public String getR_QA_06() {
		return r_QA_06;
	}

	public void setR_QA_06(String r_QA_06) {
		this.r_QA_06 = r_QA_06;
	}

	public String getR_QA_07() {
		return r_QA_07;
	}

	public void setR_QA_07(String r_QA_07) {
		this.r_QA_07 = r_QA_07;
	}

	public String getR_QA_08() {
		return r_QA_08;
	}

	public void setR_QA_08(String r_QA_08) {
		this.r_QA_08 = r_QA_08;
	}

	public String getR_QA_09() {
		return r_QA_09;
	}

	public void setR_QA_09(String r_QA_09) {
		this.r_QA_09 = r_QA_09;
	}

	public String getR_QA_10() {
		return r_QA_10;
	}

	public void setR_QA_10(String r_QA_10) {
		this.r_QA_10 = r_QA_10;
	}

	public String getR_QA_11() {
		return r_QA_11;
	}

	public void setR_QA_11(String r_QA_11) {
		this.r_QA_11 = r_QA_11;
	}

	public String getR_QA_12() {
		return r_QA_12;
	}

	public void setR_QA_12(String r_QA_12) {
		this.r_QA_12 = r_QA_12;
	}

	public String getR_QA_13() {
		return r_QA_13;
	}

	public void setR_QA_13(String r_QA_13) {
		this.r_QA_13 = r_QA_13;
	}

	public String getR_QA_14() {
		return r_QA_14;
	}

	public void setR_QA_14(String r_QA_14) {
		this.r_QA_14 = r_QA_14;
	}

	public String getR_QA_15() {
		return r_QA_15;
	}

	public void setR_QA_15(String r_QA_15) {
		this.r_QA_15 = r_QA_15;
	}

	public Date getR_DateRecord() {
		return r_DateRecord;
	}

	public void setR_DateRecord(Date r_DateRecord) {
		this.r_DateRecord = r_DateRecord;
	}

	public String getR_Status() {
		return r_Status;
	}

	public void setR_Status(String r_Status) {
		this.r_Status = r_Status;
	}
	
	
}

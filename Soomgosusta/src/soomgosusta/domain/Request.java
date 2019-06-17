package soomgosusta.domain;

import java.io.Serializable;

public class Request implements Serializable {

	private static final long serialVersionUID = 1L;

	private String member_Id;
	private String category_Code;
	private String request_QA_1;
	private String request_QA_2;
	private String request_QA_3;
	private String request_QA_4;
	private String request_QA_5;
	private String request_QA_6;
	private String request_QA_7;
	private String request_QA_8;
	private String request_QA_9;
	private String request_QA_10;
	private String request_Date;
	
	public Request() {}

	public Request(String member_Id, String category_Code, String request_QA_1, String request_QA_2,
			String request_QA_3, String request_QA_4, String request_QA_5, String request_QA_6, String request_QA_7,
			String request_QA_8, String request_QA_9, String request_QA_10, String request_Date) {
		super();
		this.member_Id = member_Id;
		this.category_Code = category_Code;
		this.request_QA_1 = request_QA_1;
		this.request_QA_2 = request_QA_2;
		this.request_QA_3 = request_QA_3;
		this.request_QA_4 = request_QA_4;
		this.request_QA_5 = request_QA_5;
		this.request_QA_6 = request_QA_6;
		this.request_QA_7 = request_QA_7;
		this.request_QA_8 = request_QA_8;
		this.request_QA_9 = request_QA_9;
		this.request_QA_10 = request_QA_10;
		this.request_Date = request_Date;
	}

	public String getMember_Id() {
		return member_Id;
	}

	public void setMember_Id(String member_Id) {
		this.member_Id = member_Id;
	}

	public String getCategory_Code() {
		return category_Code;
	}

	public void setCategory_Code(String category_Code) {
		this.category_Code = category_Code;
	}

	public String getRequest_QA_1() {
		return request_QA_1;
	}

	public void setRequest_QA_1(String request_QA_1) {
		this.request_QA_1 = request_QA_1;
	}

	public String getRequest_QA_2() {
		return request_QA_2;
	}

	public void setRequest_QA_2(String request_QA_2) {
		this.request_QA_2 = request_QA_2;
	}

	public String getRequest_QA_3() {
		return request_QA_3;
	}

	public void setRequest_QA_3(String request_QA_3) {
		this.request_QA_3 = request_QA_3;
	}

	public String getRequest_QA_4() {
		return request_QA_4;
	}

	public void setRequest_QA_4(String request_QA_4) {
		this.request_QA_4 = request_QA_4;
	}

	public String getRequest_QA_5() {
		return request_QA_5;
	}

	public void setRequest_QA_5(String request_QA_5) {
		this.request_QA_5 = request_QA_5;
	}

	public String getRequest_QA_6() {
		return request_QA_6;
	}

	public void setRequest_QA_6(String request_QA_6) {
		this.request_QA_6 = request_QA_6;
	}

	public String getRequest_QA_7() {
		return request_QA_7;
	}

	public void setRequest_QA_7(String request_QA_7) {
		this.request_QA_7 = request_QA_7;
	}

	public String getRequest_QA_8() {
		return request_QA_8;
	}

	public void setRequest_QA_8(String request_QA_8) {
		this.request_QA_8 = request_QA_8;
	}

	public String getRequest_QA_9() {
		return request_QA_9;
	}

	public void setRequest_QA_9(String request_QA_9) {
		this.request_QA_9 = request_QA_9;
	}

	public String getRequest_QA_10() {
		return request_QA_10;
	}

	public void setRequest_QA_10(String request_QA_10) {
		this.request_QA_10 = request_QA_10;
	}

	public String getRequest_Date() {
		return request_Date;
	}

	public void setRequest_Date(String request_Date) {
		this.request_Date = request_Date;
	}

	@Override
	public String toString() {
		return "Request [member_Id=" + member_Id + ", category_Code=" + category_Code + ", request_QA_1=" + request_QA_1
				+ ", request_QA_2=" + request_QA_2 + ", request_QA_3=" + request_QA_3 + ", request_QA_4=" + request_QA_4
				+ ", request_QA_5=" + request_QA_5 + ", request_QA_6=" + request_QA_6 + ", request_QA_7=" + request_QA_7
				+ ", request_QA_8=" + request_QA_8 + ", request_QA_9=" + request_QA_9 + ", request_QA_10="
				+ request_QA_10 + ", request_Date=" + request_Date + "]";
	}

	
}

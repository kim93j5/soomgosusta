package soomgosusta.domain;

import java.io.Serializable;

public class Category_Log implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String log_c_Code;
	private int cl_Search;
	private int cl_Match;
	private int cl_Request;
	private int cl_Employment;
	private int cl_Register;
	
	public Category_Log() {}

	public Category_Log(String log_c_Code, int cl_Search, int cl_Match, int cl_Request, int cl_Employment,
			int cl_Register) {
		super();
		this.log_c_Code = log_c_Code;
		this.cl_Search = cl_Search;
		this.cl_Match = cl_Match;
		this.cl_Request = cl_Request;
		this.cl_Employment = cl_Employment;
		this.cl_Register = cl_Register;
	}

	public String getLog_c_Code() {
		return log_c_Code;
	}

	public void setLog_c_Code(String log_c_Code) {
		this.log_c_Code = log_c_Code;
	}

	public int getCl_Search() {
		return cl_Search;
	}

	public void setCl_Search(int cl_Search) {
		this.cl_Search = cl_Search;
	}

	public int getCl_Match() {
		return cl_Match;
	}

	public void setCl_Match(int cl_Match) {
		this.cl_Match = cl_Match;
	}

	public int getCl_Request() {
		return cl_Request;
	}

	public void setCl_Request(int cl_Request) {
		this.cl_Request = cl_Request;
	}

	public int getCl_Employment() {
		return cl_Employment;
	}

	public void setCl_Employment(int cl_Employment) {
		this.cl_Employment = cl_Employment;
	}

	public int getCl_Register() {
		return cl_Register;
	}

	public void setCl_Register(int cl_Register) {
		this.cl_Register = cl_Register;
	}

	@Override
	public String toString() {
		return "Category_Log [log_c_Code=" + log_c_Code + ", cl_Search=" + cl_Search + ", cl_Match=" + cl_Match
				+ ", cl_Request=" + cl_Request + ", cl_Employment=" + cl_Employment + ", cl_Register=" + cl_Register
				+ "]";
	}

}

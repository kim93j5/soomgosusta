package soomgosusta.domain;

public class Category_Log {
	private String clog_Code;
	private int clog_Employ;
	private int clog_Matching;
	private int clog_Request;
	private int clog_Search;
	private int clog_ExpertRegister;
	
	public Category_Log() {}

	
	
	public Category_Log(String clog_Code, int clog_Employ, int clog_Matching, int clog_Request, int clog_Search,
			int clog_ExpertRegister) {
		super();
		this.clog_Code = clog_Code;
		this.clog_Employ = clog_Employ;
		this.clog_Matching = clog_Matching;
		this.clog_Request = clog_Request;
		this.clog_Search = clog_Search;
		this.clog_ExpertRegister = clog_ExpertRegister;
	}



	public String getClog_Code() {
		return clog_Code;
	}

	public void setClog_Code(String clog_Code) {
		this.clog_Code = clog_Code;
	}

	public int getClog_Employ() {
		return clog_Employ;
	}

	public void setClog_Employ(int clog_Employ) {
		this.clog_Employ = clog_Employ;
	}

	public int getClog_Matching() {
		return clog_Matching;
	}

	public void setClog_Matching(int clog_Matching) {
		this.clog_Matching = clog_Matching;
	}

	public int getClog_Request() {
		return clog_Request;
	}

	public void setClog_Request(int clog_Request) {
		this.clog_Request = clog_Request;
	}

	public int getClog_Search() {
		return clog_Search;
	}

	public void setClog_Search(int clog_Search) {
		this.clog_Search = clog_Search;
	}

	public int getClog_ExpertRegister() {
		return clog_ExpertRegister;
	}

	public void setClog_ExpertRegister(int clog_ExpertRegister) {
		this.clog_ExpertRegister = clog_ExpertRegister;
	}
	
	
	}

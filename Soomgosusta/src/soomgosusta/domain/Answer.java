package soomgosusta.domain;

import java.io.Serializable;

public class Answer implements Serializable{
	private static final long serialVersionUID = 1L;

	private String a_Code;
	private String a_Contents;
	private String q_Code;
	
	public Answer() {}

	public Answer(String a_Code, String a_Contents, String q_Code) {
		super();
		this.a_Code = a_Code;
		this.a_Contents = a_Contents;
		this.q_Code = q_Code;
	}

	public String getA_Code() {
		return a_Code;
	}

	public void setA_Code(String a_Code) {
		this.a_Code = a_Code;
	}

	public String getA_Contents() {
		return a_Contents;
	}

	public void setA_Contents(String a_Contents) {
		this.a_Contents = a_Contents;
	}

	public String getQ_Code() {
		return q_Code;
	}

	public void setQ_Code(String q_Code) {
		this.q_Code = q_Code;
	}

	@Override
	public String toString() {
		return "Answer [a_Code=" + a_Code + ", a_Contents=" + a_Contents + ", q_Code=" + q_Code + "]";
	}


	
}

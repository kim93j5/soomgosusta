package soomgosusta.domain;

import java.io.Serializable;

public class Question implements Serializable {
	private static final long serialVersionUID = 1L;
	private String q_Code;
	private String q_Contents;
	
	public Question(){}
	
	public Question(String q_Code, String q_Contents) {
		super();
		this.q_Code = q_Code;
		this.q_Contents = q_Contents;
	}

	public String getQ_Code() {
		return q_Code;
	}

	public void setQ_Code(String q_Code) {
		this.q_Code = q_Code;
	}

	public String getQ_Contents() {
		return q_Contents;
	}

	public void setQ_Contents(String q_Contents) {
		this.q_Contents = q_Contents;
	}

	@Override
	public String toString() {
		return "Question [q_Code=" + q_Code + ", q_Contents=" + q_Contents + "]";
	}
	
	
}

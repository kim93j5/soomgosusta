package soomgosusta.domain;

import java.io.Serializable;

public class District implements Serializable {
	String sido;
	String sigungu;
	String question_code;
	
	public District(){}
	public District(String sido, String sigungu, String question_code) {
		super();
		this.sido = sido;
		this.sigungu = sigungu;
		this.question_code = question_code;
	}
	public String getSido() {
		return sido;
	}
	public void setSido(String sido) {
		this.sido = sido;
	}
	public String getSigungu() {
		return sigungu;
	}
	public void setSigungu(String sigungu) {
		this.sigungu = sigungu;
	}
	public String getQuestion_code() {
		return question_code;
	}
	public void setQuestion_code(String question_code) {
		this.question_code = question_code;
	}
	
	
}

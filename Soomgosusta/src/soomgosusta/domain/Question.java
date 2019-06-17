package soomgosusta.domain;

import java.io.Serializable;

public class Question implements Serializable {
	private static final long serialVersionUID = 1L;
	private String question_Code;
	private String question_Contents;
	
	public Question() {}
	
	
	public Question(String question_Code, String question_Contents) {
		super();
		this.question_Code = question_Code;
		this.question_Contents = question_Contents;
	}


	public String getQuestion_Code() {
		return question_Code;
	}

	public void setQuestion_Code(String question_Code) {
		this.question_Code = question_Code;
	}

	public String getQuestion_Contents() {
		return question_Contents;
	}

	public void setQuestion_Contents(String question_Contents) {
		this.question_Contents = question_Contents;
	}

	@Override
	public String toString() {
		return "Question [question_Code=" + question_Code + ", question_Contents=" + question_Contents + "]";
	}
	
}

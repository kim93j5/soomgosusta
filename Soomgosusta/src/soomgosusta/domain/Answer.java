package soomgosusta.domain;

import java.io.Serializable;

public class Answer implements Serializable{
	private static final long serialVersionUID = 1L;

	private String answer_Code;
	private String answer_Content;
	private String question_Code;
	
	public Answer() {}

	public Answer(String answer_Code, String answer_Content, String question_Code) {
		super();
		this.answer_Code = answer_Code;
		this.answer_Content = answer_Content;
		this.question_Code = question_Code;
	}

	public String getAnswer_Code() {
		return answer_Code;
	}

	public void setAnswer_Code(String answer_Code) {
		this.answer_Code = answer_Code;
	}

	public String getAnswer_Content() {
		return answer_Content;
	}

	public void setAnswer_Content(String answer_Content) {
		this.answer_Content = answer_Content;
	}

	public String getQuestion_Code() {
		return question_Code;
	}

	public void setQuestion_Code(String question_Code) {
		this.question_Code = question_Code;
	}

	@Override
	public String toString() {
		return "Answer [answer_Code=" + answer_Code + ", answer_Content=" + answer_Content + ", question_Code="
				+ question_Code + "]";
	}
	
}

package soomgosusta.domain;

public class Answer {
	private String answer_Code;
	private String answer_Contents;
	private String question_Code;
	
	public Answer() {}

	public Answer(String answer_Code, String answer_Contents, String question_Code) {
		super();
		this.answer_Code = answer_Code;
		this.answer_Contents = answer_Contents;
		this.question_Code = question_Code;
	}

	public String getAnswer_Code() {
		return answer_Code;
	}

	public void setAnswer_Code(String answer_Code) {
		this.answer_Code = answer_Code;
	}

	public String getAnswer_Contents() {
		return answer_Contents;
	}

	public void setAnswer_Contents(String answer_Contents) {
		this.answer_Contents = answer_Contents;
	}

	public String getQuestion_Code() {
		return question_Code;
	}

	public void setQuestion_Code(String question_Code) {
		this.question_Code = question_Code;
	}
	
	
}

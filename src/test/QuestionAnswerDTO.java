package test;

import java.io.Serializable;

public class QuestionAnswerDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	

	private String Answer;

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}



}

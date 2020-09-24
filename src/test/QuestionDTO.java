package test;

import java.io.Serializable;

public class QuestionDTO implements Serializable{
	private static final long serialVersionUID = 1L;


	private String Question;

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}



}

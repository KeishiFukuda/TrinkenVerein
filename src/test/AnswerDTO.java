package test;

import java.io.Serializable;

public class AnswerDTO implements Serializable{
	private static final long serialVersionUID = 1L;


	private String Answer0;
	private String Answer1;

	public String getAnswer1() {
		return Answer1;
	}

	public void setAnswer1(String answer1) {
		Answer1 = answer1;
	}

	public String getAnswer() {
		return Answer0;
	}

	public void setAnswer(String answer) {
		Answer0 = answer;
	}



}

package dto;

import java.io.Serializable;

public class QuestionDTO implements Serializable{
	private static final long serialVersionUID = 1L;


	private String question;

	private String questionId;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}


}

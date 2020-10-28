package dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class QuestionDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private String question;
	private String questionId;

}

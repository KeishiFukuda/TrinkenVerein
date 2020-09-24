package test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/QuestionTest")
public class QuestionTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String answers = request.getParameter("answer");

		String chooseQ = "DO YOU LIKE WINE ?";
		if(answers.equals("A1")) {
			//次の質問を表示
			chooseQ = "DO YOU LIKE BEER ?";
			}else {
			//結果を表示(画面遷移)
		}
		request.setAttribute("Question", chooseQ);

		QuestionAnswerDTO answer = new QuestionAnswerDTO();
		answer.setAnswer(answers);
	}

}

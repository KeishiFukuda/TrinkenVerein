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
		AnswerDTO answer =new AnswerDTO();
		answer.setAnswer(answers);

		TestService ts = new TestService();
		QuestionDTO qd = ts.move(answer);


		request.setAttribute("Question", qd.getQuestion());

	}

}

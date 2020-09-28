package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestInitServlet")
public class TestInitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionDTO question = new QuestionDTO();
		question.setQuestion("ビールが好き？or苦手？");
		question.setQuestionId("q1");
		request.setAttribute("question", question);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/questionTest.jsp");
		dispatcher.forward(request, response);


	}

}
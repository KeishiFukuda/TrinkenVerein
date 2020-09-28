package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.QuestionDTO;

@WebServlet("/QuestionServlet")
public class QuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<String> questions = new ArrayList<String>();
		//		questions.add("ビールが好き？or苦手？");  <== 初期値はinitServletで受け渡し。
		questions.add("苦味・渋味orフルーティ");
		questions.add("値段高い？or安い？");

		QuestionDTO question = new QuestionDTO();
		if (request.getParameter("questionId").equals("q1")) {
			if (request.getParameter("answer").equals("A1")) {
				question.setQuestion(questions.get(0));
				question.setQuestionId("q2");

				request.setAttribute("question", question);

				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/recruit.jsp");
				dispatcher.forward(request, response);
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/recruit.jsp");
				dispatcher.forward(request, response);
			}

		} else if (request.getParameter("questionId").equals("q2")) {
			if (request.getParameter("answer").equals("A1")) {
				question.setQuestion(questions.get(1));
				question.setQuestionId("q3");

				request.setAttribute("question", question);

				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/recruit.jsp");
				dispatcher.forward(request, response);
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/recruit.jsp");
				dispatcher.forward(request, response);
			}

		}else if(request.getParameter("questionId").equals("q3")) {
			if(request.getParameter("answer").equals("A1")) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/recruit.jsp");
				dispatcher.forward(request, response);
			}else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/recruit.jsp");
				dispatcher.forward(request, response);
			}
		}

	}

}
//ネームは変えない、hidden属性でquestionIDをそれぞれの質問に振る

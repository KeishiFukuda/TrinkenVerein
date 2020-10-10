package servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.UserDataDTO;
import service.UserService;
import util.Checker;

@WebServlet("/UserRegisterServlet")
public class UserRegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		boolean hasError = false;

		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("user_name");
		String id = request.getParameter("user_id");
		String password = request.getParameter("password");
		String birthday = request.getParameter("age");

		if (Checker.checkName(name) != name) {
			request.setAttribute("nameMessage", Checker.checkName(name));
			hasError = true;
		}
		if (Checker.checkId(id) != id) {
			request.setAttribute("idMessage", Checker.checkId(id));
			hasError = true;
		}
		if (Checker.checkPassword(password) != password) {
			request.setAttribute("passwordMessage", Checker.checkPassword(password));
			hasError = true;
		}
		try {
			if (Checker.checkAge(birthday) != birthday) {
				request.setAttribute("ageMessage", Checker.checkAge(birthday));
				hasError = true;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		if (hasError) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/register.jsp");
			dispatcher.forward(request, response);
			return;
		}

		UserService service = new UserService();

		UserDataDTO userData = new UserDataDTO();

		userData.setUserName(name);
		userData.setUserId(id);
		userData.setPassword(password);
		userData.setAge(birthday);

		service.registerUser(userData);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registerSuccess.jsp");
		dispatcher.forward(request, response);

	}
}

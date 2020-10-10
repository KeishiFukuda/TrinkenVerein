package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.UserInfoEntity;

/**
 * ログアウト処理
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		UserInfoEntity userInfoEntity = (UserInfoEntity) session.getAttribute("LOGIN_USER_ENTITY");

		if (userInfoEntity == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/menu.jsp");
			dispatcher.forward(request, response);
		} else {
			request.getSession().invalidate();

			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/seeyou.jsp");
			dispatcher.forward(request, response);
		}

	}

}

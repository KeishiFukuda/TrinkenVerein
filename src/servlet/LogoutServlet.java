package servlet;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletContext;
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

		ServletContext application = request.getServletContext();
		Set<String> userIdSet = (Set<String>) application.getAttribute("USER_ID_SET");
		if (userIdSet != null && userInfoEntity != null) {
			userIdSet.remove(userInfoEntity.getUserId());
		}

		request.getSession().invalidate();
		response.sendRedirect(request.getContextPath());
	}

}

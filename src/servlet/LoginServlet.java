package servlet;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.UserDataDTO;
import entity.UserInfoEntity;
import service.RegisterService;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = request.getParameter("userId");
		String password = request.getParameter("password");

		UserDataDTO userData = new UserDataDTO();
		userData.setUserId(userId);
		userData.setPassword(password);

		//LoginFormValidator.validate(loginForm);

		try {
			RegisterService registerService = new RegisterService();
			UserDataDTO userDataDTO = new UserDataDTO();
			userDataDTO.setUserId(userId);
			userDataDTO.setPassword(password);

			UserInfoEntity userInfoEntity = registerService.loginUser(userDataDTO);

			//ログイン情報をセッションに保存
			HttpSession session = request.getSession();
			session.setAttribute("LOGIN_USER_ENTITY", userInfoEntity);

			if (userInfoEntity != null) {
				//アプリケーションスコープにユーザーIDを追加する

				ServletContext application = request.getServletContext();
				Set<String> userIdSet = (Set<String>)application.getAttribute("USER_ID_SET");
				if(userIdSet == null) {
					 userIdSet = new HashSet<String>();
					 application.setAttribute("USER_ID_SET", userIdSet);
				}
				userIdSet.add(userInfoEntity.getUserId());

				// メニュー画面へ遷移
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/menu.jsp");
				dispatcher.forward(request, response);
			} else {

				// ログイン画面へ再遷移
				request.setAttribute("message", "ユーザIDまたはパスワードが間違っています。");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
				dispatcher.forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}

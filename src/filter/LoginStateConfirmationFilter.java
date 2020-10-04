package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import entity.UserInfoEntity;

/**
 * Servlet Filter implementation class LoginStateConfirmationFilter
 */
@WebFilter("/QuestionInitServlet")
public class LoginStateConfirmationFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {


		//セッションスコープ"LOGIN_USER_ENTITY"の取得
		//"LOGIN_USER_ENTITY"が存在しない場合NULLが返される
		HttpSession session = ((HttpServletRequest) request).getSession();
		UserInfoEntity userInfoEntity = (UserInfoEntity) session.getAttribute("LOGIN_USER_ENTITY");

		if (userInfoEntity != null) {
			// セッションがNULLでなければ、通常どおりの遷移
			chain.doFilter(request, response);
		} else {
			// セッションがNULLならば、login.jsp（ログイン画面）へ遷移
			request.setAttribute("loginRequestInformation", "ビール検索をご利用の方は、ログインをお願いします。");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
			dispatcher.forward(request, response);
		}

	}

	public void init(FilterConfig config) throws ServletException {
	}

	public void destroy() {
	}
}
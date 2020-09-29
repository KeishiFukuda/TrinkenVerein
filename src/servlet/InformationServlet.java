package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.BeerEntity;
import logic.ProductLogic;

@WebServlet("/InformationServlet")
public class InformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//質問サーブレットからDB検索条件のインスタンスを取得
		HttpSession session = request.getSession();
		BeerEntity beerCondition = (BeerEntity)session.getAttribute("beerCondition");

		//ProductLogicを実行し結果を設定
		ProductLogic productLogic = new ProductLogic();
		List<BeerEntity> beerResultList = productLogic.execute(beerCondition);

		// リクエストスコープに結果設定を保存
		request.setAttribute("beerResultList", beerResultList);

		//Information.jspにフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/information.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}

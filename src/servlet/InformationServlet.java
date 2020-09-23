package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.BeerEntity;
import logic.ProductLogic;

@WebServlet("/InformationServlet")
public class InformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//リクエストパラメータを取得
		String registerId = request.getParameter("registerId");

		//入力値をプロパティに設定
		BeerEntity beerEntity = new BeerEntity();
		beerEntity.setRegisterId(registerId);

		//ProductLogicを実行し結果を設定
		ProductLogic productLogic = new ProductLogic();
		BeerEntity result= productLogic.execute(beerEntity);

		// リクエストスコープに保存する
		request.setAttribute("beerEntity", result);

		//Information.jspにフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/information.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}

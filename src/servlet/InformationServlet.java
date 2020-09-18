package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.BeerEntity;

@WebServlet("/InformationServlet")
public class InformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productName = ((BeerEntity) request).getProductName();
		String classification = ((BeerEntity) request).getClassification();
		String introduction = ((BeerEntity) request).getIntroduction();
		String price = ((BeerEntity) request).getPrice();
		String shopUrl = ((BeerEntity) request).getShopUrl();

		BeerEntity beerEntity = new BeerEntity();
		beerEntity.setProductName(productName);
		beerEntity.setClassification(classification);
		beerEntity.setIntroduction(introduction);
		beerEntity.setPrice(price);
		beerEntity.setShopUrl(shopUrl);

		//Information.jspにフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/Information.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}

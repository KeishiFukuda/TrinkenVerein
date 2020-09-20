package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.BeerEntity;
import logic.ProductLogic;

@WebServlet("/ResultBeerServlet")
public class ResultBeerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BeerEntity beer = new BeerEntity();
		beer.setRegisterId(request.getParameter("register_id"));


		ProductLogic pl = new ProductLogic();
		try {
			pl.find(beer);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}

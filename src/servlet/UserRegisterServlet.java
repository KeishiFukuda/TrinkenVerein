package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.postgresql.util.PSQLException;

import dto.UserDataDTO;
import dto.checkerDTO;
import util.Checker;
import util.Util;

/**
 * ユーザー登録サーブレット
 */
@WebServlet("/UserRegisterServlet")
public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		doPost(request,response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		boolean hasError = false;
		checkerDTO nameDto = Checker.checkName(request.getParameter("user_name"));
		String UserName = nameDto.getUserName();

		checkerDTO idDto =Checker.checkId(request.getParameter("user_id"));
		String UserId = idDto.getUserId();

		checkerDTO passwordDto = Checker.checkPassword(request.getParameter("password"));
		String Password = passwordDto.getUserPassword();


		if(nameDto.getMessage() != null) {
			request.setAttribute("nameMessage", nameDto);
			hasError = true;
		}

		if(idDto.getMessage()!= null) {
			request.setAttribute("idMessage", idDto);
			hasError = true;
		}

		if(passwordDto.getMessage()!= null) {
			request.setAttribute("passwordMessage",passwordDto);
			hasError = true;
		}
		if(hasError) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/register.jsp");
			dispatcher.forward(request, response);
		}









		String Age = request.getParameter("age");



		UserDataDTO userData = new UserDataDTO();
		userData.setAge(Age);
		userData.setPassword(Password);
		userData.setUserId(UserId);
		userData.setUserName(UserName);





		try {

			String url = "jdbc:postgresql://localhost:5432/beerserver";
			String dbUser = "postgres";
			String dbPassword = "root";
			Class.forName("org.postgresql.Driver");


			Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);
			String sql ="insert into users (" + "  user_id," + "  user_name," + "  \"password\"," + "age"+ ") values ("
					+ "  ?," + "  ?," + "  ?," + "  ?" + ");";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,UserId);
			ps.setString(2,UserName);
			ps.setString(3, Util.digest(Password));
			ps.setString(4,Age);




			ps.executeUpdate();

			ps.close();
			connection.close();


		} catch (PSQLException e) {
			System.out.println("SQLエラー");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registerSuccess.jsp");
		dispatcher.forward(request, response);



	}





}

package dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class AbstractDao {
	public Connection dao() {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/beerserver");
			//JDBCドライバの情報の情報を使用して、DBへアクセス
			Connection connection = dataSource.getConnection();
			return connection;
		} catch (SQLException | NamingException e) {

			e.printStackTrace();
			return null;

		}

	}

}

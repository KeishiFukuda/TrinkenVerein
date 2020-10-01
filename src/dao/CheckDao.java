package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import entity.UserInfoEntity;

public class CheckDao {

	public UserInfoEntity checkUser(UserInfoEntity condition) {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/beerserver");
			Connection connection = dataSource.getConnection();

			//SQL
			String sql = "select user_id from users where user_id = ? ;";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, condition.getUserId());


			ResultSet resultSet = ps.executeQuery();

			UserInfoEntity userInfoEntity = null;
			if (resultSet.next()) {
				userInfoEntity = new UserInfoEntity();
				userInfoEntity.setUserId(resultSet.getString("user_id"));

			}
			resultSet.close();
			ps.close();
			connection.close();

			return userInfoEntity;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import entity.UserInfoEntity;

public class UserDao {
	/*
	 * ユーザー登録処理
	 */
	public UserInfoEntity registerUser(UserInfoEntity condition) {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/beerserver");
			Connection connection = dataSource.getConnection();

			//TODO DBeaverでSQLチェックする
			//SQL
			String sql = "insert user_id, user_name, \"password\" from users"
					+ " where user_id = ? and \"password\" = ?;";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, condition.getUserId());
			ps.setString(2, condition.getPassword());
			ResultSet resultSet = ps.executeQuery();

			UserInfoEntity userInfoEntity = null;
			if (resultSet.next()) {
				userInfoEntity = new UserInfoEntity();
				userInfoEntity.setUserId(resultSet.getString("user_id"));
				userInfoEntity.setUserName(resultSet.getString("user_name"));
				userInfoEntity.setPassword(resultSet.getString("password"));
			}
			resultSet.close();
			ps.close();
			connection.close();

			return userInfoEntity;

		} catch (Exception e) {
			e.printStackTrace();
			return condition;
		}
	}

	/*
	 * ログイン処理
	 */
	public UserInfoEntity loginUser(UserInfoEntity condition) {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/beerserver");
			Connection connection = dataSource.getConnection();

			//TODO DBeaverでSQLチェックする
			//SQL
			String sql = "select user_id, \"password\" from users"
					+ " where user_id = ? and \"password\" = ?;";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, condition.getUserId());
			ps.setString(2, condition.getPassword());

			ResultSet resultSet = ps.executeQuery();

			UserInfoEntity userInfoEntity = null;
			if (resultSet.next()) {
				userInfoEntity = new UserInfoEntity();
				userInfoEntity.setUserId(resultSet.getString("user_id"));
				userInfoEntity.setPassword(resultSet.getString("password"));
			}
			resultSet.close();
			ps.close();
			connection.close();

			return userInfoEntity;

		} catch (Exception e) {
			e.printStackTrace();
			return condition;
		}
	}

}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.UserInfoEntity;

public class UserLoginDao extends AbstractDao{

	public UserInfoEntity loginUser(UserInfoEntity condition) {
		try {
			Connection connection = super.dao();

			//SQL
			String sql = "select user_id, user_name, \"password\" from users"
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

}

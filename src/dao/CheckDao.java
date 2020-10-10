package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.UserInfoEntity;

public class CheckDao extends AbstractDao{

	public UserInfoEntity checkUser(UserInfoEntity condition) {
		try {
			Connection connection = super.dao();

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

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entity.UserInfoEntity;

public class UserRegisterDao extends AbstractDao{
	/*
	 * ユーザー登録処理
	 */
	public void registerUser(UserInfoEntity condition) {
		try {
			Connection connection = super.dao();

			//TODO DBeaverでSQLチェックする
			//SQL
			String sql = "insert into users (user_id,user_name,\"password\",age) values ("
					+ " ?, ?, ?, ?);";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, condition.getUserId());
			ps.setString(2, condition.getUserName());
			ps.setString(3, condition.getPassword());
			ps.setString(4, condition.getAge());

			ps.executeUpdate();

			ps.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}

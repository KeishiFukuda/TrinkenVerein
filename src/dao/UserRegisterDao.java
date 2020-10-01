package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import entity.UserInfoEntity;

public class UserRegisterDao {
	/*
	 * ユーザー登録処理
	 */
	public void registerUser(UserInfoEntity condition) {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/beerserver");
			Connection connection = dataSource.getConnection();

			//TODO DBeaverでSQLチェックする
			//SQL
			String sql ="insert into users (user_id,user_name,\"password\",age) values ("
					+" ?, ?, ?, ?);";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, condition.getUserId());
			ps.setString(2, condition.getUserName());
			ps.setString(3, condition.getPassword());
			ps.setString(4, condition.getAge());

			ps.executeUpdate();


			ps.close();
			connection.close();





		}catch(Exception e){
			e.printStackTrace();

		}
	}

}

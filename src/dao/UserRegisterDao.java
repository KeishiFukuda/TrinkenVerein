package dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import entity.UserInfoEntity;

public class UserRegisterDao {
	public void registerUser(UserInfoEntity codition) {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/beer_server");
			Connection connection = dataSource.getConnection();
			
			
		
		
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

}

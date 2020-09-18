package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import entity.BeerEntity;

public class BeerDao {
	public BeerEntity find(BeerEntity condition) {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/beerserver");
			Connection connection = dataSource.getConnection();

			String sql = "select product_name,classification,introduction,price,shop_url"
					+ "from beer where register_id = ?;";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, condition.getRegisterId());

			ResultSet resultSet = ps.executeQuery();

			BeerEntity beerEntity = null;
			if (resultSet.next()) {
				beerEntity = new BeerEntity();
				beerEntity.setProductName(resultSet.getString("product_name"));
				beerEntity.setClassification(resultSet.getString("classification"));
				beerEntity.setIntroduction(resultSet.getString("introduction"));
				beerEntity.setPrice(resultSet.getString("price"));
				beerEntity.setShopUrl(resultSet.getString("shop_url"));
			}
			resultSet.close();
			ps.close();
			connection.close();
			return beerEntity;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
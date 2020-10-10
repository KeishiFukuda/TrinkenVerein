package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.BeerEntity;

public class RecommendDao extends AbstractDao{
	public BeerEntity search(int num) {

		Connection connection = super.dao();

		String sql = "select product_name,image,heading,text_paragraph1,text_paragraph2,"
				+ "text_paragraph3,price,shop_url from beer where register_id = ?;";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, num);

			ResultSet resultSet = ps.executeQuery();
			BeerEntity beerResult = new BeerEntity();
			if (resultSet.next()) {

				beerResult.setProductName(resultSet.getString("product_name"));
				beerResult.setImage(resultSet.getString("image"));
				beerResult.setHeading(resultSet.getString("heading"));
				beerResult.setTextParagraph1(resultSet.getString("text_paragraph1"));
				beerResult.setTextParagraph2(resultSet.getString("text_paragraph2"));
				beerResult.setTextParagraph3(resultSet.getString("text_paragraph3"));
				beerResult.setPrice(resultSet.getInt("price"));
				beerResult.setShopUrl(resultSet.getString("shop_url"));
			}
			resultSet.close();
			ps.close();
			connection.close();
			return beerResult;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

}

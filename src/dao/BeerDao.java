package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.BeerEntity;

public class BeerDao extends AbstractDao{
	/*
	 * 「おススメビール検索」処理
	 */
	public List<BeerEntity> find(BeerEntity beerCondition) {

		List<BeerEntity> beerResultList = new ArrayList<>();

		try {

			Connection connection = super.dao();

			//SQL文を作成してRegisterIdを条件にセットし、実行
			String sql = "select product_name,image,heading,text_paragraph1,text_paragraph2,"
					+ "text_paragraph3,price,shop_url from beer where classification = ?;";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, beerCondition.getClassification());
			//結果を取得
			ResultSet resultSet = ps.executeQuery();

			//取得結果をBeerEntityインスタンスに設定し、ArrayListインスタンスに追加
			BeerEntity beerResult = null;
			while (resultSet.next()) {
				beerResult = new BeerEntity();
				beerResult.setProductName(resultSet.getString("product_name"));
				beerResult.setImage(resultSet.getString("image"));
				beerResult.setHeading(resultSet.getString("heading"));
				beerResult.setTextParagraph1(resultSet.getString("text_paragraph1"));
				beerResult.setTextParagraph2(resultSet.getString("text_paragraph2"));
				beerResult.setTextParagraph3(resultSet.getString("text_paragraph3"));
				beerResult.setPrice(resultSet.getInt("price"));
				beerResult.setShopUrl(resultSet.getString("shop_url"));

				beerResultList.add(beerResult);
			}
			resultSet.close();
			ps.close();
			connection.close();
			return beerResultList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
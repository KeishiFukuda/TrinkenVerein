package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import entity.BeerEntity;

public class BeerDao {
	public List<BeerEntity> find(BeerEntity beerCondition) {
		List<BeerEntity> beerResultList = new ArrayList<>();

		try {
			//JDBCドライバの情報をTomcatの設定ファイル「server.xml」のコンテキスト（Context）から取得
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource dataSource = (DataSource) envContext.lookup("jdbc/beerserver");
			//JDBCドライバの情報の情報を使用して、DBへアクセス
			Connection connection = dataSource.getConnection();

			//SQL文を作成してRegisterIdを条件にセットし、実行
			String sql = "select product_name,classification,introduction,price,shop_url"
					+ "from beer where register_id = ?;";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, beerCondition.getRegisterId());
			//結果を取得
			ResultSet resultSet = ps.executeQuery();

			//取得結果をBeerEntityインスタンスに設定し、ArrayListインスタンスに追加
			BeerEntity beerResult = null;
			if (resultSet.next()) {
				beerResult = new BeerEntity();
				beerResult.setProductName(resultSet.getString("product_name"));
				beerResult.setClassification(resultSet.getString("classification"));
				beerResult.setIntroduction(resultSet.getString("introduction"));
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
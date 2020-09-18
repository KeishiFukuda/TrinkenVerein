package logic;

import java.sql.SQLException;

import dao.BeerDao;
import entity.BeerEntity;

public class ProductLogic {


	public BeerEntity find(BeerEntity condition) throws ClassNotFoundException, SQLException {
		BeerDao beerDao = new BeerDao();

		BeerEntity beerEntity = beerDao.find(condition);
		return beerEntity;
	}
}

package logic;

import dao.BeerDao;
import entity.BeerEntity;

public class ProductLogic {

	public BeerEntity execute(BeerEntity BeerEntity) {
		BeerDao beerDao = new BeerDao();
		BeerEntity beerEntity2 = beerDao.find(BeerEntity);
		return beerEntity2;
	}

}

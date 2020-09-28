package logic;

import java.util.List;

import dao.BeerDao;
import entity.BeerEntity;

public class ProductLogic {

	public List<BeerEntity> execute(BeerEntity beerCondition) {
		BeerDao beerDao = new BeerDao();
		List<BeerEntity> beerResultList = beerDao.find(beerCondition);
		return beerResultList;
	}

}

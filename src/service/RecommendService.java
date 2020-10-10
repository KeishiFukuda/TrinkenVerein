package service;

import java.util.Random;

import dao.RecommendDao;
import entity.BeerEntity;

public class RecommendService {
	public BeerEntity search() {
		Random random = new Random();
		int num = random.nextInt(6) + 17;
		RecommendDao recommend = new RecommendDao();
		BeerEntity condition = recommend.search(num);

		return condition;

	}

}

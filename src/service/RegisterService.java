package service;

import dao.UserDao;
import dto.UserDataDTO;
import entity.UserInfoEntity;
import util.Util;

public class RegisterService {

//	@Resource
//	private UserDao userDao;

	public UserInfoEntity registerUser(UserDataDTO userData) {
		UserDao userDao = new UserDao();

		UserInfoEntity condition = new UserInfoEntity();
		condition.setUserId(userData.getUserId());
		condition.setPassword(Util.digest(userData.getPassword()));
		condition.setAge(userData.getAge());
		condition.setUserName(userData.getUserName());

		UserInfoEntity userInfoEntity = userDao.registerUser(condition);

		return userInfoEntity;
	}

	//Login用サーブレットメソッド
	public UserInfoEntity loginUser(UserDataDTO userData) {

		UserDao userDao = new UserDao();

		UserInfoEntity condition = new UserInfoEntity();
		condition.setUserId(userData.getUserId());
		condition.setPassword(Util.digest(userData.getPassword()));

		UserInfoEntity userInfoEntity = userDao.loginUser(condition);

		return userInfoEntity;
	}

}

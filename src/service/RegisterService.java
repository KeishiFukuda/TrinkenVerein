package service;

import dao.UserDao;
import dto.UserDataDTO;
import entity.UserInfoEntity;
import util.Util;

public class RegisterService {

//	@Resource
//	private UserDao userDao;


	public UserInfoEntity registerUser(UserDataDTO userDataDTO) {
		UserDao userDao = new UserDao();

		UserInfoEntity condition = new UserInfoEntity();
		condition.setUserId(userDataDTO.getUserId());
		condition.setPassword(Util.digest(userDataDTO.getPassword()));
		condition.setAge(userDataDTO.getAge());
		condition.setUserName(userDataDTO.getUserName());

		UserInfoEntity userInfoEntity = userDao.registerUser(condition);

		return userInfoEntity;
	}

	//Login用サーブレットメソッド
	public UserInfoEntity loginUser(UserDataDTO userDataDTO) {

		UserDao userDao = new UserDao();

		UserInfoEntity condition = new UserInfoEntity();
		condition.setUserId(userDataDTO.getUserId());
		condition.setPassword(userDataDTO.getPassword());

		UserInfoEntity userInfoEntity = userDao.loginUser(condition);

		return userInfoEntity;
	}

}

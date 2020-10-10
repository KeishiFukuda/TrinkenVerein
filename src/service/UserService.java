package service;

import dao.CheckDao;
import dao.UserLoginDao;
import dao.UserRegisterDao;
import dto.UserDataDTO;
import entity.UserInfoEntity;
import util.Util;

public class UserService {

	public void registerUser(UserDataDTO userDataDTO) {

		UserInfoEntity condition = new UserInfoEntity();

		condition.setUserId(userDataDTO.getUserId());
		condition.setUserName(userDataDTO.getUserName());
		condition.setPassword(Util.digest(userDataDTO.getPassword()));
		condition.setAge(userDataDTO.getAge());

		UserRegisterDao registerDao = new UserRegisterDao();
		registerDao.registerUser(condition);
	}

	public UserInfoEntity loginUser(UserDataDTO userDataDTO) {

		UserLoginDao userDao = new UserLoginDao();
		UserInfoEntity condition = new UserInfoEntity();

		condition.setUserId(userDataDTO.getUserId());
		condition.setPassword(Util.digest(userDataDTO.getPassword()));

		UserInfoEntity userInfoEntity = userDao.loginUser(condition);

		return userInfoEntity;
	}

	public UserInfoEntity checkUser(UserDataDTO userDataDTO) {

		CheckDao checkDao = new CheckDao();
		UserInfoEntity condition = new UserInfoEntity();
		condition.setUserId(userDataDTO.getUserId());

		UserInfoEntity userInfoEntity = checkDao.checkUser(condition);
		return userInfoEntity;

	}

}

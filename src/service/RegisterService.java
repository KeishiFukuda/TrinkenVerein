package service;

import dto.UserDataDTO;
import entity.UserInfoEntity;
import util.Util;

public class RegisterService {
	public UserInfoEntity registerUser(UserDataDTO userData) {

		UserInfoEntity condition = new UserInfoEntity();

		condition.setUserId(userData.getUserId());
		condition.setPassword(Util.digest(userData.getPassword()));
		condition.setAge(userData.getAge());
		condition.setUserName(userData.getUserName());


		return condition;
	}

	//Login用サーブレットメソッド
	public UserInfoEntity loginUser(UserDataDTO userData) {

		UserInfoEntity condition1 = new UserInfoEntity();

		condition1.setUserId(userData.getUserId());
		condition1.setPassword(Util.digest(userData.getPassword()));


		return condition1;
	}

}

package service;

import dto.UserDataDTO;
import entity.UserInfoEntity;

public class LoginService {

	public UserInfoEntity registerUser(UserDataDTO userData) {

		UserInfoEntity condition = new UserInfoEntity();

		condition.setUserId(userData.getUserId());
		condition.setPassword(userData.getPassword());
		condition.setAge(userData.getAge());

		return condition;
	}

}

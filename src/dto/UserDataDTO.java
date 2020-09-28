package dto;

public class UserDataDTO {

	String UserId;
	String Password ;
	String Age;
	String UserName;

	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String userPassWord) {
		Password = userPassWord;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}


	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.getClass().getName())
		.append("{")
		.append("userId=")
		.append(getUserId())
		.append(",UserName=")
		.append(getUserName())
		.append(",password=")
		.append(getPassword())
		.append("getPassword=")
		.append(getAge())
		.append("}");
		return sb.toString();
	}

}

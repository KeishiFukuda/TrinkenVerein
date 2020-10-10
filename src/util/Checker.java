package util;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import dto.UserDataDTO;
import entity.UserInfoEntity;
import service.UserService;

public class Checker {

	public static String checkId(String UserId) throws IOException {
		String idMessage = null;
		UserDataDTO user = new UserDataDTO();
		user.setUserId(UserId);

		UserService service = new UserService();
		UserInfoEntity entity = service.checkUser(user);

		if (!(UserId == null)) {
			if (!(UserId.isEmpty())) {
				if(entity == null) {
					if (UserId.matches("^[A-Za-z0-9]+$")) { //半角チェック
						if (UserId.matches(".{5,20}")) {
							return UserId;
						} else {
							idMessage ="5～20文字で入力してください。";
							return  idMessage;
						}
					} else {
						idMessage ="半角で入力してください。";
						return idMessage;
					}
				}else {
					idMessage ="IDが重複しています。";
					return idMessage;
				}
			} else {
				idMessage ="IDが未入力です。";
				return idMessage;
			}
		} else {
			idMessage ="IDが未入力です。";
			return idMessage;
		}
	}

	public static String checkName(String UserName) throws IOException {
		String nameMessage = null;
		if (!(UserName == null)) {
			if (!(UserName.isEmpty())) {
				if (UserName.matches(".{0,40}")) {
					return UserName;
				} else {
					nameMessage = "0～40文字で入力してください。";
					return nameMessage;
				}
			} else {
				nameMessage = "名前が未入力です。";
				return nameMessage;
			}
		} else {
			nameMessage = "名前が未入力です。";
			return nameMessage;
		}
	}

	public static String checkPassword(String UserPassword) throws IOException {
		String passwordMessage = null;
		if (!(UserPassword == null)) {
			if (!(UserPassword.isEmpty())) {
				if (UserPassword.matches("^[A-Za-z0-9]+$")) { //半角チェック
					if (UserPassword.matches(".{4,8}")) {
						return UserPassword;
					} else {
						passwordMessage = "パスワードは4～8文字で入力してください。";
						return passwordMessage ;
					}
				} else {
					passwordMessage = "半角で入力してください。";
					return passwordMessage ;
				}
			} else {
				passwordMessage = "パスワードは4～8文字で入力してください。";
				return passwordMessage;
			}
		}else {
			passwordMessage = "パスワードは4～8文字で入力してください。";
			return passwordMessage;
		}
	}

	public static String checkAge(String Birthday) throws ParseException {
		String birthdayMessage = null;
		if (!(Birthday.isEmpty())) {

		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		LocalDate d1 = LocalDate.parse(Birthday, f);
		LocalDate d2 = LocalDate.now();

		long days = ChronoUnit.DAYS.between(d1, d2);

			if (7305 <= days) {
				return Birthday;
			} else {
				if(7304==days) {
					birthdayMessage = "ちょっと早いけど HappyBirthday!、明日ご来訪ください。";
					return birthdayMessage;
				}
				 birthdayMessage = "お酒は20歳を超えてから！！！！！！";
				return birthdayMessage;
			}
		} else {
			birthdayMessage ="誕生日を入力してください。";
			return  birthdayMessage;
		}
	}
}

package util;

import java.io.IOException;
import java.util.Calendar;

import dto.checkerDTO;

public class Checker {

	public static checkerDTO checkId(String UserId) throws IOException {
		checkerDTO cDTO = new checkerDTO();


			if (!(UserId == null)) {
				if (!(UserId.isEmpty())) {
					if (UserId.matches("^[A-Za-z0-9]+$")) { //半角チェック
						if (UserId.matches(".{5,20}")) {
							cDTO.setUserId(UserId);

						} else {
							cDTO.setMessage("登録済みのIDです。");

						}
					} else {
						cDTO.setMessage("半角で入力してください");
					}
				} else {
					cDTO.setMessage("IDが未入力です。");
				}
			} else {
				cDTO.setMessage(null);
			}


		return cDTO;
	}

	public static checkerDTO checkName(String UserName) throws IOException {
		checkerDTO cDTO = new checkerDTO();
			if (!(UserName == null)) {
				if (!(UserName.isEmpty())) {
					if (UserName.matches(".+")) {
						cDTO.setUserName(UserName);
					} else {
						cDTO.setMessage("登録済みの名前です。");
					}
				} else {
					cDTO.setMessage("名前が未入力です。");
				}
			} else {
				cDTO.setMessage("名前が未入力です。");
			}

		return cDTO;
	}

	public static checkerDTO checkPassword(String UserPassword) throws IOException {
		checkerDTO cDTO = new checkerDTO();
			if (!(UserPassword == null)) {
				if (!(UserPassword.isEmpty())) {
					if (UserPassword.matches("^[A-Za-z0-9]+$")) { //半角チェック
						if (UserPassword.matches(".{4,8}")) {
							cDTO.setUserPassword(UserPassword);
						} else {
							cDTO.setMessage("登録済みのパスワードです。");
						}
					} else {
						cDTO.setMessage("半角で入力してください");
					}
				} else {
					cDTO.setMessage("パスワードは4～8文字で入力してください。");
				}
			}

		return cDTO;
	}

	public boolean checkAge(String[] args) {

		//誕生日の生年月日
		int yearBirth;
		int monthBirth;
		int dayBirth;

		//入力された引数が３つ以上か調べる
		if (3 > args.length) {
			return false;
		}

		//引数をint型に変換し、年月日に入れる
		try {
			yearBirth = Integer.parseInt(args[0]);
			monthBirth = Integer.parseInt(args[1]);
			dayBirth = Integer.parseInt(args[2]);
		} catch (NumberFormatException e) {
			System.out.println("生年月日の取得に失敗しました");
			return false;
		}

		if (0 > yearBirth) {
			return false;
		}
		if ((1 > monthBirth) || (12 < monthBirth)) {
			return false;
		}
		if ((1 > dayBirth) || (31 < dayBirth)) {
			return false;
		}

		//現在の年月日
		int yearToday;
		int monthToday;
		int dayToday;

		//今日の生年月日を変数に代入
		Calendar calendar = Calendar.getInstance();
		yearToday = calendar.get(Calendar.YEAR);
		monthToday = calendar.get(Calendar.MONTH) + 1;
		dayToday = calendar.get(Calendar.DAY_OF_MONTH);

		//西暦年から誕生年を引く
		int age = yearToday - yearBirth;
		if (monthToday < monthBirth) {
			--age;
		} else {
			if (monthToday == monthBirth) {
				if (dayBirth < dayToday) {
					--age;
				}
			}
		}
		if (age < 19) {
			return false;
		} else {
			return true;
		}
	}
}

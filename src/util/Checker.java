package util;

import java.io.IOException;
import java.util.Calendar;

public class Checker {

	public static String checkId(String Id) throws IOException {

		String UserId = "";
		while (true) {
			if (!(UserId == null)) {
				if (!(UserId.isEmpty())) {
					if (UserId.matches("^[A-Za-z0-9]+$")) { //半角チェック
						if (UserId.matches(".{5,20}")) {
							break;
						} else {
							//System.out.println("登録済みのIDです。");
							continue;
						}
					} else {
						//System.out.println("半角で入力してください");
						continue;
					}
				} else {
					//System.out.println("IDが未入力です。");
					continue;
				}
			}
		}

		return UserId;
	}

	public static String checkName(String name) throws IOException {
		String UserName = "";
		while (true) {
			if (!(UserName == null)) {
				if (!(UserName.isEmpty())) {
					if (UserName.matches(".{0.40}")) {
						break;
					} else {
						//System.out.println("登録済みの名前です。");
						continue;
					}
				} else {
					//System.out.println("名前が未入力です。");
					continue;
				}
			} else {
				//nullチェック
				continue;
			}
		}
		return name;
	}

	public static String checkPassword(String password) throws IOException {
		String Password = "";
		while (true) {
			if (!(Password == null)) {
				if (!(Password.isEmpty())) {
					if (Password.matches("^[A-Za-z0-9]+$")) { //半角チェック
						if (Password.matches(".{4,8}")) {
							break;
						} else {
							//System.out.println("登録済みのパスワードです。");
							continue;
						}
					} else {
						//System.out.println("半角で入力してください");
						continue;
					}
				} else {
					//System.out.println("パスワードは4～8文字で入力してください。");
					continue;
				}
			}
		}

		return Password;
	}

	public static void checkAge(String[] args) {

		//誕生日の生年月日
		int yearBirth;
		int monthBirth;
		int dayBirth;

		//入力された引数が３つ以上か調べる
		if (3 > args.length) {
			return;
		}

		//引数をint型に変換し、年月日に入れる
		try {
			yearBirth = Integer.parseInt(args[0]);
			monthBirth = Integer.parseInt(args[1]);
			dayBirth = Integer.parseInt(args[2]);
		} catch (NumberFormatException e) {
			System.out.println("生年月日の取得に失敗しました");
			return;
		}

		if (0 > yearBirth) {
			return;
		}
		if ((1 > monthBirth) || (12 < monthBirth)) {
			return;
		}
		if ((1 > dayBirth) || (31 < dayBirth)) {
			return;
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

		int age;

		//西暦年から誕生年を引く
		age = yearToday - yearBirth;
		if (monthToday < monthBirth) {
			--age;
		} else {
			if (monthToday == monthBirth) {
				if (dayBirth < dayToday) {
					--age;
				}
			}
		}

	}



}

package util;

import java.security.MessageDigest;

import javax.xml.bind.DatatypeConverter;

public class Util {
	public static String digest(String text) {
		try {

				MessageDigest messageDigest = MessageDigest.getInstance("MD5");
				byte[] digest = messageDigest.digest(text.getBytes());
				return DatatypeConverter.printHexBinary(digest);



		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

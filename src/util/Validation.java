package util;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

/*
 * 入力チェック
 */

public class Validation implements Serializable {

	 private static final long serialVersionUID = 1L;

	 @NotBlank
	 @Size(max = 20,min = 5)
	 private String UserId;

	 @NotBlank
	 @Size(max = 40)
	 private String UserName;

	 @NotBlank
	 @Length(min=4, max=8)
	  @Pattern(regexp="^[a-zA-Z0-9]+$")
	  private String Password;

	 /*
	  * 現在時刻 - 誕生日 = 年齢
	  */
	 private String Age;
	 public static int Age(Date birthday, Date now) {
		    SimpleDateFormat age = new SimpleDateFormat("yyyyMMdd");
		    return (Integer.parseInt(age.format(now)) - Integer.parseInt(age.format(birthday))) / 10000;
		}
}

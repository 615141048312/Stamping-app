package attendanceApp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DiffDaysCalc {
	public DiffDays date; //メンバ変数？

	//コンストラクタ
	public DiffDaysCalc() {
		date = new DiffDays();
	}

	//DiffDays型？の戻り値を返す引数なしのメソッド
	public DiffDays calcDay() {
		Date start = null;
		Date leave = null;
		try {
			//とりあえず固定値
			start = new SimpleDateFormat("yyyy'/'MM'/'dd HH:mm", Locale.JAPANESE).parse("2021/01/21 08:59");
			leave = new SimpleDateFormat("yyyy'/'MM'/'dd HH:mm", Locale.JAPANESE).parse("2021/01/21 18:11");
		} catch (Exception e) {
		}
		date.hour = differenceHours(leave, start);
		date.minute = differenceMinute(leave, start);
		return date;
	}

	//メソッド
	public static int differenceHours(Date date1, Date date2) {
		long datetime1 = date1.getTime();
		long datetime2 = date2.getTime();
		long diffHour = (datetime1 - datetime2) / 1000 / 60 / 60 % 24;
		return (int)diffHour;
	}

	public static int differenceMinute(Date date1,Date date2) {
	    long datetime1 = date1.getTime();
	    long datetime2 = date2.getTime();
	    long diffMinute = (datetime1 - datetime2) / 1000 / 60 % 60;
	    return (int)diffMinute;
	}
}
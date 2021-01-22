package practice;

import java.util.Calendar;

public class TestCalendar1 {
	public static void main(String[] args) {
		String[] week_name = {"日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日"};
		
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		
		int day_of_year = calendar.get(Calendar.DAY_OF_YEAR);
		
		System.out.println("現在の日時は");
	    System.out.println(year + "年" + month + "月" + day + "日");
	    System.out.println("(" + week_name[week] + ")");
	    System.out.println(hour + "時" + minute + "分" + second + "秒");

	    System.out.println("今日は今年の" + day_of_year + "日目です");
	}
}
package saveDate;

import java.util.Date;

public class Calculate {
	public Difference date;

	public Calculate() {
		date = new Difference();
	}

	// public Difference calc() {
		// Date start = null;
		// Date leave = null;
		// try {
		// 	start =
		// 	leave =
		// } catch (Exception e) {
		// }
		// date.hour = differenceHours(leave, start);
		// date.minute = differenceMinute(leave, start);
		// return date;
	// }

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

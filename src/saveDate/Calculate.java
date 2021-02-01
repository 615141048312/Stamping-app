package saveDate;

import java.util.Date;

public class Calculate {
	public WorkTime workTime;
	public Calculate() {
		workTime = new WorkTime();
	}

	public WorkTime calc() {
		Access today = new Access();
		AtWork stamps = today.stamps();
		workTime.hour = calculateHours(stamps.leave, stamps.start);
		workTime.minute = calculateMinute(stamps.leave, stamps.start);
		return workTime;
	}

	public static int calculateHours(Date date1, Date date2) {
		long datetime1 = date1.getTime();
		long datetime2 = date2.getTime();
		long diffHour = (datetime1 - datetime2) / 1000 / 60 / 60 % 24;
		return (int)diffHour;
	}

	public static int calculateMinute(Date date1,Date date2) {
	    long datetime1 = date1.getTime();
	    long datetime2 = date2.getTime();
	    long diffMinute = (datetime1 - datetime2) / 1000 / 60 % 60;
	    return (int)diffMinute;
	}
}

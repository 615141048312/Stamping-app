package practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

public class TestOutput {
	public static void main(String[] args) {
		String[] week_name = {"(日)", "(月)", "(火)", "(水)", "(木)", "(金)", "(土)"};

		Calendar calendar = Calendar.getInstance();

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DATE);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;

		int day_of_year = calendar.get(Calendar.DAY_OF_YEAR);

		try{
			File file = new File("src/practice/testOutput.txt");

			if(checkBeforeWritefile(file)) {
				FileWriter filewriter = new FileWriter(file, true);

				filewriter.write(year + "/" + month + "/" + day + week_name[week] + hour + ":" + minute + ":" + second + "\n");

				filewriter.close();
			}else {
				System.out.println("ファイルに書き込めません");
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	private static boolean checkBeforeWritefile(File file) {
		if (file.exists()) {
			if(file.isFile() && file.canWrite()) {
				return true;
			}
		}

		return false;
	}
}

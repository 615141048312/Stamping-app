package attendanceApp;

public class Main {
	public static void main(String[] args) {
		DiffDaysCalc workingHours = new DiffDaysCalc(); //DiffDaysCalcクラスのインスタンス
		DiffDays result = workingHours.calcDay(); //インスタンスにcalcDayメソッド適用
		System.out.println(result.hour + " " + result.minute);
	}
}

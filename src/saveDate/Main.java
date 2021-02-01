package saveDate;

public class Main {

	public static void main(String[] args) {
		Calculate workingHours = new Calculate();
		WorkTime result = workingHours.calc();
		System.out.println(result.hour + "時間" + result.minute + "分");
	}

}

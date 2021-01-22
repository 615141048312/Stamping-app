package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestScanner3 {
	public static void main(String[] args) {
		System.out.println("Please enter two integer.");

		Scanner scan = new Scanner(System.in);

		try {
			int val = scan.nextInt();
			System.out.println("The first token is:" + val);

			val = scan.nextInt();
			System.out.println("Next token is:" + val);
		} catch (InputMismatchException e) {
			System.out.println("Enter an INTEGER!!");
		}
	}
}

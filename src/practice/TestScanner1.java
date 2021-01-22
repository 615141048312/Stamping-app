package practice;

import java.util.Scanner;

public class TestScanner1 {

	public static void main(String[] args) {
		System.out.println("Please enter something and confirm with the return key.");
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		System.out.println("The first token is :" + str);
		
		str = scan.next();
		System.out.println("The second token is :" + str);	
	}
}

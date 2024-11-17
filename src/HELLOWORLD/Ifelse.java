package HELLOWORLD;

import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a");
		int a = scanner.nextInt();
		if (a > 10) {
			System.out.println("You good");
		} else {
			System.out.println("You fails");
		}

	}
}

package HELLOWORLD;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a");
		int a = scanner.nextInt();
		System.out.println("Input b");
		int b = scanner.nextInt();
		System.out.printf("PT co dang la %dx+%d=0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Pt vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Pt 0 nghiem");
		} else {
			float x = (float) -b / a;
			System.out.println("Pt co nghiem x = " + x);
		}

	}
}

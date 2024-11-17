package HELLOWORLD;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {

		double a, b, c;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập hệ số a: ");
		a = scanner.nextDouble();
		System.out.print("Nhập hệ số b: ");
		b = scanner.nextDouble();
		System.out.print("Nhập hệ số c: ");
		c = scanner.nextDouble();

		if (a == 0) {
			System.out.println("Đây không phải phương trình bậc 2.");
		} else {

			double delta = b * b - 4 * a * c;

			if (delta > 0) {

				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có hai nghiệm phân biệt:");
				System.out.println("Nghiệm 1: x1 = " + x1);
				System.out.println("Nghiệm 2: x2 = " + x2);
			} else if (delta == 0) {

				double x = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép:");
				System.out.println("Nghiệm: x = " + x);
			} else {

				System.out.println("Phương trình vô nghiệm (delta < 0).");
			}
		}

		scanner.close();
	}
}

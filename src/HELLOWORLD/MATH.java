package HELLOWORLD;

import java.util.Scanner;

public class MATH {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao canh a: ");
		int a = scanner.nextInt();
		System.out.println("The tich hinh lap phuong la " + Math.pow(a, 3));

		scanner.close();
	}

}

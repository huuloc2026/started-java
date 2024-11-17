package HELLOWORLD;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {

		double gia1 = 1.5;
		double gia2 = 2.0;
		double gia3 = 2.5;
		double gia4 = 3.0;

		double soKWh, tienDien = 0.0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số kWh tiêu thụ: ");
		soKWh = scanner.nextDouble();

		if (soKWh <= 50) {
			tienDien = soKWh * gia1;
		} else if (soKWh <= 100) {
			tienDien = 50 * gia1 + (soKWh - 50) * gia2;
		} else if (soKWh <= 200) {
			tienDien = 50 * gia1 + 50 * gia2 + (soKWh - 100) * gia3;
		} else {
			tienDien = 50 * gia1 + 50 * gia2 + 100 * gia3 + (soKWh - 200) * gia4;
		}

		System.out.println("Số tiền điện cần trả: " + tienDien + " đồng");

		scanner.close();
	}
}

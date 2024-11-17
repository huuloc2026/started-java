package HELLOWORLD;

import java.util.Arrays;

public class Array01 {
	public static void main(String[] args) {
		// String[] clubs = { "Man City", "10.000$", "Bitcoin" };
		int[] nums = { 1, 2, 3, 45, 4, 6 };
		// Arrays.sort(nums);
		// System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int temp = 0;
				if (nums[i] < nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(nums));
	}
}

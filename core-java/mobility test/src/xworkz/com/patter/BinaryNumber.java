package xworkz.com.patter;

import java.util.Arrays;

public class BinaryNumber {

	public static void main(String[] args) {
		int[] numbers = { -4, 5, 75, 22, 23, 24, 11 };
		int num = 7;
		BinaryNumber.search(numbers, num);

	}

	public static void search(int[] numbers, int num) {
		Arrays.sort(numbers);

		int start = 0;
		int end = numbers.length;
		int mid = numbers.length / 2;

		while (mid > start && mid < end) {
			if (mid == num) {
				System.out.println(num + "is found in array");
			} else if (num > mid) {
				start = mid;
				mid = (start + end) / 2;

			} else if (num < mid) {
				end = mid;
				mid = (start + end) / 2;
			}
		}
	}
}
package Sorting_Searching_Course;

import java.util.Scanner;

public class L7_Packing_Rectangles {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		long w = scn.nextLong();
		long h = scn.nextLong();
		long n = scn.nextLong();

		System.out.println(Packing(w, h, n));

	}

	private static long Packing(long w, long h, long n) {

		long l = 0;

		long r = 1;

		while (!good(r, w, h, n))
			r *= 2;

		long ans = 0;

		while (l <= r) {

			// mid is a possible side of a sqaure which can fit all the rectangles
			long mid = (l + r) / 2;

			if (good(mid, w, h, n)) {
				ans = mid;
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}

		return ans;
	}

	private static boolean good(long mid, long w, long h, long n) {

		// Objective
		// Figure out if n rectangles can be fit in a square of side mid.
		// w, h => coordinates of the rectangle

		// No of rectangles = Area of Square / Area of the 1 rectangle

		// mid * mid / x * h
		return (mid / w) * (mid / h) >= n;
	}

}

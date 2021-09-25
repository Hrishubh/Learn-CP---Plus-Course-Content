package Sorting_Searching_Course_3;

public class L6_Very_Easy_Task {

	public static void main(String[] args) {

		int n = 5;
		int x = 1;
		int y = 2;

		System.out.println(minTime(n, x, y));

	}

	private static int minTime(int n, int x, int y) {

		if (n == 1) {
			return Math.min(x, y);
		}

		// search space
		int left = 0;
		int right = Math.max(x, y) * n;

		int ans = 0;

		while (left < right) {

			int mid = (left + right) / 2;

			if (good(n, x, y, mid)) {
				ans = mid;
				right = mid - 1;

			} else {
				left = mid + 1;
			}
		}

		return ans + Math.min(x, y);

	}

	private static boolean good(int n, int x, int y, int mid) {

		// Objective:
		// If in mid amount of time, I am able to make n - 1 copies.
		// then my mid value is good.

		// Check how many copies can be made in mid amount of time.
		// if no copies > n - 1, then return true;
		// otherwise return false

		// c1 copier x sec -> 1 copy
		// c1 copier mid time -> mid / x

		// c2 copier makes mid / y in mid time

		return (mid / x) + (mid / y) >= n - 1;
	}

}

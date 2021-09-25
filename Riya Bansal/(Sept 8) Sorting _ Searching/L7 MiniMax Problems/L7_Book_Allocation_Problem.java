package Sorting_Searching_Course_4;

public class L7_Book_Allocation_Problem {

	public static void main(String[] args) {

		System.out.println(findMinPages(new int[] { 12, 34, 67, 90 }, 2));

	}

	private static int findMinPages(int[] arr, int m) {

		long sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}

		int low = 0;
		int high = (int) sum;

		int result = Integer.MAX_VALUE;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (good(arr, m, mid)) {
				result = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return result;
	}

	private static boolean good(int[] arr, int m, int mid) {

		// Each student can read atmost mid no of pages

		int studentReqd = 1;
		int csum = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > mid) {
				return false;
			}

			if (csum + arr[i] > mid) {
				studentReqd++;
				csum = arr[i];

				if (studentReqd > m) {
					return false;
				}
			} else {
				csum += arr[i];
			}
		}

		return true;
	}

}

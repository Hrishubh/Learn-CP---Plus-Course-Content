package Sorting_Searching_Course_3;

public class L5_Binary_Search {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 7, 9, 11, 13, 14, 22, 24 };

		System.out.println(binarySearch(arr, 14));
	}

	private static boolean binarySearch(int[] arr, int i) {

		// search space
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (arr[mid] == i) {
				return true;
			} else if (arr[mid] < i) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		
		return false;

	}

}

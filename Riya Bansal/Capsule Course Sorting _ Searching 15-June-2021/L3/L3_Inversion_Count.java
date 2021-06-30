package Sorting_Searching_Course;

public class L3_Inversion_Count {

	public static void main(String[] args) {

		int[] arr = { 8, 4, 2, 1 };
		//

		System.out.println(inversionCount(arr, 0, arr.length - 1));
	}

	private static long inversionCount(int[] arr, int left, int right) {

		int count = 0;
		if (left < right) {
			int mid = left + (right - left) / 2;

			count += inversionCount(arr, left, mid);
			count += inversionCount(arr, mid + 1, right);
			count += merge(arr, left, mid, right);

			return count;
		}

		return count;
	}

	public static int[] temp = new int[20000000];

	private static long merge(int[] arr, int l, int mid, int r) {

		int i = l;
		int j = mid + 1;

		long swaps = 0;

		int k = 0;

		while (i <= mid && j <= r) {

			if (arr[i] <= arr[j]) {
				temp[k] = arr[i];
				i++;
				k++;

			} else {
				temp[k] = arr[j];
				j++;
				k++;
				swaps += (mid - i + 1);
			}
		}

		while (i <= mid) {
			temp[k] = arr[i];
			k++;
			i++;

		}

		while (j <= r) {
			temp[k] = arr[j];
			k++;
			j++;
		}

		for (int m = l, p = 0; m <= r; m++, p++) {
			arr[m] = temp[p];
		}

		return swaps;

	}
}

package Sorting_Searching_Course_3;

public class L3_InversionCount {

	public static void main(String[] args) {

		int[] arr = { 8, 4, 2, 1 };

		System.out.println(inversionCount(arr, 0, arr.length - 1));

	}

	private static long inversionCount(int[] arr, int left, int right) {

		int count = 0;

		if (left < right) {

			int mid = (left) + (right - left) / 2;

			count += inversionCount(arr, left, mid);
			count += inversionCount(arr, mid + 1, right);

			count += merge(arr, left, mid, right);
		}

		return count;

	}

	public static int[] temp = new int[20000000];

	private static int merge(int[] arr, int l, int mid, int r) {

		int i = l;
		int j = mid + 1;

		int swaps = 0;

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
			i++;
			k++;
		}

		while (j <= r) {
			temp[k] = arr[j];
			j++;
			k++;

		}

		for (int m = l, p = 0; m <= r; m++, p++) {
			arr[m] = temp[p];
		}
		return swaps;

	}

}

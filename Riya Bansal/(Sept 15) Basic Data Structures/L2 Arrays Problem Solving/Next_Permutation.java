package Basic_Data_Structures_Course;

public class Next_Permutation {

	public static void main(String[] args) {

		find(new int[] { 1, 5, 8, 4, 7, 6, 5, 3, 1 });

	}

	private static void find(int[] arr) {

		int i = arr.length - 2;

		while (i >= 0 && arr[i + 1] <= arr[i]) {
			i--;
		}

		if (i >= 0) {
			int j = arr.length - 1;
			while (arr[j] <= arr[i]) {
				j--;
			}

			swap(arr, i, j);
		}

		reverse(arr, i + 1);

		for (int val : arr) {

			System.out.print(val + " ");
		}

	}

	private static void reverse(int[] arr, int start) {

		int i = start;
		int j = arr.length - 1;

		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}

	}

	private static void swap(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}

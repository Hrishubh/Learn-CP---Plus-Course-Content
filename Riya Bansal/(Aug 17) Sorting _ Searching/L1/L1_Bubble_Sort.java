package Sorting_Searching_Course_2;

public class L1_Bubble_Sort {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 3, 6, 9 };

		bubbleSort(arr);
//
//		for (int val : arr) {
//			System.out.print(val + " ");
//		}

	}

	private static void bubbleSort(int[] arr) {

		int n = arr.length;

		boolean swapped;
		for (int i = 0; i < n - 1; i++) {

			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			}

			System.out.println();
			if (swapped == false) {
				break;
			}
		}

	}

}

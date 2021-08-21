package Introduction_to_Programming_In_Java;

public class L10_DisplayArray {

	public static void main(String[] args) {

		displayArray(new int[] { 1, 2, 3, 4, 5 }, 0);
	}

	private static void displayArray(int[] arr, int idx) {

		if (idx == arr.length) {
			return;
		}

		
		displayArray(arr, idx + 1);

		System.out.print(arr[idx] + " ");
	}

}

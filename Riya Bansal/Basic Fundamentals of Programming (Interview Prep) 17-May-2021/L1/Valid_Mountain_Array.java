package Basic_Fundamentals_of_Programming;

public class Valid_Mountain_Array {

	public static void main(String[] args) {

		int[] arr = { 0, 2, 3, 3, 5, 2, 1, 0 };

		System.out.println(solve(arr));

	}

	private static boolean solve(int[] arr) {

		int i = 0;

		while (i + 1 < arr.length && arr[i] < arr[i + 1]) {
			i++;
		}

		if (i == 0 || i == arr.length - 1)
			return false;

		while (i + 1 < arr.length && arr[i] > arr[i + 1]) {
			i++;
		}
		
		return (i == arr.length - 1);

	}

}

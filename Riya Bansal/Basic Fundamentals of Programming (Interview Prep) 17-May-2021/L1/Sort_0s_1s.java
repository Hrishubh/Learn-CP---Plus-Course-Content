package Basic_Fundamentals_of_Programming;

public class Sort_0s_1s {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 1, 1, 0, 0, 1, 1, 1 };

		solve(arr);

	}

	
	private static void solve(int[] arr) {

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			while (arr[left] == 0 && left < right) {
				left++;
			}

			while (arr[right] == 1 && left < right) {
				right--;
			}

			if (left < right) {
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		
		}
		
		for(int val: arr) {
			System.out.print(val + " ");
		}

	}

}

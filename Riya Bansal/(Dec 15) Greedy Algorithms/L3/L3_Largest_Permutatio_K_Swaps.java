package Greedy_Algorithms_Course_3;

public class L3_Largest_Permutatio_K_Swaps {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 2, 1, 3 };
		int n = arr.length;
		int k = 2;

		KSwapPermutation(arr, n, k);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void KSwapPermutation(int[] arr, int n, int k) {

		int[] pos = new int[n + 1];

		for (int i = 0; i < n; i++) {
			pos[arr[i]] = i;
		}

		for (int i = 0; i < n && k > 0; i++) {

			if (arr[i] == n - i) {
				continue;
			}

			int temp = pos[n - i];
			pos[arr[i]] = pos[n - i];
			pos[n - i] = i;

			int temp1 = arr[temp];
			arr[temp] = arr[i];
			arr[i] = temp1;

			k--;
		}

	}

}

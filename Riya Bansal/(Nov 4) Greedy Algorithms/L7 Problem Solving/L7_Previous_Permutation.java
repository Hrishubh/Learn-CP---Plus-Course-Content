package Greedy_Algorithms_Course_2;

public class L7_Previous_Permutation {

	public static void main(String[] args) {

		int[] arr = prevPermOpt1(new int[] {1, 9, 4, 6, 7});
		for(int val: arr) {
			System.out.print(val + " ");
		}
	}

	public static int[] prevPermOpt1(int[] A) {

		if (A.length <= 1)
			return A;

		int idx = -1;

		for (int i = A.length - 1; i >= 1; i--) {
			if (A[i] < A[i - 1]) {
				idx = i - 1;
				break;
			}
		}

		if (idx == -1)
			return A;

		for (int i = A.length - 1; i > idx; i--) {

			if (A[i] < A[idx] && A[i] != A[i - 1]) {
				int temp = A[i];
				A[i] = A[idx];
				A[idx] = temp;
				break;
			}
		}
		return A;

	}
}

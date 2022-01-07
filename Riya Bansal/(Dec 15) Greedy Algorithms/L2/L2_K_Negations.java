package Greedy_Algorithms_Course_3;

import java.util.Arrays;

public class L2_K_Negations {

	public static void main(String[] args) {

		System.out.println(largestSumAfterKNegations(new int[] { 2, -3, -1, 5, -4 }, 2));

	}

	public static int largestSumAfterKNegations(int[] A, int K) {

		Arrays.sort(A);

		int sum = 0;

		if (A[0] >= 0 && K % 2 != 0) {
			A[0] = -A[0];
		} else if (A[0] < 0) {
			int change = 0;

			while (K > 0 && A[change] < 0 && change < A.length) {
				A[change] = -A[change++];
				K--;
			}

			if (K % 2 != 0) {
				int indx = A[change] < A[change - 1] ? change : change - 1;
				A[indx] = -A[indx];
			}
		}
		
		for(int val: A) {
			sum += val;
		}

		return sum;
	}

}

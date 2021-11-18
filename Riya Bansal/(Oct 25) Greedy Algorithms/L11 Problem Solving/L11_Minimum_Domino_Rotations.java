package Greedy_Algorithms_Course_1;

public class L11_Minimum_Domino_Rotations {

	public static void main(String[] args) {

		System.out.println(minDominoRotations(new int[] {2,1,2,4,2,2}, new int[] {5,2,6,2,3,2}));
	}

	public static int check(int x, int[] A, int[] B, int n) {

		int rotations_a = 0;
		int rotations_b = 0;

		for (int i = 0; i < n; i++) {

			if (A[i] != x && B[i] != x)
				return -1;
			else if (A[i] != x)
				rotations_a++;
			else if (B[i] != x)
				rotations_b++;
		}

		return Math.min(rotations_a, rotations_b);

	}

	public static int minDominoRotations(int[] A, int[] B) {

		int rotations = check(A[0], B, A, A.length);

		if (rotations != 1 || A[0] == B[0])
			return rotations;

		else
			return check(B[0], B, A, A.length);
	}

}

package Introduction_to_Programming_In_Java;

public class L8_Matrix_Multiplication {

	public static void main(String[] args) {

		int[][] one = { { 1, 2, 3 }, { 4, 5, 6 } };

		int[][] two = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		int r1 = one.length;
		int c1 = one[0].length;

		int r2 = two.length;
		int c2 = two[0].length;

		int[][] res = new int[r1][c2];

		for (int i = 0; i < res.length; i++) {

			for (int j = 0; j < res[0].length; j++) {
				int sum = 0;

				for (int k = 0; k < c1; k++) {

					int val = one[i][k] + two[k][j];
					sum += val;
				}

				res[i][j] = sum;
			}
		}

		for (int i = 0; i < res.length; i++) {

			for (int j = 0; j < res[0].length; j++) {

				System.out.print(res[i][j] + " ");
			}

			System.out.println();
		}

	}

}

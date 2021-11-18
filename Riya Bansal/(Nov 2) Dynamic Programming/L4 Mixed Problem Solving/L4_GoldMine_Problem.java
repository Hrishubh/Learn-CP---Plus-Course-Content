package Dynamic_Programming_Course;

public class L4_GoldMine_Problem {

	public static void main(String[] args) {

		goldMineProblem(new int[][] { { 1, 3, 1, 5 }, { 2, 2, 4, 1 }, { 5, 0, 2, 3 }, { 0, 6, 1, 2 } });

	}

	private static void goldMineProblem(int[][] arr) {

		int[][] dp = new int[arr.length][arr[0].length];

		for (int j = arr[0].length - 1; j >= 0; j--) {

			for (int i = arr.length - 1; i >= 0; i--) {
				if (j == arr[0].length - 1) {
					dp[i][j] = arr[i][j];
				} else if (i == 0) {
					dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
				} else if (i == arr.length - 1) {

					dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
				} else {
					dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i - 1][j + 1], dp[i + 1][j + 1]));
				}
			}
		}

		int max = dp[0][0];

		for (int i = 1; i < dp.length; i++) {
			if (dp[i][0] > max) {
				max = dp[i][0];
			}
		}

		System.out.println(max);
	}

}

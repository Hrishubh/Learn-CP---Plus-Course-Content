package Dynamic_Programming_Course;

public class L12_Perfect_Squares {

	public static void main(String[] args) {

		int n = 7;

		int[] dp = new int[n + 1];

		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i <= n; i++) {

			int min = Integer.MAX_VALUE;

			for (int j = 1; j * j <= i; j++) {
				int rem = i - j * j;
				if (dp[rem] < min) {
					min = dp[rem];
				}
			}

			dp[i] = min + 1;
		}

		System.out.println(dp[n]);
	}

}

package Dynamic_Programming_Course;

public class L2_Longest_Increasing_Subsequence {

	public static void main(String[] args) {

		int n = 10;
		int[] arr = { 10, 22, 9, 31, 21, 50, 41, 60, 80, 1 };
		int ans = 0;

		int[] dp = new int[n];

		dp[0] = 1;

		for (int i = 0; i < dp.length; i++) {
			int max = 0;

			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					if (dp[j] > max) {
						max = dp[j];
					}
				}
			}

			dp[i] = max + 1;
			if (dp[i] > ans) {
				ans = dp[i];
			}
		}
		
		System.out.println(ans);
	}
}

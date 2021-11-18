package Dynamic_Programming_Course;

public class L2_Coin_Change_Combinations {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5 };
		int amount = 7;

		System.out.println(solve(arr, amount));

	}

	private static int solve(int[] arr, int amount) {

		int[] dp = new int[amount + 1];

		dp[0] = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i]; j < dp.length; j++) {
				dp[j] = dp[j] + dp[j - arr[i]];
			}
		}

		return dp[amount];

	}

}

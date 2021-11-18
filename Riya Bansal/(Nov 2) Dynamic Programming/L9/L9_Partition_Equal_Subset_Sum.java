package Dynamic_Programming_Course;

public class L9_Partition_Equal_Subset_Sum {

	public static void main(String[] args) {

		System.out.println(canPartition(new int[] { 1, 5, 11, 5 }));

	}

	public static boolean canPartition(int[] nums) {

		int totalSum = 0;

		for (int num : nums) {
			totalSum += num;
		}

		if (totalSum % 2 != 0)
			return false;

		int subSetSum = totalSum / 2;
		int n = nums.length;

		boolean dp[][] = new boolean[n + 1][subSetSum + 1];
		dp[0][0] = true;

		for (int i = 1; i <= n; i++) {
			int curr = nums[i - 1];
			for (int j = 0; j <= subSetSum; j++) {

				if (j < curr) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - curr];
				}

			}
		}

		return dp[n][subSetSum];

	}

}

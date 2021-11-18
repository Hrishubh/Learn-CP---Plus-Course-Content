package Dynamic_Programming_Course;

public class L11_Minimum_Refuelling_Stops {

	public static void main(String[] args) {

		System.out.println(minRefuelStops(100, 10, new int[][] { { 10, 60 }, { 20, 30 }, { 30, 30 }, { 60, 40 } }));
	}

	public static int minRefuelStops(int target, int startFuel, int[][] stations) {

		int n = stations.length;

		long[] dp = new long[n + 1];

		dp[0] = startFuel;

		for (int i = 0; i < n; i++) {
			for (int t = i; t >= 0; t--) {
				if (dp[t] >= stations[i][0])
					dp[t + 1] = Math.max(dp[t + 1], dp[t] + (long) stations[i][1]);
			}
		}

		for (int i = 0; i <= n; i++) {

			if (dp[i] >= target)
				return i;
		}

		return -1;
	}
}

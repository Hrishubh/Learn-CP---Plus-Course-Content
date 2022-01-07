package Dynamic_Programming_Course;

import java.util.Arrays;

public class L12_Non_Overlapping_Bridges {

	public static class Bridge implements Comparable<Bridge> {

		int n;
		int s;

		Bridge(int n, int s) {
			this.n = n;
			this.s = s;
		}

		public int compareTo(Bridge o) {
			return this.n - o.n;
		}
	}

	public static void main(String[] args) {

		Bridge[] bridge = { new Bridge(6, 2), new Bridge(4, 3), new Bridge(2, 6), new Bridge(1, 5)

		};

		Arrays.sort(bridge);

		int[] dp = new int[bridge.length];
		int max = 0;

		for (int i = 0; i < bridge.length; i++) {

			int currMax = 0;
			for (int j = 0; j < i; j++) {

				if (bridge[j].s <= bridge[i].s) {
					if (dp[j] > currMax) {
						currMax = dp[j];
					}
				}
			}

			dp[i] = currMax + 1;
			if (dp[i] > max) {
				max = dp[i];
			}
		}

		System.out.println(max);
	}

}

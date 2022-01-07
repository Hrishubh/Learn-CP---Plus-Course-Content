package Greedy_Algorithms_Course_2;

import java.util.Arrays;

public class L11_Minimum_Cost_K_Workers {

	public static void main(String[] args) {

		System.out.println(mincostToHireWorkers(new int[] { 10, 20, 5 }, new int[] { 70, 50, 30 }, 2));

	}

	private static double mincostToHireWorkers(int[] quality, int[] wages, int K) {

		double ans = 1e9;

		for (int captain = 0; captain < quality.length; captain++) {

			double factor = (double) wages[captain] / quality[captain];
			double prices[] = new double[quality.length];

			int t = 0;

			for (int worker = 0; worker < quality.length; worker++) {

				double price = factor * quality[worker];

				if (price < wages[worker])
					continue;
				prices[t++] = price;
			}

			if (t < K)
				continue;
			Arrays.sort(prices, 0, t);
			double cand = 0;
			for (int i = 0; i < K; i++) {
				cand += prices[i];
			}
			ans = Math.min(ans, cand);

		}

		return ans;

	}

}

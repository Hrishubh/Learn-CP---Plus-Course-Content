package Dynamic_Programming_Course;

public class L7_Unbounded_KnapSack {

	public static void main(String[] args) {
		
		int[] vals = {15, 14, 10, 45, 30};
		int[] weights = {2, 5, 1, 3, 4};
		
		int cap = 7;
		
		System.out.println(solve(vals, weights, cap));

	}

	private static int solve(int[] vals, int[] weights, int cap) {
		

		int[] dp = new int[cap + 1];
		dp[0] = 0;
		
		for(int bagc = 1; bagc <= cap; bagc++) {
			
			int max = 0;
			
			for(int i = 0; i < weights.length; i++) {
				if(weights[i] <= bagc) {
					int rbagc = bagc - weights[i];
					int rbagv = dp[rbagc];
					
					int tbagv = rbagv + vals[i];
					
					if(tbagv > max) {
						max = tbagv;
					}
				}
			}
			
			dp[bagc] = max;
		}
		
		return dp[cap];
	}

}

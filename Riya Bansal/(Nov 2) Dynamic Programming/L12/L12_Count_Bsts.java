package Dynamic_Programming_Course;

public class L12_Count_Bsts {

	public static void main(String[] args) {
		

		int n = 4;
		
		int[] dp = new int[6];
		
		dp[0] = 1;
		dp[1] = 1;
		

		for(int i = 2; i <= n; i++) {
			
			int l = 0;
			int r = i - 1;
			
			while(l <= i - 1) {
				
				dp[i] += dp[l] * dp[r];
				l++;
				r--;
			}
		}
		
		System.out.println(dp[n]);
	}

}

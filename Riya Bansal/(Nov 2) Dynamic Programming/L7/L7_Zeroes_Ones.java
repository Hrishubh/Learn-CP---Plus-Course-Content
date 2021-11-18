package Dynamic_Programming_Course;

public class L7_Zeroes_Ones {

	public static void main(String[] args) {
		
		System.out.println(findMaxForm(new String[]{"10","0001","111001","1","0"}, 5, 3));

	}
	
	 public static int findMaxForm(String[] strs, int m, int n) {
		 
		 int[][] dp = new int[m + 1][n + 1];
		 
		 for(String s: strs) {
			 
			 int[] count = countZO(s);
			 
			 for(int zeroes = m; zeroes >= count[0]; zeroes--) {
				 
				 for(int ones = n; ones >= count[1]; ones--) {
					 
					 dp[zeroes][ones] = Math.max(1 + dp[zeroes - count[0]][ones - count[1]], dp[zeroes][ones]);
				 }
			 }
			 
			 
		 }
		 
		 return dp[m][n];
	 }

	private static int[] countZO(String s) {
		

		int[] c = new int[2];
		for(int i = 0; i < s.length(); i++) {
			c[s.charAt(i) - '0']++;
		}
		
		return c;
		
	}

}

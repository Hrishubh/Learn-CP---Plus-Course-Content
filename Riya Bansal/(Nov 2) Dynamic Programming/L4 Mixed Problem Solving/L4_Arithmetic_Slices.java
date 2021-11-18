package Dynamic_Programming_Course;

public class L4_Arithmetic_Slices {

	public static void main(String[] args) {
		
		int[] arr = {2, 5, 9, 12, 15, 18, 22, 26, 30};
		
		find(arr);

	}

	private static void find(int[] arr) {
		
		int[] dp = new int[arr.length];
		
		int ans = 0;
		
		for(int i = 2; i < arr.length; i++) {
			if(arr[i] - arr[i - 1] == arr[i - 1] - arr[i - 2]) {
				dp[i] = dp[i - 1] + 1;
				ans += dp[i];
			}
		}
		
		System.out.println(ans);
		
	}

}

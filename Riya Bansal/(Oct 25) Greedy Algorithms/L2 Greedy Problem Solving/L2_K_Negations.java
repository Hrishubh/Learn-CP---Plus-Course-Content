package Greedy_Algorithms_Course_2;

import java.util.Arrays;

public class L2_K_Negations {

	public static void main(String[] args) {
		
		System.out.println(largestSumAfterKNegations(new int[] {2,-3,-1,5,-4}, 2));
		
		
	}
	
	public static int largestSumAfterKNegations(int[] nums, int k){
		
		Arrays.sort(nums);
		
		int res = 0;
		
		int min = 101;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < 0 && k > 0) {
				nums[i] = - nums[i];
				k--;
			}
			
			if(nums[i] < min) {
				min = nums[i];
			}
			
			res += nums[i];
		}
		
		if(k % 2 == 1) {
			res -= 2 * min;
		}
		
		return res;
		
	}

}

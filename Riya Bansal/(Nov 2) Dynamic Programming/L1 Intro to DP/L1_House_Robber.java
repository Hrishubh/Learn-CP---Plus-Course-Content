package Dynamic_Programming_Course;

public class L1_House_Robber {

	public static void main(String[] args) {

		System.out.println(rob(new int[] {2,7,9,3,1}));
	}

	public static int rob(int[] nums) {

		if(nums.length == 0) {
			return 0;
		}
		
		int robNext;
		int robNextPlusOne;
		
		robNextPlusOne = 0;
		robNext = nums[nums.length - 1];
		
		for(int i = nums.length - 2; i >= 0; i--) {
			int curr = Math.max(robNext, robNextPlusOne + nums[i]);
			
			robNextPlusOne = robNext;
			robNext = curr;
			
		}
		
		return robNext; 
		
	}

}

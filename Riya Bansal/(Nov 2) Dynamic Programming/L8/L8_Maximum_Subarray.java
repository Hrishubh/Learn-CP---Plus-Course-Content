package Dynamic_Programming_Course;

public class L8_Maximum_Subarray {

	public static void main(String[] args) {
		

		System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));

	}
	
	 public static int maxSubArray(int[] nums) {
		 
		 int currSubArray = nums[0];
		 int maxSubArray = nums[0];
		 
		 for(int i = 1; i < nums.length; i++) {
			 
			 int num = nums[i];
			 
			 currSubArray = Math.max(num, currSubArray + num);
			 maxSubArray = Math.max(maxSubArray, currSubArray);
		 }
		 
		 return maxSubArray;
	 }

}

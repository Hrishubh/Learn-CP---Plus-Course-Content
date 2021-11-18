package Greedy_Algorithms_Course_2;

public class L4_Jump_Game_II {

	public static void main(String[] args) {
		
		System.out.println(jump(new int[] { 2, 3, 1, 1, 4 }));

	}
	
	public static int jump(int[] nums) {
		
		int jumps = 0;
		int farthest = 0;
		int currJumpEnd = 0;
		
		for(int i = 0; i < nums.length - 1; i++) {
			
			farthest = Math.max(farthest, i + nums[i]);
			
			if(i == currJumpEnd) {
				jumps++;
				currJumpEnd = farthest;
			}
		}
		
		return jumps;
	}

}

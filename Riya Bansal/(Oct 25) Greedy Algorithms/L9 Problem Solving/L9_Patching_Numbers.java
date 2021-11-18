package Greedy_Algorithms_Course_1;

public class L9_Patching_Numbers {

	public static void main(String[] args) {

		System.out.println(minPatches(new int[] {1, 5 ,10}, 20));
		
	}

	public static int minPatches(int[] nums, int n) {

		int patches = 0;
		int i = 0;
		long miss = 1;
		while(miss <= n) {
			
			if(i < nums.length && nums[i] <= miss) {
				miss += nums[i++];
			}else {
				miss += miss;
				patches++;
			}
		}
		
		
		return patches;
	}

}

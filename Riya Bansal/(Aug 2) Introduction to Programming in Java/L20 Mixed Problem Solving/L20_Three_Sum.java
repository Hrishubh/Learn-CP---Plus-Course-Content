package Introduction_to_Programming_In_Java_2;

import java.util.*;

public class L20_Three_Sum {

	public static void main(String[] args) {

		System.out.println(threeSum(new int[] { 0, 1, -1, -4, -1, 2 }));

	}

	private static List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < nums.length & nums[i] <= 0; i++) {

			if (i == 0 || nums[i - 1] != nums[i]) {
				twoSum(nums, i, res);
			}
		}
		
		return res;
	}

	private static void twoSum(int[] nums, int i, List<List<Integer>> res) {
		
		int lo = i + 1;
		int hi = nums.length - 1;
		
		while(lo < hi) {
			int sum = nums[i] + nums[lo] + nums[hi];
			if(sum < 0) {
				lo++;
			}else if(sum > 0) {
				hi--;
			}else {
				res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
				while(lo < hi && nums[lo] == nums[lo - 1]) {
					lo++;
				}
				
			}
		}
		
	}

}

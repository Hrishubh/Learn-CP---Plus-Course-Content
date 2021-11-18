package Dynamic_Programming_Course;

public class L9_Delete_And_Earn {

	public static void main(String[] args) {

		System.out.println(deleteAndEarn(new int[] {2,2,3,3,3,4}));
		
	}

	public static int deleteAndEarn(int[] nums) {

		int n = 10001;
		
		int[] values = new int[n];
		
		for(int num: nums) {
			values[num] += num;
		}
		
		int take = 0;
		int skip = 0;
		
		for(int i = 0; i < n; i++) {
			int takei = skip + values[i];
			int skipi = Math.max(skip, take);
			
			take = takei;
			skip = skipi;
		}
		
		return Math.max(take, skip);
	}

}

package Introduction_to_Programming_In_Java;

import java.util.HashMap;

public class L14_SubArray_Sum_K {

	public static void main(String[] args) {
		
		System.out.println(solve(new int[] {3, 4, 7, 2, -3, 1, 4, 2}, 7));

	}

	private static int solve(int[] arr, int k) {
		
		int count = 0;
		int sum = 0;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0 , 1);
		
		for(int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
			if(map.containsKey(sum - k)) {
				count += map.get(sum - k);
			}
			
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		
		return count;
		
	}

}

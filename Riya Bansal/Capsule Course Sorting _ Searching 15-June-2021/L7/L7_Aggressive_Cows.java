package Sorting_Searching_Course;

import java.util.Arrays;
import java.util.Scanner;

public class L7_Aggressive_Cows {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int c = scn.nextInt();

		int[] arr = new int[n];
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println(distributeCows(n, c, arr, max));
	}

	private static int distributeCows(int n, int c, int[] arr, int max) {

		Arrays.sort(arr);

		// Defining search space
		int low = 0;
		int high = max;

		int ans = 0;

		while (low <= high) {

			// mid is depicting the min distance any two cows.
			// -> All cows should be atleast mid distance apart.
			int mid = (low + high) / 2;
			
			if (good(mid, n, c, arr)) {

				ans = mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		
		return ans;

	}

	private static boolean good(int mid, int n, int c, int[] arr) {
		
		//Objective: 
		//Decide whether the mid value is good or not. 
		
		//Check if whether we can place c cows atleast mid distance apart.
		
		//store the no of cows placed. 
		
		int count = 1;
		
		//storing the position at which the last cow was placed. 
		int last_pos = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] - last_pos >= mid) {
				last_pos = arr[i];
				count++;
			}
			if(count == c) {
				return true;
			}
		}
		
		return false;
	}

}

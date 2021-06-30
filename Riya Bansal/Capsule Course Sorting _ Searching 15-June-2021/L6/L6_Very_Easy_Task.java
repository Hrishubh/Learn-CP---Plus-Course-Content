package Sorting_Searching_Course;

import java.util.Scanner;

public class L6_Very_Easy_Task {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = scn.nextInt();
		int y = scn.nextInt();

		System.out.println(minTime(n, x, y));
	}
	
	

	//TC - log(Math.max(x, y)*n)
	private static int minTime(int n, int x, int y) {

		if (n == 1) {
			return Math.min(x, y);
		}
		
		//ans range
		int left = 0;
		int right = Math.max(x, y) * n;
		
		int ans = 0;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			//good -> true
			//good -> false
			if(good(n, x, y, mid)) {
				ans = mid;
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		}
		//(n - 1) copies + 1 copy
		return ans + Math.min(x, y);
	}

	//O(1)
	private static boolean good(int n, int x, int y, int mid) {
		
		//Objective
		//If in mid amount of time, i am able to make n - 1 copies, then my mid value is good.
		//Return true, otherwise return false. 
		
		//Check how many copies can be made in mid amount of time. 
		//If the no of copies > n - 1 return true, 
		//otherwise return false;
		
		//c1 copier can make mid/x copies in mid time. 
		//c2 copier can make mid/y copied in mid time. 
		
		return (mid/x) + (mid/y) >= n - 1;
	}

}

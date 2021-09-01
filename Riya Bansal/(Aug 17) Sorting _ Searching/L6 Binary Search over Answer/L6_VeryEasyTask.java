package Sorting_Searching_Course_2;

import java.util.Scanner;

public class L6_VeryEasyTask {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int x = scn.nextInt();
		int y = scn.nextInt();
		
		System.out.println(minTime(n, x, y));

	}

	//TC - O(log(Math.max(x, y) * n))
	private static int minTime(int n, int x, int y) {
		
		
		if(n == 1) {
			return Math.min(x, y);
			
		}
		
		//search space of the ans
		int left = 0;
		int right = Math.max(x, y) * n;
	
		int ans = 0;
		
		while(left <= right) {
			
			//time range
			int mid = (left + right) / 2;
			//good function checks if the mid time range is enough
			//to make all the copies. 
			if(good(n, x, y, mid)){
				ans = mid;
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		}
		
		
		
		return ans + Math.min(x, y);
	
	}

	private static boolean good(int n, int x, int y, int mid) {
		
		//Objective
		//If in mid amount of time, i am able to make n - 1 copies,
		//then my mid value is good
		
		//Check how many copies can be made in mid amount of time. 
		//if the no copies > n - 1 return true;
		//otherwise return false
		
		//c1 copier makes mid/x copies in mid time.
		//c2 copier can make mid/y copies in mid time
		
		return (mid/x) + (mid/y) >= n - 1;
	}

}

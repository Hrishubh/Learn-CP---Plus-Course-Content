package Sorting_Searching_Course;

import java.util.*;

public class L6_Colour_Me_Yellow {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int test = scn.nextInt();

		while (test-- > 0) {
			long n = scn.nextLong();
			long red = scn.nextLong();
			long green = scn.nextLong();
			long blue = scn.nextLong();

			System.out.println(colour(red, blue, green, n));
		}

	}

	private static long colour(long red, long blue, long green, long n) {

		// defining the search space
		long left = 0;

		long right = Math.min(n, Math.min(red, blue));

		long ans = 0;

		while (left <= right) {

			//mid reprsents the no of columns that can be filled. 
			long mid = (left + right) / 2;
			
			if(good(red, mid, blue, green)) {
				ans = mid;
				left = mid + 1;
			}else {
				right = mid - 1;
			}

		}

		return ans;
	}

	private static boolean good(long red, long mid, long blue, long green) {
		
		//Objective
		//I am trying to check if I can fill mid no of columns with available colours. 
		//If yes, return true. 
		//Otherwise return false.
		
		
		//I have mid columns to fill. 
		//If I am trying to fill mid no of columns, then I need atleast mid no of red and blue tiles. 
		//for the third row, I basically need mid no of tiles of any colour. 
		
		//(red - mid) + (blue - mid) + green  leftover tiles after filling 2 rows
		return (red - mid) + (blue - mid) + green >= mid;
		
		//red + blue + green - 2*mid >= mid;
		//red + blue + green >= 3*mid;
		
		//(red + blue + green) / 3 >= mid;
		
		
	}
}

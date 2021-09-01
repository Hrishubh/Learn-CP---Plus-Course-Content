package Sorting_Searching_Course_2;

import java.util.Scanner;

public class L6_Color_Me_Yellow {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int test = scn.nextInt();
		
		while(test-- > 0) {
			
			long n = scn.nextLong();
			long red = scn.nextLong();
			long green = scn.nextLong();
			long blue = scn.nextLong();
			
			System.out.println(color(red, blue, green, n));
		}

	}

	private static long color(long red, long blue, long green, long n) {
	
		
		long left = 0;
		long right = Math.min(n, Math.min(red, blue));
		
		long ans = 0;
		
		while(left <= right)
		{
			//mid represents the no of columns that can be filled. 
			
			long mid = (left + right)/2;
			
			if(good(red, mid, blue, green)){
				
				ans = mid;
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return ans;
		
	}

	private static boolean good(long red, long mid, long blue, long green) {
		
		//Objective: TO check if mid columns can be filled with available tiles.
		
		
		//If I am trying to fill mid no columns, then I need
		//atleast mid no of red and blue tiles. 
		
		//I have two rows of mid no of columns filled by red and blue. 
		//For the third row of all mid columns,
		//I basically need mid no of tiles of any colour. 
		
		//Tiles left after filling the 1st and 2nd row
		
		return (red - mid) + (blue - mid) + green >= mid;
	}
}

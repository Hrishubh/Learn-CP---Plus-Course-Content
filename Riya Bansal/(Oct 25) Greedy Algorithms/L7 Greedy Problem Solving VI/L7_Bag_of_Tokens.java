package Greedy_Algorithms_Course_1;

import java.util.Arrays;

public class L7_Bag_of_Tokens {

	public static void main(String[] args) {

		System.out.println(bagOfTokensScore(new int[] {100, 200, 300, 400}, 200));
	}

	public static int bagOfTokensScore(int[] tokens, int power) {

		Arrays.sort(tokens);
		
		int lo = 0;
		int hi = tokens.length - 1;
		
		int points = 0;
		int ans = 0;
		
		while(lo <= hi && (power >= tokens[lo] || points> 0)) {
			
			while(lo <= hi && power >= tokens[lo]) {
				power -= tokens[lo++];
				points++;
			}
			
			ans = Math.max(ans, points);
			
			if(lo <= hi && points > 0) {
				power += tokens[hi--];
				points--;
			}
		}
		
		return ans;
	}

}

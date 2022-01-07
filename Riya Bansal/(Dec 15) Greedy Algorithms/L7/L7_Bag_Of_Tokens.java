package Greedy_Algorithms_Course_3;

import java.util.Arrays;

public class L7_Bag_Of_Tokens {

	public static void main(String[] args) {
	

		System.out.println(bagOfTokensScore(new int[] { 100, 200, 300, 400 }, 200));


	}
	
	private static int bagOfTokensScore(int[] tokens, int power) {
		
		Arrays.sort(tokens);
		
		int i = 0;
		int j = tokens.length - 1;
		
		int points = 0;
		int res = 0;
		
		while(i <= j) {
			if(power >= tokens[i]) {
				power -= tokens[i++];
				res = Math.max(res, ++points);
			}else if(points > 0) {
				points--;
				power += tokens[j--];
			}else {
				break;
			}
		}
		
		return res;
	}
	
}

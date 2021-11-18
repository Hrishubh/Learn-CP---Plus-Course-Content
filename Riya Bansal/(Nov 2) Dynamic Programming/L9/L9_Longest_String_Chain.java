package Dynamic_Programming_Course;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L9_Longest_String_Chain {

	public static void main(String[] args) {
		

		System.out.println(longestStrChain(new String[] {"a","b","ba","bca","bda","bdca"}));

	}
	
	public static int longestStrChain(String[] words) {
		
		
		Map<String, Integer> dp = new HashMap<>();
		
		Arrays.sort(words, (a,  b) -> (a.length() - b.length()));
		
		int longestLength = 1;
		
		for(String word: words) {
			
			int pLength = 1;
			
			for(int i = 0; i < word.length(); i++) {
				StringBuilder temp = new StringBuilder(word);
				temp.deleteCharAt(i);
				String pre = temp.toString();
				int prevLength = dp.getOrDefault(pre, 0);
				pLength = Math.max(pLength, prevLength + 1);
				
			}
			
			dp.put(word, pLength);
			longestLength = Math.max(longestLength, pLength);
		}
		
		return longestLength;
	}
}

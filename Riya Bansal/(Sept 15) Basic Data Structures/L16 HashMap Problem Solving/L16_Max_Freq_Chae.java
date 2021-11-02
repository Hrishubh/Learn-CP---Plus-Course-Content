package Basic_Data_Structures_Course;

import java.util.HashMap;
import java.util.Set;

public class L16_Max_Freq_Chae {

	public static void main(String[] args) {

		System.out.println(maxFreqChar("aggdbce"));

	}

	private static char maxFreqChar(String string) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
//			if (map.containsKey(ch)) {
//				int of = map.get(ch);
//				int nf = of + 1;
//				map.put(ch, nf);
//			} else {
//				map.put(ch, 1);
//			}
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		Set<Character> keySet = map.keySet();

		int maxFreq = Integer.MIN_VALUE;
		char maxChar = ' ';

		for (char key : keySet) {

			if (map.get(key) > maxFreq) {
				maxFreq = map.get(key);
				maxChar = key;
			}
		}

		return maxChar;
	}

}

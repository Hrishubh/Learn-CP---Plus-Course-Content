package Introduction_to_Programming_In_Java_2;

public class L12_Longest_Substring_Without_Repetition {

	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("abcdeafbfgcbb"));

	}

	private static int lengthOfLongestSubstring(String s) {

		Integer[] chars = new Integer[128];

		int left = 0;
		int right = 0;

		int res = 0;

		while (right < s.length()) {

			char r = s.charAt(right);

			Integer index = chars[r];

			if (index != null && index >= left && index < right) {

				left = index + 1;
			}

			res = Math.max(res, right - left + 1);

			chars[r] = right;
			right++;
		}

		return res;
	}

}

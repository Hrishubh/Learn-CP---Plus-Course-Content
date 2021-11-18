package Greedy_Algorithms_Course_2;

public class L5_Construct_K_Palindrome_Strings {

	public static void main(String[] args) {

		System.out.println(canConstruct("annabelle", 2));
	}

	public static boolean canConstruct(String s, int k) {

		int odd = 0;
		int n = s.length();

		int count[] = new int[26];

		for (int i = 0; i < n; i++) {
			count[s.charAt(i) - 'a'] ^= 1;

			odd += count[s.charAt(i) - 'a'] > 0 ? 1 : -1;
		}

		return odd <= k && k <= n;
	}

}

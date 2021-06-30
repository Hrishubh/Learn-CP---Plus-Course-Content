package String_Algorithms;



public class KMP_Algorithm {

	public static void main(String[] args) {

		String text = "abcxabcdabcdabcy";
		String pat = "abcda";

		System.out.println(KMP(text.toCharArray(), pat.toCharArray()));

	}

	private static boolean KMP(char[] text, char[] pattern) {

		int[] lps = computeLPS(pattern);

		int i = 0;
		int j = 0;

		while (i < text.length && j < pattern.length) {
			if (text[i] == pattern[j]) {
				i++;
				j++;
			} else {

				if (j != 0) {
					j = lps[j - 1];
				} else {
					i++;
				}
			}
		}

		if (j == pattern.length) {
			return true;

		} else {
			return false;
		}

	}

	private static int[] computeLPS(char[] pattern) {

		int[] lps = new int[pattern.length];
		int j = 0;
		lps[0] = 0;

		for (int i = 1; i < pattern.length;) {

			if (pattern[i] == pattern[j]) {
				lps[i] = j + 1;
				j++;
				i++;
			} else {

				if (j != 0) {
					j = lps[j - 1];
				} else {
					lps[i] = 0;
					i++;
				}
			}
		}

		return lps;
	}

}

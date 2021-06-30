package Basic_Fundamentals_of_Programming;

public class L8_Problem_Solving {

	public static void main(String[] args) {

		int[][] mat = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };

		//System.out.println(checkMatrixCircularRotation(mat));
		//System.out.println(longestWordInDictionary("abcpcplea", new String[] { "ale", "apple", "monkey", "plea" }));
		System.out.println(CharacterReplacement("aababcc", 2));
	}
	
	public static int CharacterReplacement(String s, int k) {
		 int[] freq = new int[26];
		 
		 int mostFreqLetter = 0;
		 int left = 0;
		 int max  = 0;
		 
		 for(int right = 0; right < s.length(); right++) {
			 
			 freq[s.charAt(right) - 'a']++;
			 
			 mostFreqLetter = Math.max(mostFreqLetter, freq[s.charAt(right) - 'a']);
			 
			 int lettersToChange = (right - left + 1) - mostFreqLetter;
			 
			 if(lettersToChange > k) {
				 freq[s.charAt(left) - 'a']--;
				 left++;
			 }
			 
			 max = Math.max(max, right - left + 1);
		 }
		 
		 return max;
		
		
	}
	private static String longestWordInDictionary(String string,
			String[] stringList) {

		String lString = ""; //apple

		for (String str : stringList) {

				//abcpc
			if (isSubsequence(str, string)) {

				if (str.length() > lString.length() || 
						(str.length() == lString.length() && str.compareTo(lString) < 0)) {
					lString = str;
				}
			}
		}

		return lString;
	}

	// check if x is a subsequence of y
	private static boolean isSubsequence(String x, String y) {

		int j = 0;

		for (int i = 0; i < y.length() && j < x.length(); i++) {
			if (x.charAt(j) == y.charAt(i)) {
				j++;
			}
		}

		return j == x.length();
	}

	// TC - O(n^2)
	// SC - O(1)
	private static boolean checkMatrixCircularRotation(int[][] mat) {

		String concatString = "";

		for (int i = 0; i < mat[0].length; i++) {
			concatString = concatString + "-" + String.valueOf(mat[0][i]);
		}

		concatString = concatString + "-" + concatString;

		System.out.println(concatString);
		// going to each and every row
		for (int i = 1; i < mat.length; i++) {
			String currConcatString = "";

			// for each row, going to each and every col for that row.
			for (int j = 0; j < mat.length; j++) {
				// finding the concatenated string for that row.
				currConcatString = currConcatString + "-" + String.valueOf(mat[i][j]);
			}

			System.out.println(currConcatString);
			// check if currConcatString is present as a substring in concatString
			if (!concatString.contains(currConcatString)) {
				return false;
			}
		}
		return true;
	}

}

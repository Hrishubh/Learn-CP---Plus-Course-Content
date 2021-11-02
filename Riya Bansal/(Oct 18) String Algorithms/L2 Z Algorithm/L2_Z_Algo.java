package String_Algorithms_3;

import java.util.*;

public class L2_Z_Algo {

	public static void main(String[] args) {

		String text = "aaabcxyzaaaabczaaczabbaaaaaabc";

		String pat = "aaabc";

		List<Integer> res = patternMatching(text.toCharArray(), pat.toCharArray());
		
		System.out.println(res);

	}

	private static List<Integer> patternMatching(char[] text, char[] pattern) {

		char newArr[] = new char[text.length + 1 + pattern.length];
		int i = 0;

		for (char ch : pattern) {
			newArr[i] = ch;
			i++;
		}

		newArr[i] = '$';
		i++;

		for (char ch : text) {
			newArr[i] = ch;
			i++;
		}

		List<Integer> result = new ArrayList<>();

		int Z[] = calculateZ(newArr);
		;

		for (i = 0; i < Z.length; i++) {
			if (Z[i] == pattern.length) {
				result.add(i - pattern.length - 1);
			}
		}

		return result;
	}

	private static int[] calculateZ(char[] input) {

		int Z[] = new int[input.length];

		int left = 0;
		int right = 0;

		Z[0] = 0;

		// iterating over each and every element in the array to calculate its Z-value
		for (int k = 1; k < input.length; k++) {

			// There are two possible cases:
			// 1. K can be out of the Z-box i.e., greatar than the right boundary
			if (k > right) {

				// possibly the starting of the Z-box
				left = right = k;

				while (right < input.length && input[right] == input[right - left]) {

					// moving the right boundary
					right++;
				}

				Z[k] = right - left;
				right--;

			} else {

				// 2. k can be inside the z-box

				// we are operating inside the z-box

				// tells how far are you from the left boundary
				// also the character from the start of the string from where
				// we will copy the z-value
				int k1 = k - left;

				// if the value does not stretch till the right boundary
				// then simply copy the z-value
				if (Z[k1] < right - k + 1) {
					Z[k] = Z[k1];
				} else {

					// calculating the z-value for the char instead of copying

					left = k;

					while (right < input.length && input[right] == input[right - left]) {

						// moving the right boundary
						right++;
					}

					Z[k] = right - left;
					right--;
				}
			}
		}

		return Z;

	}

}

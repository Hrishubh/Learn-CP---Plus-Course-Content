package Basic_Fundamentals_of_Programming;

public class L5_ComplexityAnalysis {

	public static void main(String[] args) {

		//System.out.println(countPalindromicSS("babad"));
		// b, a, b, a, d, aba, bab
		
		System.out.println(power(2, 5));
	}

	public static int countPalindromicSS(String str) {

		int count = 0;

		// odd length
		for (int axis = 0; axis < str.length(); axis++) {

			for (int orbit = 0; (axis - orbit >= 0) && (axis + orbit < str.length()); orbit++) {

				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else {
					break;
				}
			}
		}

		// even length
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; (axis - orbit >= 0) && (axis + orbit < str.length()); orbit++) {
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					count++;
				} else {
					break;
				}

			}
		}

		return count;
	}

	public static int power(int x, int n) {

		if (n == 0) {
			return 1;
		}
		int rr = power(x, n / 2);

		int ans = 0;

		if (n % 2 == 0) {
			ans = rr * rr;
		} else {
			ans = rr * rr * x;
		}
		
		return ans;

	}
}

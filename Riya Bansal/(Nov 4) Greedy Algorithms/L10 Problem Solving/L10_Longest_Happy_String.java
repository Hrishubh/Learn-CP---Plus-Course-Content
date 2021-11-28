package Greedy_Algorithms_Course_2;

public class L10_Longest_Happy_String {

	public static void main(String[] args) {

		System.out.println(longestHappyString(1, 1, 7));

	}

	private static String longestHappyString(int a, int b, int c) {

		int total = a + b + c;

		int currA = 0;
		int currB = 0;
		int currC = 0;

		String res = "";

		while (total > 0) {

			if ((a >= b && a >= c && currA != 2) || (a > 0 && (currB == 2 || currC == 2))) {
				res += 'a';
				a--;
				currA++;
				currB = currC = 0;
			} else if ((b >= c && b >= a && currB != 2) || (b > 0 && (currA == 2 || currC == 2))) {
				res += 'b';
				b--;
				currB++;
				currC = currA = 0;
			} else if ((c >= a && c >= b && currC != 2) || (c > 0 && (currA == 2 || currB == 2))) {
				res += 'c';
				c--;
				currC++;
				currA = currB = 0;
			}
			total--;

		}

		return res;
	}

}

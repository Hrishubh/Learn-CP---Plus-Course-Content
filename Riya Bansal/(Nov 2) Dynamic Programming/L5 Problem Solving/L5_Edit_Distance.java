package Dynamic_Programming_Course;

public class L5_Edit_Distance {

	public static void main(String[] args) {

		String s1 = "sunday", s2 = "saturday";

		System.out.println(EditDistance(s1, s2));
		System.out.println(EditDistanceBU(s1, s2));
	}

	public static int EditDistance(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int res = 0;

		if (ch1 == ch2) {
			res = EditDistance(ros1, ros2);
		} else {
			int i = EditDistance(s1, ros2);
			int d = EditDistance(ros1, s2);
			int r = EditDistance(ros1, ros2);

			res = Math.min(i, Math.min(d, r)) + 1;
		}

		return res;
	}

	public static int EditDistanceBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int i = 0; i <= s1.length(); i++) {

			for (int j = 0; j <= s2.length(); j++) {

				if (i == 0 || j == 0) {
					strg[i][j] = Math.max(i, j);
					continue;
				}

				char ch1 = s1.charAt(s1.length() - i);
				char ch2 = s2.charAt(s2.length() - j);

				if (ch1 == ch2) {

					strg[i][j] = strg[i - 1][j - 1];
				} else {
					int in = strg[i][j - 1];
					int d = strg[i - 1][j];
					int r = strg[i - 1][j - 1];

					strg[i][j] = Math.min(in, Math.min(d, r)) + 1;
				}
			}
		}

		for (int i = 0; i <= s1.length(); i++) {

			for (int j = 0; j <= s2.length(); j++) {
					System.out.print(strg[i][j] + " ");
			}
			
			System.out.println();
		}

		return strg[s1.length()][s2.length()];
	}

}

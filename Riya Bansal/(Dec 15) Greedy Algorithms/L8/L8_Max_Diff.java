package Greedy_Algorithms_Course_3;

public class L8_Max_Diff {

	public static void main(String[] args) {

		System.out.println(maxDiff(900));
		// 900 -> 990 
		// 900 -
	}

	private static int maxDiff(int num) {

		char[] a = Integer.toString(num).toCharArray(), b = a.clone();

		char x = a[0], y = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] == x) {
				a[i] = '9';
				b[i] = '1';

			} else if (x == '1' && a[i] > '0' || x == '9' && a[i] < '9') {
				if (y == 0) {
					y = a[i];
				}

				if (y == a[i]) {
					if (x == '1') {
						b[i] = '0';
					} else {
						a[i] = '9';
					}
				}
			}
		}
		System.out.println(Integer.parseInt(String.valueOf(a)) );
		System.out.println(Integer.parseInt(String.valueOf(b)));
		return Integer.parseInt(String.valueOf(a)) - Integer.parseInt(String.valueOf(b));
	}

}

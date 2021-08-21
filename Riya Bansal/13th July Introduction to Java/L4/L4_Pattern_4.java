package Introduction_to_Programming_In_Java;

public class L4_Pattern_4 {

	public static void main(String[] args) {

		int n = 3;

		int row = 1;
		int nst = 1;

		while (row <= 2 * n - 1) {

			// work
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			// prep
			System.out.println();
			row++;

			if (row <= n ) {
				nst++;
			} else {
				nst--;
			}
		}

	}

}

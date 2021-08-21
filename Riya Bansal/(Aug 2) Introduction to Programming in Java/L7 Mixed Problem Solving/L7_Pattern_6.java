package Introduction_to_Programming_In_Java_2;

public class L7_Pattern_6 {

	public static void main(String[] args) {

		int n = 9;
		int nst = n / 2;
		int nsp = 1;

		int row = 1;

		while (row <= n) {

			// stars
			int cst = 1;

			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			// stars
			cst = 1;

			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}

			System.out.println();
			
			if (row <= n / 2) {
				nst--;
				nsp += 2;
			} else {
				nst++;
				nsp -= 2;
			}
			row++;
		}

	}

}

package Introduction_to_Programming_In_Java;

public class L5_Pattern_5 {

	public static void main(String[] args) {

		int n = 5;

		int rows = 1;

		int nsp = n - 1;
		int nst = n;
		while (rows <= 2 * n - 1) {

			// work for stars and spaces
			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			// prep
			System.out.println();
			
			if (rows <= n - 1) {
				nsp--;
				nst--;

			} else {
				nsp++;
				nst++;
			}
			rows++;

		}

	}

}

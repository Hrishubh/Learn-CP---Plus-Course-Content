package Introduction_to_Programming_In_Java_2;

public class L7_Pattern_5 {

	public static void main(String[] args) {

		int n = 5;

		int row = 1;

		int nst = n;
		int nsp = n - 1;
		while (row <= 2 * n - 1) {

			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}

			// stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			
			System.out.println();
			row++;
			if(row <= n) {
				nst--;
				nsp--;
			}else {
				nst++;
				nsp++;
			}
			
			

		}
	}

}

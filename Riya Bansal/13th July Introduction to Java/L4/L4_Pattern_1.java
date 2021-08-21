package Introduction_to_Programming_In_Java;

public class L4_Pattern_1 {

	public static void main(String[] args) {

//		* * * * * * * * * * 
//		* * * * * * * * * 
//		* * * * * * * * 
//		* * * * * * * 
//		* * * * * * 
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
		
		int n = 10;

		int nst = n;

		int row = 1;

		while (row <= n) {

			// work
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			// prep
			System.out.println();
			row++;
			nst--;
			
		}
	}

}

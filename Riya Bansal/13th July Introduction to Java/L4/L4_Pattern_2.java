package Introduction_to_Programming_In_Java;

public class L4_Pattern_2 {

	public static void main(String[] args) {
		
		
		int n = 3;
		
		int nst = 1;
		int nsp = n - 1;
		
		int row = 1;
		
		while(row <= n) {
			
			//work
				
			//spaces
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			
			//stars
			int cst = 1;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			
			//prep
			System.out.println();
			row++;
			nst++;
			nsp--;
		}

	}

}

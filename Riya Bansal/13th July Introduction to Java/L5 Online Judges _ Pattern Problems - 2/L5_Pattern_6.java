package Introduction_to_Programming_In_Java;

public class L5_Pattern_6 {

	public static void main(String[] args) {
		
		int n = 11;
		
		int row = 1;
		
		int nst = n /2;
		int nsp = 1;
		
		while(row <= n) {
		
			int cst = 1;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			
			//spaces
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			
			 cst = 1;
			while(cst <= nst) {
				System.out.print("*");
				cst++;
			}
			
			//prep
			System.out.println();
			if(row <= n / 2) {
				nst--;
				nsp += 2;
			}else {
				nst++;
				nsp -= 2;
			}
			
			row++;
		}

	}

}

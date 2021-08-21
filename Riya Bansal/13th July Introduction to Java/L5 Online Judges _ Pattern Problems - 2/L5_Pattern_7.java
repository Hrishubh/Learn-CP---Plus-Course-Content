package Introduction_to_Programming_In_Java;

public class L5_Pattern_7 {

	public static void main(String[] args) {
		
		int n = 9;
		
		int row = 1;
		int nst = 1;
		int nsp = n / 2;
		
		
		while(row <= n) {
			
			
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			
			int cst = 1;
			while(cst <= nst) {
				if(cst == 1 || cst == nst) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				cst++;
			}
			
			//prep
			System.out.println();
			
			if(row <= n / 2) {
				nst += 2;
				nsp -= 1;
			}else {
				nst -= 2;
				nsp++;
			}
			row = row + 1; 
		}

	}

}

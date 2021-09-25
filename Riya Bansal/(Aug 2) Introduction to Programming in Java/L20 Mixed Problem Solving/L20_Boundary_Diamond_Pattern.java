package Introduction_to_Programming_In_Java_2;

public class L20_Boundary_Diamond_Pattern {

	public static void main(String[] args) {
		
		int n = 9;
		int row = 1;
		int nst = 1;
		int nsp = n / 2;
		
		while(row <= n) {
			
			//spaces
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			
			//stars
			int cst = 1;
			while(cst <= nst) {
				if(cst == 1 || cst == nst) {
					System.out.print("*");
				}else {
					System.out.print(" "); //add a space
				}
				cst++;
			}
			
			System.out.println(); //added a new line
			if(row <= n/2) {
				nst = nst + 2;
				nsp = nsp - 1;
			}else {
				nst = nst - 2;
				nsp = nsp + 1;
			}
			
			row = row + 1;
		}

	}

}

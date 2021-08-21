package Introduction_to_Programming_In_Java_2;

public class L5_Pattern_1 {

	public static void main(String[] args) {
		
		int n = 11;
		
		int nst = n;
		
		//int row = 1;
		
//		while(row <= n) {
			for(int row = 1; row <= n; row++) {
			//work
			
			int cst = 1;
			while(cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			
			//prep
			System.out.println();
			//row++;
			nst--;
		}

	}

}

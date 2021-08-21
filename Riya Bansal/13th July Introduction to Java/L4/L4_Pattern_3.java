package Introduction_to_Programming_In_Java;

public class L4_Pattern_3 {

	public static void main(String[] args) {
		
		int n = 4;
		
		int row = 1;
		
		while(row <= n) {
			
			int col = 1;
			
			while(col <= n) {
				
				if(row == 1 || row == n || col == 1 || col == n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				col++;
			}
			
			//prep
			row++;
			System.out.println();
		}

	}

}

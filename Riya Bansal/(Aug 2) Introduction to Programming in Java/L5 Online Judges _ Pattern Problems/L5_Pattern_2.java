package Introduction_to_Programming_In_Java_2;

public class L5_Pattern_2 {

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
			System.out.println();
			row++;
		}

	}

}

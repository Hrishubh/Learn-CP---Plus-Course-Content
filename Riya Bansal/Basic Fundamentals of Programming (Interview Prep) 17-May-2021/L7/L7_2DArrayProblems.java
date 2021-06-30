package Basic_Fundamentals_of_Programming;

public class L7_2DArrayProblems {

	public static void main(String[] args) {

		int[][] arr = { 
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 } };

		//display(arr);
		//verticalDisplay(arr);
		//waveDisplay(arr);
		//sprialDisplay(arr);
		
		int[][] one = {
				{1, 2, 3}, 
				{4, 5, 6}
				};
		
		int[][] two = {
				{7, 8, 9, 10}, 
				{11, 12, 13, 14}, 
				{15, 16, 17, 18}
				};
		
		//display(matrixMultiplication(one, two));
		rotateMatrix(arr);
	}

	private static void display(int[][] arr) {

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {

				System.out.print(arr[row][col] + " ");
			}

			System.out.println();
		}

	}

	public static void verticalDisplay(int[][] arr) {

		for (int col = 0; col < arr[0].length; col++) {

			for (int row = 0; row < arr.length; row++) {
				System.out.print(arr[row][col] + " ");
			}
		}
	}

	public static void waveDisplay(int[][] arr) {

		for (int col = 0; col < arr[0].length; col++) {

			if (col % 2 == 0) {
				// down

				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
			} else {
				//up
				for(int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + " ");
				}
			}
		}
	}
	
	public static void sprialDisplay(int[][] arr) {
		
		int rowMin = 0;
		int rowMax = arr.length - 1;
		int colMin = 0;
		int colMax = arr[0].length - 1;
		
		int nel = arr.length * arr[0].length;
		
		
		int counter = 0;
		
		while(counter < nel) {
			
			//first col
			for(int row = rowMin; counter < nel && row <= rowMax; row++) {
				System.out.print(arr[row][colMin] + " ");
				counter++;
			}
			colMin++;
			
			//last row
			for(int col = colMin; counter < nel && col <= colMax; col++) {
				System.out.print(arr[rowMax][col] + " ");
				counter++;
			}
			rowMax--;
			
			//last col
			for(int row = rowMax; counter < nel &&  row >= rowMin; row--) {
				System.out.print(arr[row][colMax] + " ");
				counter++;
			}
		
			colMax--;
			
			//first row
			for(int col = colMax; counter < nel && col >= colMin; col--) {
				System.out.print(arr[rowMin][col] + " ");
				counter++;
			}
			rowMin++;
			
		}
		
	}
	
	public static int[][] matrixMultiplication(int[][] one, int[][] two){
		
		
		int r1 = one.length;
		int r2 = two.length;
		int c1 = one[0].length;
		int c2 = two[0].length;
		int cd = c1;
		
		if(c1 != r2) {
			return null;
			
		}
		
		int[][] ans = new int[r1][c2];
		
		for(int row = 0; row < ans.length; row++) {
			
			for(int col = 0; col < ans[0].length; col++) {
				int sum = 0;
				
				for(int k = 0; k < cd; k++) {
					sum += one[row][k] * two[k][col];
				}
				
				ans[row][col] = sum;
			}
		}
		return ans;
	}
	
	public static void rotateMatrix(int[][] mat) {
		
		for(int x = 0; x < mat.length / 2; x++) {
			
			for(int y = x; y < mat.length - x - 1; y++) {
			
				int temp = mat[x][y];
				
				mat[x][y] = mat[y][mat.length - 1 - x];
				mat[y][mat.length - 1 - x] = mat[mat.length - 1 -x][mat.length - 1 - y];
				mat[mat.length - 1 -x][mat.length - 1 - y] = mat[mat.length - 1  - y][x];
				mat[mat.length - 1  - y][x] = temp;
			}
		}
		
		display(mat);
	}

}

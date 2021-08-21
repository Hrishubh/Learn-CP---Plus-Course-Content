package Introduction_to_Programming_In_Java;

public class L8_Spiral_Display {

	public static void main(String[] args) {

		int[][] arr = {
				{ 10, 20, 30, 40 },
				{ 50, 60, 70, 80 }, 
				{ 90, 100, 110, 120 } };

		int rowMin = 0;
		int rowMax = arr.length - 1;
		int colMin = 0;
		int colMax = arr[0].length - 1;

		int counter = 0;

		int nel = arr.length * arr[0].length;

		while (counter < nel) {

			for (int row = rowMin; counter < nel && row <= rowMax; row++) {
				System.out.print(arr[row][colMin] + " ");
				counter++;
			}

			colMin++;

			for (int col = colMin; counter < nel && col <= colMax; col++) {
				System.out.print(arr[rowMax][col] + " ");
				counter++;
			}
			rowMax--;

			for (int row = rowMax; counter < nel && row >= rowMin; row--) {
				System.out.print(arr[row][colMax] + " ");
				counter++;
			}
			colMax--;

			for (int col = colMax; counter < nel && col >= colMin; col--) {
				System.out.print(arr[rowMin][col] + " ");
				counter++;
			}
			rowMin++;
		}

	}

}

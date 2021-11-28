package Graph_Algorithms_3;

public class L4_Count_Islansds {

	public static void main(String[] args) {

		int[][] mat = new int[][] { 
			{ 1, 1, 0, 0, 0 }, 
			{ 0, 1, 0, 0, 1 }, 
			{ 1, 1, 0, 1, 1 }, 
			{ 0, 0, 0, 0, 0 },
			{ 1, 0, 1, 0, 1 } };

		System.out.println(countIslands(mat, mat.length, mat[0].length));

	}

	private static int countIslands(int[][] mat, int row, int col) {

		boolean[][] visited = new boolean[row][col];

		int count = 0;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				if (mat[i][j] == 1 && !visited[i][j]) {
					DFS(mat, i, j, visited);
					count++;

				}
			}
		}

		return count;

	}

	private static void DFS(int[][] m, int row, int col, boolean[][] visited) {

		int[] rowNbr = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] colNbr = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };
		
		visited[row][col] = true;
		
		for(int k = 0; k < 8; k++) {
			
			if(isSafe(m, row + rowNbr[k], col + colNbr[k] ,visited)) {
				DFS(m, row + rowNbr[k], col + colNbr[k] ,visited );
			}
		}
		

	}

	private static boolean isSafe(int[][] m, int row, int col, boolean[][] visited) {
		
		return (row >= 0) && (row < m.length) && (col >= 0) && (col < m[0].length) 
				&& m[row][col] == 1 && !visited[row][col];
		
	}

}

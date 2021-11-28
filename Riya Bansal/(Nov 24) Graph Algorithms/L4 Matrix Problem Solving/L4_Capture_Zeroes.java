package Graph_Algorithms_3;

public class L4_Capture_Zeroes {

	public static void main(String[] args) {

		char[][] mat = { { 'X', 'O', 'X', 'O', 'X', 'X' }, { 'X', 'O', 'X', 'X', 'O', 'X' },
				{ 'X', 'X', 'X', 'O', 'X', 'X' }, { 'O', 'X', 'X', 'X', 'X', 'X' }, { 'X', 'X', 'X', 'O', 'X', 'O' },
				{ 'O', 'O', 'X', 'O', 'O', 'O' } };

		capture(mat, mat.length, mat[0].length);

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}

			System.out.println();
		}
	}

	private static void capture(char[][] mat, int row, int col) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {

				if (mat[i][j] == 'O') {
					mat[i][j] = '-';
				}
			}
		}

		// left
		for (int i = 0; i < row; i++) {
			if (mat[i][0] == '-') {
				DFS(mat, i, 0, '-', '0');
			}
		}

		// right
		for (int i = 0; i < row; i++) {
			if (mat[i][mat[0].length - 1] == '-') {
				DFS(mat, i, mat[0].length - 1, '-', '0');
			}
		}

		// top
		for (int i = 0; i < mat[0].length; i++) {
			if (mat[0][i] == '-') {
				DFS(mat, 0, i, '-', '0');
			}
		}

		// bottom
		for (int i = 0; i < mat[0].length; i++) {
			if (mat[mat.length - 1][i] == '-') {
				DFS(mat, mat.length - 1, i, '-', '0');
			}
		}

		// rest of the cells will be - replaced by X
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {

				if (mat[i][j] == '-') {
					mat[i][j] = 'X';
				}
			}
		}

	}

	private static void DFS(char[][] mat, int x, int y, char prev, char newV) {

		if (x < 0 || x >= mat.length || y < 0 || y >= mat[0].length)
			return;

		if (mat[x][y] != prev) {
			return;
		}

		mat[x][y] = newV;

		DFS(mat, x + 1, y, prev, newV);
		DFS(mat, x - 1, y, prev, newV);
		DFS(mat, x, y - 1, prev, newV);
		DFS(mat, x, y + 1, prev, newV);

	}

}

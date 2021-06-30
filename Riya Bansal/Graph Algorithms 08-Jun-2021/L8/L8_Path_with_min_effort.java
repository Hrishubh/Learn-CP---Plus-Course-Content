package Graph_Algorithms;

import java.util.Arrays;
import java.util.PriorityQueue;

public class L8_Path_with_min_effort {

	public static void main(String[] args) {

		System.out.println(minimumEffortPath(new int[][] { { 1, 2, 2 }, { 3, 8, 2 }, { 5, 3, 5 } }));
	}

	private static int minimumEffortPath(int[][] heights) {

		int row = heights.length;
		int col = heights[0].length;

		int dir[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		int[][] diffMatrix = new int[row][col];

		for (int[] eRow : diffMatrix) {
			Arrays.fill(eRow, Integer.MAX_VALUE);
		}

		diffMatrix[0][0] = 0;
		PriorityQueue<Cell> queue = new PriorityQueue<Cell>((a, b) -> (a.diff.compareTo(b.diff)));

		boolean[][] visited = new boolean[row][col];

		queue.add(new Cell(0, 0, diffMatrix[0][0]));

		while (!queue.isEmpty()) {

			Cell curr = queue.poll();

			visited[curr.x][curr.y] = true;
			if (curr.x == row - 1 && curr.y == col - 1) {
				return curr.diff;
			}

			for (int[] d : dir) {
				int adjX = curr.x + d[0];
				int adjY = curr.y + d[1];

				if (isValid(adjX, adjY, row, col) && !visited[adjX][adjY]) {
					int curDiff = Math.abs(heights[adjX][adjY] - heights[curr.x][curr.y]);

					int maxDiff = Math.max(curDiff, diffMatrix[curr.x][curr.y]);

					if (diffMatrix[adjX][adjY] > maxDiff) {
						diffMatrix[adjX][adjY] = maxDiff;
						queue.add(new Cell(adjX, adjY, maxDiff));
					}
				}
			}
		}

		return diffMatrix[row - 1][col - 1];

	}

	public static boolean isValid(int x, int y, int row, int col) {
		return x >= 0 && x <= row - 1 && y >= 0 && y <= col - 1;
	}

	public static class Cell {
		int x;
		int y;
		Integer diff;

		Cell(int x, int y, Integer diff) {
			this.x = x;
			this.y = y;
			this.diff = diff;
		}
	}

}

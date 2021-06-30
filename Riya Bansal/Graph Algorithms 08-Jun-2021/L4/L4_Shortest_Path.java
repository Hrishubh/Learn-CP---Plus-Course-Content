package Graph_Algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class L4_Shortest_Path {

	public static void main(String[] args) {

		int[][] mat = { { 0, 1, 0, 1 }, { 1, 0, 1, 1 }, { 0, 1, 1, 1 }, { 1, 1, 1, 0 } };

		Point src = new Point(0, 3);
		Point dest = new Point(3, 0);

		System.out.println(shortestPath(mat, src, dest));
	}

	private static int shortestPath(int[][] mat, Point src, Point dest) {

		if (mat[src.x][src.y] != 1 || mat[dest.x][dest.y] != 1) {
			return -1;
		}

		boolean[][] visited = new boolean[mat.length][mat[0].length];

		visited[src.x][src.y] = true;

		Queue<Node> q = new LinkedList<>();

		Node node = new Node(src, 0);

		q.add(node);

		int[] r = { -1, 0, 0, 1 };
		int[] c = { 0, -1, 1, 0 };

		while (!q.isEmpty()) {
			Node curr = q.peek();
			Point pt = curr.pt;

			if (pt.x == dest.x && pt.y == dest.y) {
				return curr.dist;
			}

			q.remove();

			for (int i = 0; i < 4; i++) {

				int row = pt.x + r[i];
				int col = pt.y + c[i];

				if (isValid(mat, row, col) && mat[row][col] == 1 && !visited[row][col]) {

					visited[row][col] = true;

					Node adj = new Node(new Point(row, col), curr.dist + 1);
					q.add(adj);
				}
			}

		}

		return -1;
	}

	private static boolean isValid(int[][] mat, int row, int col) {
		return (row >= 0) && (row < mat.length) && (col >= 0) && (col < mat[0].length);
	}

	static class Node {

		Point pt;
		int dist;

		public Node(Point pt, int dist) {
			this.pt = pt;
			this.dist = dist;
		}
	}

	static class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}

package Graph_Algorithms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class L4_Nearest_One {

	public static void main(String[] args) {

		int[][] mat = { 
				{ 1, 1, 1, 0 }, 
				{ 1, 1, 0, 0 }, 
				{ 1, 0, 0, 1 }, };
		
		findNearestZero(mat);

	}

	static class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	private static void findNearestZero(int[][] mat) {
		
		int[][] dist = new int[mat.length][mat[0].length];
		
		for(int i = 0; i < dist.length; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		
		}
		
		Queue<Point> q = new LinkedList<>();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[0].length; j++) {
				if(mat[i][j] == 0) {
					dist[i][j] = 0;
					q.add(new Point(i, j));
				}
			}
		}
		
		int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		
		while(!q.isEmpty()) {
		
			Point curr = q.peek();
			q.remove();
			
			for(int i = 0; i < 4; i++) {
				int newR = curr.x + dir[i][0];
				int newC = curr.y + dir[i][1];
				
				if(newR >= 0 && newC >= 0 && newR < mat.length && newC < mat[0].length) {
					
					if(dist[newR][newC] > dist[curr.x][curr.y] + 1) {
						dist[newR][newC] =  dist[curr.x][curr.y] + 1;
						q.add(new Point(newR, newC));
					}
				}
			}
		}
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[0].length; j++) {
				System.out.print(dist[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}

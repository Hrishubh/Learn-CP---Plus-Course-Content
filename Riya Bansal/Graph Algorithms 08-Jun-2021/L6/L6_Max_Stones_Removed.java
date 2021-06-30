package Graph_Algorithms;

import java.util.HashSet;
import java.util.Set;

public class L6_Max_Stones_Removed {

	public static void main(String[] args) {

		System.out.println(removeStones(
				new int[][] { { 0, 0 }, { 0, 2 }, { 1, 1 }, { 2, 0 }, { 2, 2 } }));
	}

	public static int removeStones(int[][] stones) {

		Set<int[]> visited = new HashSet<>();

		int cc = 0;

		for (int[] s1 : stones) {
			if (!visited.contains(s1)) {
				dfs(s1, visited, stones);
				cc++;
			}
		}

		return stones.length - cc;
	}

	private static void dfs(int[] s1, Set<int[]> visited, int[][] stones) {

		visited.add(s1);
		for (int[] s2 : stones) {
			if (!visited.contains(s2)) {
				if (s1[0] == s2[0] || s1[1] == s2[1]) {
					dfs(s2, visited, stones);
				}
			}
		}

	}

}

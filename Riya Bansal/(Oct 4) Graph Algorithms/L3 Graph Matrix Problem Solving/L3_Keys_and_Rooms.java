package Graph_Algorithms_2;

import java.util.*;

public class L3_Keys_and_Rooms {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 3));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(3, 0, 1));
		List<Integer> l3 = new ArrayList<Integer>(Arrays.asList(2));
		List<Integer> l4 = new ArrayList<Integer>(Arrays.asList(0));

		List<List<Integer>> l = new ArrayList<>(Arrays.asList(l1, l2, l3, l4));
		System.out.println(visitRoomsWithKeys(l));

	}

	private static boolean visitRoomsWithKeys(List<List<Integer>> rooms) {

		boolean[] seen = new boolean[rooms.size()];

		seen[0] = true;
		Stack<Integer> s = new Stack<>();

		s.push(0);

		while (!s.isEmpty()) {

			int node = s.pop();
			List<Integer> nbrs = rooms.get(node);
			for (int nbr : nbrs) {
				if (!seen[nbr]) {
					seen[nbr] = true;
					s.push(nbr);
				}
			}
		}

		for (boolean v : seen) {
			if (!v)
				return false;
		}

		return true;
	}

}

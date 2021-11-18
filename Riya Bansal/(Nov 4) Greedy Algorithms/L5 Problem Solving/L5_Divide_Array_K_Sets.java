package Greedy_Algorithms_Course_2;

import java.util.*;

public class L5_Divide_Array_K_Sets {

	public static void main(String[] args) {

		System.out.println(isPossibleDivide(new int[] {1, 2, 3, 3, 4, 4, 5, 6}, 4));
	}

	public static boolean isPossibleDivide(int[] A, int k) {

		Map<Integer, Integer> c = new TreeMap<>();

		for (int i : A)
			c.put(i, c.getOrDefault(i, 0) + 1);

		for (int it : c.keySet()) {

			if (c.get(it) > 0) {

				for (int i = k - 1; i >= 0; i--) {
					if (c.getOrDefault(it + i, 0) < c.get(it))
						return false;

					c.put(it + i, c.get(it + i) - c.get(it));
				}
			}
		}

		return true;

	}

}

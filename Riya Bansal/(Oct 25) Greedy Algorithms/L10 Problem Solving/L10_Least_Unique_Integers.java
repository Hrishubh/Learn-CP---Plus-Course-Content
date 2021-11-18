package Greedy_Algorithms_Course_1;

import java.util.*;

public class L10_Least_Unique_Integers {

	public static void main(String[] args) {

		System.out.println(findLeastNumOfUniqueInts(new int[] {4,3,1,1,3,3,2}, 3));
	}

	public static int findLeastNumOfUniqueInts(int[] arr, int k) {
		Map<Integer, Integer> count = new HashMap<>();

		for (int a : arr) {
			count.put(a, 1 + count.getOrDefault(a, 0) + 1);
		}

		int rem = count.size();

		int occur = 1;
		int[] occCount = new int[arr.length + 1];

		for (int v : count.values()) {
			++occCount[v];
		}

		while (k > 0) {

			if (k - occur * occCount[occur] >= 0) {
				k -= occur * occCount[occur];
				rem -= occCount[occur++];
			} else {
				return rem - k / occur;
			}
		}

		return rem;

	}

}

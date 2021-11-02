package Greedy_Algorithms_Course_1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class L4_Advantage_Shuffle {

	public static void main(String[] args) {
		int[] res = advantageCount(new int[] { 2,7,11,15}, new int[] { 1,10,4,11});
		
		for(int val : res) {
			System.out.println(val);
		}
	}

	public static int[] advantageCount(int[] A, int[] B) {

		Arrays.sort(A);

		int n = A.length;

		int[] res = new int[n];

		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

		for (int i = 0; i < n; i++) {
			pq.add(new int[] { B[i], i });
		}
		int lo = 0;
		int hi = n - 1;

		while (!pq.isEmpty()) {

			int[] curr = pq.poll();
			int idx = curr[1];
			int val = curr[0];

			if (A[hi] > val)
				res[idx] = A[hi--];
			else
				res[idx] = A[lo++];
		}
		
		return res;

	}

}

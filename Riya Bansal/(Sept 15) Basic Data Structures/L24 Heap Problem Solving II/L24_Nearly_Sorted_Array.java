package Basic_Data_Structures_Course;

import java.util.Iterator;
import java.util.PriorityQueue;

public class L24_Nearly_Sorted_Array {

	public static void main(String[] args) {

		int[] arr = { 6, 5, 3, 2, 8, 10, 9 };

		int[] res = sort(arr, 3);

		for (int val : res) {
			System.out.print(val + " ");
		}
	}

	private static int[] sort(int[] arr, int k) {

		PriorityQueue<Integer> heap = new PriorityQueue<>();

		for (int i = 0; i < k + 1; i++) {
			heap.add(arr[i]);
		}
		int idx = 0;

		for (int i = k + 1; i < arr.length; i++) {
			arr[idx++] = heap.poll();
			heap.add(arr[i]);
		}

		Iterator<Integer> itr = heap.iterator();

		while (itr.hasNext()) {
			arr[idx++] = heap.poll();
		}

		return arr;

	}

}

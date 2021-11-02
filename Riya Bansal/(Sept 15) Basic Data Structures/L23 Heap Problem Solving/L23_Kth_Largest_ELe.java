package Basic_Data_Structures_Course;

import java.util.PriorityQueue;

public class L23_Kth_Largest_ELe {

	public static void main(String[] args) {

		System.out.println(findKthLargestEle(new int[] {3, 2, 1, 5, 6, 4}, 3));
	}

	public static int findKthLargestEle(int[] arr, int k) {

		PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> (n1 - n2));

		for (int n : arr) {

			heap.add(n);
			if (heap.size() > k) {
				heap.poll();
			}

		}
		
		return heap.poll();
	}

}

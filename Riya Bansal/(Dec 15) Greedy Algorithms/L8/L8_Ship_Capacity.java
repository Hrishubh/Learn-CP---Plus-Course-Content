package Greedy_Algorithms_Course_3;

public class L8_Ship_Capacity {

	public static void main(String[] args) {

		System.out.println(shipWithinDays(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 5));

	}

	public static int shipWithinDays(int[] weights, int days) {

		int left = 0;
		int right = 0;

		for (int w : weights) {
			right += w;
		}

		while (left < right) {

			int mid = (left + right) / 2; // represents ship capacity
			int need = 1;

			int cur = 0;

			for (int w : weights) {
				if (cur + w > mid) {
					need += 1;
					cur = 0;
				}

				cur += w;
			}

			if (need > days) {
				left = mid + 1;
			} else {
				right = mid;
			}

		}

		return left;
	}

}

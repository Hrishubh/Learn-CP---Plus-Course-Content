package Basic_Data_Structures_Course;

public class L3_Odd_Subarray_Sum {

	public static void main(String[] args) {

		System.out.println(numOfSubarrays(new int[] { 2, 3, 4, 5, 1, 4 }));

	}

	private static int numOfSubarrays(int[] arr) {

		long ans = 0;

		int even = 0;
		int odd = 0;
		int sum = 0;

		for (int val : arr) {

			sum += val;

			if (sum % 2 == 0) {
				ans += odd;
				even++;
			} else {
				odd++;
				ans += even + 1;
			}
		}

		return (int) (ans % (100000007));
	}

}

package Basic_Fundamentals_of_Programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class L6_Array_Problem_Solving {

	public static void main(String[] args) {

		int[] one = { 9, 9, 9 };
		int[] two = { 9, 9, 9, 9 };

		ArrayList<Integer> ans = sumofTwoArrays(one, two);

		// System.out.println(ans);

		// int[] res = kRotate(new int[] { 3, 2, 5, 1, 4 }, 4);
		// int[] res = inverse(new int[] { 3, 2, 0, 1, 4 });
//		for (int val : res) {
//			System.out.print(val + " ");
//		}

		// System.out.println(SubArraywithZeroSum(new int[] { 1, 4, -2, -2, 5, -4, 3
		// }));

		int[] res = productExceptSelf(new int[] { 4, 5, 0, 8, 2 });

		for (int val : res) {
			System.out.print(val + " ");
		}

	}

	// TC - O(m + n)
	// SC - O(Max(m,n) + 1)
	private static ArrayList<Integer> sumofTwoArrays(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<>();

		int i = one.length - 1;
		int j = two.length - 1;

		int carry = 0;
		while (i >= 0 || j >= 0) {

			int sum = carry;

			if (i >= 0) {
				sum += one[i];
			}

			if (j >= 0) {
				sum += two[j];
			}
			int rem = sum % 10;
			carry = sum / 10;

			ans.add(0, rem);

			i--;
			j--;
		}

		if (carry != 0) {
			ans.add(0, carry);
		}

		return ans;
	}

	public static int[] kRotate(int[] arr, int k) {

		k = k % arr.length;

		if (k < 0) {
			k = k + arr.length;

		}

		int[] na = new int[arr.length];

		for (int i = 0; i < na.length; i++) {

			if (i < k) {
				na[i] = arr[i + arr.length - k];
			} else {
				na[i] = arr[i - k];
			}
		}

		return na;
	}

	public static int[] inverse(int[] arr) {

		int[] na = new int[arr.length];

		for (int i = 0; i < na.length; i++) {
			na[arr[i]] = i;
		}

		return na;
	}

	public static boolean SubArraywithZeroSum(int[] arr) {

		Set<Integer> hs = new HashSet<>();

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

			if (arr[i] == 0 || sum == 0 || hs.contains(sum)) {
				return true;
			}

			hs.add(sum);
		}

		return false;

	}

	public static int[] productExceptSelf(int[] nums) {

		int[] l = new int[nums.length];
		int[] r = new int[nums.length];

		int[] ans = new int[nums.length];

		l[0] = 1;
		for (int i = 1; i < nums.length; i++) {

			l[i] = nums[i - 1] * l[i - 1];
		}

		r[nums.length - 1] = 1;

		for (int i = nums.length - 2; i >= 0; i--) {

			r[i] = nums[i + 1] * r[i + 1];
		}

		for (int i = 0; i < nums.length; i++) {

			ans[i] = l[i] * r[i];
		}

		return ans;

	}
}

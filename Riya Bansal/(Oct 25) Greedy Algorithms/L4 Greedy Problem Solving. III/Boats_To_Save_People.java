package Greedy_Algorithms_Course_1;

import java.util.Arrays;

public class Boats_To_Save_People {

	public static void main(String[] args) {

		System.out.println(numRescueBoats(new int[] { 3, 2, 2, 1 }, 3));
	}

	public static int numRescueBoats(int[] people, int limit) {

		Arrays.sort(people);

		int i = 0;
		int j = people.length - 1;

		int ans = 0;

		while (i <= j) {
			ans++;
			if (people[i] + people[j] <= limit) {
				i++;
			}

			j--;

		}

		return ans;
	}

}

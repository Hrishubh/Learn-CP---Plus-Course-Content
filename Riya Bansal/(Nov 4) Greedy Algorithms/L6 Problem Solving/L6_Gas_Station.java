package Greedy_Algorithms_Course_2;

public class L6_Gas_Station {

	public static void main(String[] args) {

		System.out.println(canCompleteCircuit(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4, 5, 1, 2 }));

	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {

		int n = gas.length;
		int total_tank = 0;
		int curr_tank = 0;
		int starting_station = 0;

		for (int i = 0; i < n; i++) {

			total_tank += gas[i] - cost[i];

			curr_tank += gas[i] - cost[i];

			if (curr_tank < 0) {
				starting_station = i + 1;
				curr_tank = 0;
			}
		}

		return total_tank >= 0 ? starting_station : -1;

	}
}

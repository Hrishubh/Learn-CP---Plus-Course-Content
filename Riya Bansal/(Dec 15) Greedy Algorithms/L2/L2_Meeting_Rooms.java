package Greedy_Algorithms_Course_3;

import java.util.Arrays;

public class L2_Meeting_Rooms {

	public static void main(String[] args) {

		System.out.println(MinMeetingRooms(new int[][] { { 0, 30, }, { 5, 10 }, { 15, 20 } }));

	}

	private static int MinMeetingRooms(int[][] intervals) {

		if (intervals.length == 0) {
			return 0;
		}

		Integer[] start = new Integer[intervals.length];
		Integer[] end = new Integer[intervals.length];

		for (int i = 0; i < intervals.length; i++) {
			start[i] = intervals[i][0];
			end[i] = intervals[i][1];
		}

		Arrays.sort(start);
		Arrays.sort(end);

		int s = 0;
		int e = 0;

		int usedRooms = 0;

		while (s < intervals.length) {
			if (start[s] >= end[e]) {
				usedRooms -= 1;
				e += 1;
			}

			usedRooms += 1;
			s += 1;
		}

		return usedRooms;

	}

}

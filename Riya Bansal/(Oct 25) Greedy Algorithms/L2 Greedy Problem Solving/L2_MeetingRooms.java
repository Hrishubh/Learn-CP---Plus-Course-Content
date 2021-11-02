package Greedy_Algorithms_Course_2;

import java.util.Arrays;

public class L2_MeetingRooms {

	public static void main(String[] args) {
		
		System.out.println(MinMeetingRooms(new int[][] {{0, 30}, {5, 10}, {15, 20}}));

	}
	
	public static int MinMeetingRooms(int[][] intervals) {
		
		if(intervals.length == 0) {
			return 0;
		}
		
		Integer[] start = new Integer[intervals.length];
		Integer[] end = new Integer[intervals.length];
		
		for(int i = 0; i < intervals.length; i++) {
			start[i] = intervals[i][0];
			end[i] = intervals[i][1];
		}
		
		Arrays.sort(end);
		Arrays.sort(start);
		
		int startPointer = 0;
		int endPointer = 0;
		
		int usedRooms = 0;
		
		while(startPointer < intervals.length) {
			if(start[startPointer] >= end[endPointer]) {
				usedRooms -= 1;
				endPointer += 1;
			}
			
			usedRooms += 1;
			startPointer += 1;
		}
		
		
		return usedRooms;
	}

}

package Greedy_Algorithms_Course_2;

import java.util.Arrays;

public class L1_Task_Scheduler {

	public static void main(String[] args) {

		System.out.println(TaskScheduler(new char[] { 'A', 'A', 'B', 'B', 'A', 'C', 'A', 'A', }, 2));
	}

	public static int TaskScheduler(char[] tasks, int n) {

		int[] freq = new int[26];

		for (int t : tasks) {
			freq[t - 'A']++;
		}

		Arrays.sort(freq);

		int f_max = freq[25];

		int idle_time = (f_max - 1) * n;

		for (int i = freq.length - 2; i >= 0 && idle_time > 0; i--) {

			idle_time -= Math.min(f_max - 1, freq[i]);
		}

		idle_time = Math.max(0, idle_time);
		return idle_time + tasks.length;
	}

}
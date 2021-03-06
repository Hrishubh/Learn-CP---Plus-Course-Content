package Greedy_Algorithms_Course_1;

import java.util.*;

public class L11_Paritition_Labels {

	public static void main(String[] args) {

		System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
	}

	public static List<Integer> partitionLabels(String S) {

		int[] last = new int[26];
		for (int i = 0; i < S.length(); i++) {
			last[S.charAt(i) - 'a'] = i;
		}

		int j = 0;
		int anchor = 0;
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < S.length(); i++) {
			j = Math.max(j, last[S.charAt(i) - 'a']);
			if (i == j) {
				ans.add(i - anchor + 1);
				anchor = i + 1;
			}
		}

		return ans;

	}

}

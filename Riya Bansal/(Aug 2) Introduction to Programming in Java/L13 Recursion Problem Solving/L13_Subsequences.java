package Introduction_to_Programming_In_Java_2;

import java.util.ArrayList;

public class L13_Subsequences {

	public static void main(String[] args) {

		System.out.println(getSS("abc"));

	}

	private static ArrayList<String> getSS(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = str.charAt(0); // a
		String ros = str.substring(1); // bc

		// smaller problem
		ArrayList<String> res = getSS(ros);

		ArrayList<String> mr = new ArrayList<>();

		for (String val : res) {

			mr.add(val);
			mr.add(ch + val);
		}

		return mr;

	}

}

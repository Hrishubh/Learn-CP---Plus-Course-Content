package Introduction_to_Programming_In_Java_2;

import java.util.ArrayList;

public class L13_Permutations {

	public static void main(String[] args) {

		System.out.println(getPermutations("abc"));

	}

	private static ArrayList<String> getPermutations(String str) {

		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);

		String ros = str.substring(1);

		ArrayList<String> rr = getPermutations(ros);

		ArrayList<String> mr = new ArrayList<>();

		for (String val : rr) {

			for (int i = 0; i <= val.length(); i++) {
				String res = val.substring(0, i) + ch + val.substring(i);
				mr.add(res);
			}
		}

		return mr;

	}

}

package Introduction_to_Programming_In_Java;

import java.util.ArrayList;

public class L16_MazePath {

	public static void main(String[] args) {

		System.out.println(MazePath(0, 0, 2, 2));

	}

	private static ArrayList<String> MazePath(int cr, int cc, int er, int ec) {

		// positive base case
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		// negative base case
		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		ArrayList<String> rrh = MazePath(cr, cc + 1, er, ec);

		for (String val : rrh) {
			mr.add("H" + val);
		}

		ArrayList<String> rrv = MazePath(cr + 1, cc , er, ec);

		for (String val : rrv) {
			mr.add("V" + val);
		}
		
		return mr;

	}

}

package Introduction_to_Programming_In_Java;

import java.util.ArrayList;

public class L16_Board_Path {

	public static void main(String[] args) {

		System.out.println(BoardPath(0, 4));

	}

	private static ArrayList<String> BoardPath(int curr, int end) {

		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}

		if (curr > end) {
			ArrayList<String> br = new ArrayList<>();

			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {

			ArrayList<String> rr = BoardPath(curr + dice, end);

			for (String val : rr) {
				mr.add(dice + val);
			}
		}
		
		return mr;

	}

}

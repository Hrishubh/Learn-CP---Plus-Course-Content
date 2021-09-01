package Introduction_to_Programming_In_Java_2;

import java.util.ArrayList;

public class L17_Coin_Toss {

	public static void main(String[] args) {

		System.out.println(coinToss(3));

	}

	private static ArrayList<String> coinToss(int n) {

		if (n == 0) {
			ArrayList<String> br = new ArrayList<>();

			br.add("");
			return br;
		}

		ArrayList<String> rr = coinToss(n - 1);

		ArrayList<String> mr = new ArrayList<>();

		for (String val : rr) {

			mr.add("H" + val);
			mr.add("T" + val);
		}

		return mr;

	}

}

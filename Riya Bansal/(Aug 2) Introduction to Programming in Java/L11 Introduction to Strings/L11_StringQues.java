package Introduction_to_Programming_In_Java_2;

public class L11_StringQues {

	public static void main(String[] args) {

		findSubstring("ball");

	}

	private static void findSubstring(String str) {

		for (int si = 0; si <= str.length() - 1; si++) {

			for (int ei = si + 1; ei <= str.length(); ei++) {
				String ans = str.substring(si, ei);
				System.out.println(ans);
			}
		}

	}

}

package Dynamic_Programming_Course;

public class L5_BoardPath {

	public static void main(String[] args) {

		System.out.println(BoardPath(0, 2));
		System.out.println(boardPathBU(10));
	}

	public static int BoardPath(int curr, int end) {

		if (curr == end) {
			return 1;

		}

		if (curr > end) {
			return 0;
		}

		int cnt = 0;

		for (int dice = 1; dice <= 6; dice++) {
			cnt += BoardPath(curr + dice, end);
		}

		return cnt;
	}

	public static int boardPathBU(int end) {

		int[] strg = new int[end + 6];

		strg[end] = 1;

		for (int curr = end - 1; curr >= 0; curr--) {

			int sum = 0;
			for (int dice = 1; dice <= 6; dice++) {
				sum += strg[curr + dice];
			}

			strg[curr] = sum;
		}
		
		
		for(int  i =0 ; i < strg.length; i++) {
			System.out.print(strg[i] + " ");
		}
		System.out.println();
		
		return strg[0];
	}

}

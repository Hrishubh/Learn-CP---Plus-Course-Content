package Dynamic_Programming_Course;

public class L4_Arrange_Buildings {

	public static void main(String[] args) {

		int n = 3;
		System.out.println(solve(n));
	}

	private static int solve(int n) {

		int ob = 1;
		int os = 1;

		for (int i = 2; i <= n; i++) {
			int nb = os;
			int ns = os + ob;

			os = ns;
			ob = nb;
		}

		int total = os + ob;

		total = total * total;

		return total;
	}

}

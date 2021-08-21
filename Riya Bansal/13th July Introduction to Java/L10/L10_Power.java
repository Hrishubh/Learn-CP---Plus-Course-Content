package Introduction_to_Programming_In_Java;

public class L10_Power {

	public static void main(String[] args) {

		System.out.println(Power(2, 4));

	}

	private static int Power(int x, int n) {

		if (n == 0)
			return 1;

		int sp = Power(x, n - 1);
		int sw = sp * x;

		return sw;

	}

}

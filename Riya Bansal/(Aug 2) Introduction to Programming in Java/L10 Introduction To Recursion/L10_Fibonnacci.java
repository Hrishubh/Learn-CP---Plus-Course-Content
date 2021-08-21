package Introduction_to_Programming_In_Java_2;

public class L10_Fibonnacci {

	public static void main(String[] args) {

		System.out.println(Fibonacci(4));

	}

	private static int Fibonacci(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int fnm1 = Fibonacci(n - 1);
		int fnm2 = Fibonacci(n - 2);

		int fn = fnm1 + fnm2;

		return fn;

	}

}

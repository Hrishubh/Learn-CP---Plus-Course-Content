package Introduction_to_Programming_In_Java;

public class L10_Fibonacci {

	public static void main(String[] args) {

		System.out.println(Fibonacci(4));
		//0 1 1 3 5

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

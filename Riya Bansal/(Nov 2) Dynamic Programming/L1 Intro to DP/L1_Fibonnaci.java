package Dynamic_Programming_Course;

public class L1_Fibonnaci {

	public static void main(String[] args) {

		int n = 7;
		int[] strg = new int[n + 1];
		System.out.println(fibo(n));
		System.out.println(fiboTD(n, strg));
		System.out.println(fiboBU(n));
		System.out.println(fiboBUSE(n));
	}

	public static int fibo(int n) {

		if (n == 1 || n == 0) {
			return n;
		}

		int f1 = fibo(n - 1);
		int f2 = fibo(n - 2);

		return f1 + f2;
	}

	public static int fiboTD(int n, int[] strg) {

		if (n == 1 || n == 0) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		int f1 = fiboTD(n - 1, strg);
		int f2 = fiboTD(n - 2, strg);

		strg[n] = f1 + f2;
		return strg[n];
	}

	public static int fiboBU(int n) {

		int[] strg = new int[n + 1];
		strg[0] = 0;
		strg[1] = 1;

		for (int i = 2; i <= n; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}

		return strg[n];
	}

	public static int fiboBUSE(int n) {

		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;

		for (int i = 1; i < n; i++) {
			
			int sum = strg[0] + strg[1];
			
			strg[0] = strg[1];
			strg[1] = sum;
			
		}

		return strg[1];
	}

}

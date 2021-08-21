package Introduction_to_Programming_In_Java;

public class L9_ArmstrongNumber {

	public static void main(String[] args) {

		int lo = 1;
		int hi = 1000;

		printAmstrong(lo, hi);

	}

	private static void printAmstrong(int lo, int hi) {

		for (int i = lo; i <= hi; i++) {

			boolean res = isAmstrong(i);

			if (res) {
				System.out.println(i);
			}
		}
	}

	private static boolean isAmstrong(int n) {

		int nod = numberOfDigits(n);

		int sum = 0;
		int on = n;

		while (n > 0) {

			int rem = n % 10;
			sum += Math.pow(rem, nod);
			n = n / 10;
		}
		if (sum == on) {
			return true;
		} else {
			return false;
		}
	}

	private static int numberOfDigits(int n) {

		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

}

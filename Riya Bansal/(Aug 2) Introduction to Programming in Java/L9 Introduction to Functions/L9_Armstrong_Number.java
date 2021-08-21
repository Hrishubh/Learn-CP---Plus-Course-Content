package Introduction_to_Programming_In_Java_2;

public class L9_Armstrong_Number {

	public static void main(String[] args) {

		int lo = 1;
		int hi = 1000;

		printAmrstrong(lo, hi);

	}

	private static void printAmrstrong(int lo, int hi) {

		for (int i = lo; i <= hi; i++) {

			isArmstrong(i);
			
		}

	}

	private static void isArmstrong(int n) {

		int nod = numberOfDigits(n);

		int sum = 0;
		int on = n;
		while (n > 0) {
			int rem = n % 10;

			sum += Math.pow(rem, nod);

			n = n / 10;
		}

		if (sum == on) {
			System.out.println(sum);
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

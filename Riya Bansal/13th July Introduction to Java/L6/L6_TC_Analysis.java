package Introduction_to_Programming_In_Java;

public class L6_TC_Analysis {

	public static void main(String[] args) {

		long num = 10000000002323L;

		boolean flag = true;

		for (int div = 2; div <= num / 2; div++) {
			// div -> 2, 3, 4
			long rem = num % div;

			if (rem == 0) {
				flag = false;
				break;
			}
		}

		if (flag == true) {
			System.out.println("PRIME");
		} else {
			System.out.println("NOT PRIME");

		}

	}

}

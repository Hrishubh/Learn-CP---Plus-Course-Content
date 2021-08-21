package Introduction_to_Programming_In_Java_2;

public class L10_PrintDecreasing {

	public static void main(String[] args) {

		PrintDecreasing(5);
	}

	private static void PrintDecreasing(int i) {

		if (i == 0) { // Base Case
			return;
		}

		System.out.println(i); // Self Work
		PrintDecreasing(i - 1); // Recursive Call

	}
}

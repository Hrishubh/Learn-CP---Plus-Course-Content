package Introduction_to_Programming_In_Java_2;

public class L2_Nested_If {

	public static void main(String[] args) {

		int age = 16;
		int weight = 62;

		if (age >= 18) {

			if (weight > 50) {
				System.out.println("You are eligible to vote.");
			} else {
				System.out.println("Not enough weight");
			}
		} else {
			System.out.println("You are not eligible to donate blood.");
		}

	}

}

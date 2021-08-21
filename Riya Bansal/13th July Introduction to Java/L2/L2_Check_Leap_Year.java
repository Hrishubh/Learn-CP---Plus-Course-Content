package Introduction_to_Programming_In_Java;

public class L2_Check_Leap_Year {

	public static void main(String[] args) {

		// A year is a leap year if any of the following conditions are true:
		// 1. If it is divisible by 4 and not 100.
		// 2. If it is divisible by 400.

		int year = 2020;

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {

			System.out.println("Leap Year");
		
		} else {
			System.out.println("Not a leap year");
		}

	}

}

package Introduction_to_Programming_In_Java_2;

public class L2_Check_Leap_Year {

	public static void main(String[] args) {
		
		//A year is a leap year if any of the following conditions are true:
		//1. If it is divisble by 4 AND not divisible by 100. 
		//2. If is it divisible by 400. 
		
		
		int year = 2015;
		
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not a leap year");
		}
		
		//Logical AND - && (Boolean Comparision)
		//Bitwise AND - & (Bitwise Comparision)
	}

}

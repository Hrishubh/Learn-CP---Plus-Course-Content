package Introduction_to_Programming_In_Java_2;

public class L10_Factorial {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));

	}

	private static int factorial(int i) {
		
		if(i  == 1) {
			return 1;
		}
		
		int res = factorial(i - 1);
		
		res = res * i;
		
		return res;
		
	}

}

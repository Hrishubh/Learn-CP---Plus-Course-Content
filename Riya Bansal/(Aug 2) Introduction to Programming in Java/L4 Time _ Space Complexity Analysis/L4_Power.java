package Introduction_to_Programming_In_Java_2;

public class L4_Power {

	public static void main(String[] args) {
		
		int x = 2;
		int n = 4;
		
		System.out.println(power(x, n));

	}

	private static int power(int x, int n) {
		
		if(n == 0) {
			return 1;
		}
		
		int rr = power(x, n / 2);
		
		if(n % 2 == 0) {
			return rr * rr;
		}else {
			return rr * rr * x;
		}
	}

}

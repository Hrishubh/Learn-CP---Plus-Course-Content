package Introduction_to_Programming_In_Java;

public class L4_Reverse {

	public static void main(String[] args) {
		
		int n = 3124124;
		
		int rev = 0;
		
		while(n > 0) {
			
			int rem = n % 10;
			
			rev  = rev * 10 + rem;
			
			n = n / 10;
		}
		
		System.out.println(rev);

	}

}

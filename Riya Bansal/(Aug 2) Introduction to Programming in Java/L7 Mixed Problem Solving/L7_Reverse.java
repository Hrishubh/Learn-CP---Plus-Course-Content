package Introduction_to_Programming_In_Java_2;

public class L7_Reverse {

	public static void main(String[] args) {
		
		int n = 123456789;
		
		int rev = 0;
		
		while(n != 0) {
			
			int rem = n % 10; //O(1) //9 8 7 6 5 4 3 2 1
			 
			n = n / 10; //O(1)
			
			rev = rev * 10 + rem; //O(1)
		}
		
		System.out.println(rev);

	}

}

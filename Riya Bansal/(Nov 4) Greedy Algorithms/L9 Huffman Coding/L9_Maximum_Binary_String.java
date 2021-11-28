package Greedy_Algorithms_Course_2;

public class L9_Maximum_Binary_String {

	public static void main(String[] args) {
		

		System.out.println(maximumBinaryString("000110"));

	}
	
	 public static String maximumBinaryString(String s) {
		 
		 int ones = 0;
		 int zeroes = 0;
		 
		 int n = s.length();
		 StringBuilder res = new StringBuilder("1".repeat(n));
		 
		 for(int i = 0; i < n; i++) {
			 if(s.charAt(i) == '0') {
				 zeroes++;
			 }else if(zeroes == 0) {
				 ones++;
			 }
		 }
		 
		 if(ones < n) {
			 res.setCharAt(ones + zeroes  - 1, '0');
		 }
		 
		 return res.toString();
		 
	 }

}

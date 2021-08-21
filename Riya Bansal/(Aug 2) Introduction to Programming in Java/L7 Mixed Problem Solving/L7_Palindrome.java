package Introduction_to_Programming_In_Java_2;

public class L7_Palindrome {

	public static void main(String[] args) {
		
		String str = "riya";
		
		int left = 0;
		int right = str.length() - 1;
		
		
		while(left <= right) {
			
			
			if(str.charAt(left) != str.charAt(right)) {
				break;
			}
			
			left++;
			right--;
		}
		
		if(left > right) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		

	}

}

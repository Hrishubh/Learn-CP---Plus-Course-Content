package Introduction_to_Programming_In_Java;

public class L11_StringQues {

	public static void main(String[] args) {
		
		//findSubstrings("ball");
		System.out.println(palindrome("babbab"));
	}

	private static void findSubstrings(String str) {
		
		for(int si = 0; si <= str.length() - 1; si++) {
			
			for(int ei = si + 1; ei <= str.length() - 1; ei++) {
				String val = str.substring(si, ei);
				System.out.println(val);
			}
		}
	}
	
	public static boolean palindrome(String str) {
		
		int start = 0;
		
		int end = str.length() - 1;
		
		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			
			start++;
			end--;
		}
		
		return true;
	}

}

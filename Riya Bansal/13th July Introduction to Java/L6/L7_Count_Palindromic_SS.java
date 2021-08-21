package Introduction_to_Programming_In_Java;

public class L7_Count_Palindromic_SS {

	public static void main(String[] args) {
		
		System.out.println(countPalindromicSS("aaaa"));
	}

	private static int countPalindromicSS(String str) {
		
		int count = 0;
		
		//odd length palindromes
		//place the mirror over the characters
		
		for(int axis = 0; axis < str.length(); axis++) {
			
			for(int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length();
					orbit++) {
				
				if(str.charAt(axis - orbit) == str.charAt(axis  + orbit)) {
					count++;
				}else {
					break;
				}
			}
		}
		
		//even length palindromes
		//place mirror between characters
		
		
		for(double axis = 0.5; axis < str.length(); axis++) {
			
			for(double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				
				if(str.charAt((int) (axis - orbit)) == str.charAt((int)(axis + orbit))) {
					count++;
				}else {
					break;
				}
			}
		}
		
		return count;
		
	}

}

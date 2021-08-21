package Introduction_to_Programming_In_Java;

public class L12_TogglingCases {

	public static void main(String[] args) {
		
		System.out.println(toggleCase("abCDFadaaG"));

	}

	private static String toggleCase(String string) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < string.length(); i++) {
			
			char ch = string.charAt(i);
			char ans = ' ';
			
			if(ch >= 'a' && ch <= 'z') {
				
				ans = Character.toUpperCase(ch);
			}else if(ch >= 'A' && ch <= 'Z') {
				ans = Character.toLowerCase(ch);
			}
			
			sb.append(ans);
		}
		
		return sb.toString();
	}

}

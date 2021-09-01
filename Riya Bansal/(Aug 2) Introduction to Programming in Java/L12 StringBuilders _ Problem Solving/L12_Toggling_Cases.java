package Introduction_to_Programming_In_Java_2;

public class L12_Toggling_Cases {

	public static void main(String[] args) {
		
		System.out.println(togglingCases("abCDFadaaG"));

	}

	private static String togglingCases(String string) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < string.length(); i++) {
			
			char ch = string.charAt(i);
			char ans = ' ';
			
			if(ch >= 'a' && ch <= 'z') {
				
				ans = Character.toUpperCase(ch);
			}else if(ch >= 'A' && ch <= 'Z') {
				ans = Character.toLowerCase(ch);
			}
			//System.out.println(sb);
			sb.append(ans);
		}
		
		return sb.toString();
		
	}

}

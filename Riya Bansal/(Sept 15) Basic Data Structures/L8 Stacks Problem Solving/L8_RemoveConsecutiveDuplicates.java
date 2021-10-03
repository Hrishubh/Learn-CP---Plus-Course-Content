package Basic_Data_Structures_Course;

public class L8_RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		
		System.out.println(remove("kabbal"));

	}

	private static String remove(String string) {
	
		StringBuilder s = new StringBuilder();
		
		for(int i = 0; i < string.length(); i++) {
			
			if(s.length() != 0 && string.charAt(i) == s.charAt(s.length() - 1)) {
				s.deleteCharAt(s.length() - 1);
			}else {
				s.append(string.charAt(i));
			}
		}
		
		return s.toString();
			
	}

}

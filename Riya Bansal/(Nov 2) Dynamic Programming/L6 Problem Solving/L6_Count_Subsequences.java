package Dynamic_Programming_Course;

public class L6_Count_Subsequences {

	public static void main(String[] args) {
		
		String str = "abcabc";
		
		int a = 0;
		int ab = 0;
		int abc = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == 'a') {
				a = 2 * a + 1;
			}else if(ch == 'b') {
				ab = a * ab + a;
			}else if(ch == 'c') {
				abc = 2 * abc + ab;
			}
		}
		
		System.out.println(abc);

	}

}

package String_Algorithms_2;

public class L1_Naive_Pattern_Matching {

	public static void main(String[] args) {
		
		String text = "aabaabaadaabaaabaa";
		String pat = "aaba";
		
		search(text, pat);
		

	}

	private static void search(String text, String pat) {
		
		int m = text.length();
		int n =pat.length();
		
		int count = 0;
		
		for(int i = 0; i < m - n; i++) {
			
			int j;
			
			for(j = 0; j < n; j++) {
				
				if(text.charAt(i + j)!= pat.charAt(j)) {
					break;
				}
			}
			
			if(j == n) {
				System.out.println(i);
				count++;
			}
		}
		
		//return count;
	}

}

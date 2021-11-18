package Greedy_Algorithms_Course_2;

public class L3_String_Without_AAA_or_BBB {

	public static void main(String[] args) {
	
		System.out.println(strWithout3a3b(6, 2));

	}
	
	public static String strWithout3a3b(int a, int b) {
		
		StringBuilder sb = new StringBuilder(a + b);
		
		while(a + b > 0) {
			
			String s = sb.toString();
			
			if(s.endsWith("aa")) {
				sb.append("b");
				--b;
			}else if(s.endsWith("bb")) {
				sb.append("a");
				--a;
			}else if(a > b) {
				sb.append("a");
				--a;
			}else {
				sb.append("b");
				--b;
				
			}
		}
		return sb.toString();
	}

}

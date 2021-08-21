package Introduction_to_Programming_In_Java_2;

public class L3_Power {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 3;
		
		int ans = 1;
		
		for(int i = 1; i <= b; i++) {
			ans = ans * a; // 1 * 4 * 4 * 4
		}
		
		System.out.println(ans);

	}

}

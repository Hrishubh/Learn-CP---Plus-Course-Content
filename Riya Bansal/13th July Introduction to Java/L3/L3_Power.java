package Introduction_to_Programming_In_Java;

public class L3_Power {

	public static void main(String[] args) {

		int a = 4;
		int b = 3;

		int ans = 1;

		for (int i = 1; i <= b; i++) {
			ans = ans * a;
		}

		System.out.println(ans);

	}

}

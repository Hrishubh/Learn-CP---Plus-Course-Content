package Basic_Fundamentals_of_Programming;

public class L2_Functions {

	public static int GLOBAL = 20;
	public static void main(String[] args) {
		
		System.out.println("-------Part-1-------");
		
		System.out.println("hello");
		addition();
		System.out.println("Bye");
		
		System.out.println("------Part-2-------");
		System.out.println("hello");
		additionParams(2, 5);
		System.out.println("Bye");
		
		System.out.println("------Part-3-------");
		System.out.println("hello");
		int res = additionParamsRV(2, 9);
		System.out.println(res);
		System.out.println("Bye");
		
		System.out.println("------Part-4-------");
		System.out.println("hello");
		int res1 = additionParamsRV(2, 9, 10);
		System.out.println(res1);
		System.out.println("Bye");
		
		System.out.println("------Part-4-------");
		int one = 10;
		int two = 20;
		int sum = scopes(one, two);
		System.out.println(sum);
		

		System.out.println("------Part-5-------");
		System.out.println(GLOBAL);
		int GLOBAL = 200;
		System.out.println(GLOBAL);
		System.out.println(DemoScopes(one));
		
		
		//func(new int[] {1, 2, 3, 4});
		
	}
	
	
	 


	private static int DemoScopes(int one) {
		
		GLOBAL = GLOBAL + 40;
		int GLOBAL = 30;
		GLOBAL = GLOBAL + 40;
		int sum = one + GLOBAL;
		
		return sum;
	}


	private static int scopes(int one, int another) {
		
		//one -> 10
		//another -> 20
		int sum = one + another;
		return sum;
	}


	private static int additionParamsRV(int a, int b, int c) {
		
		int sum = a + b + c;
		return sum;
		
		
	}
	
	
	private static int additionParamsRV(int a, int b) {
		
		int sum = a + b;
		return sum;
		
		
	}

	private static void additionParams(int a, int b) {
		
		int sum = a + b;
		System.out.println(sum);
		
		
	}

	private static void addition() {
	
		int a = 2;
		int b = 3;
		int sum = a + b;
		System.out.println(sum);
	}

}

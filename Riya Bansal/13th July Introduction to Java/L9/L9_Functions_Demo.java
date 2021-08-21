package Introduction_to_Programming_In_Java;



public class L9_Functions_Demo {

	
	public static void main(String[] args) {
		
		
		//Part 1
		System.out.println("-----Part1-------");
		System.out.println("hello");
		
		//method calling
		addition();
		
		//Part-2a
		
		System.out.println("----Part-2a-----");
		System.out.println("hello");
		
		//function with arguments
		//method overloading
		addition(2, 12);
		addition(2, 12, 3);
		
		//Part-2b
		System.out.println("----Part-2b-----");
		int sum = additionRV(2, 12);
		System.out.println(sum);

		//Part 3
		System.out.println("----Part-3------");
		int one = 10;
		int two = 20;
		
		int sum1 = DemoScopes(one, two);
		System.out.println(sum1);
		
		//Part 4
		System.out.println("----Part 4------");
		System.out.println(GLOBAL); //20
		int GLOBAL = 200;
		System.out.println(GLOBAL); //200
		DemoGlobalScopes(one);
		
		
		
	}
	
	public static int GLOBAL = 20;
	
	private static void DemoGlobalScopes(int one) {
		//one = 10;
		GLOBAL = GLOBAL + 40; //20 + 40
		int GLOBAL = 30; 
		GLOBAL = GLOBAL + 40; //30 + 40 = 70 (local Variable)
		int sum = one + GLOBAL; //70 + 10 -> 80
		System.out.println(sum);
		
	}

	private static int DemoScopes(int one, int another) {
		
		int sum = one + another;
		return sum;
	}

	private static int additionRV(int i, int j) {
		
		int sum = i + j;
		return sum;
	}

	private static void addition(int i, int j, int k) {
		
		int sum = i + j  + k;
		
	}

	private static void addition(int a, int b) {
		
		int sum = a + b;
		System.out.println(sum);
		
	}

	//method declaration with no arguements
	public static void addition() {
		
		int a = 2;
		int b = 3;
		int sum = a + b;
		System.out.println(sum);
	}

}

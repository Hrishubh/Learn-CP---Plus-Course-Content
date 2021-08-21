package Introduction_to_Programming_In_Java;

public class L10_PrintDecreasing {

	public static void main(String[] args) {
		
		PrintDecreasing(5);

	}

	private static void PrintDecreasing(int i) {
		
		if(i == 0) { //Base Case
			return;
		}
		System.out.println(i); //self work
		PrintDecreasing(i - 1); //recursive call.
	}

}

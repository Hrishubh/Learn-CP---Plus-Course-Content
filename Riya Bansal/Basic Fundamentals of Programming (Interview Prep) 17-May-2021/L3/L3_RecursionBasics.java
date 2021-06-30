package Basic_Fundamentals_of_Programming;

public class L3_RecursionBasics {

	public static void main(String[] args) {
		

		//System.out.println(fibonacci(9));
		
		//displayArray(new int[] {3 , 2, 5, 1, 7}, 0);
		System.out.println(findBoolean(new int[] {3 , 2, 5, 1, 7}, 0, 8));
		
		System.out.println(findLastIndex(new int[] {3 , 2, 5, 1, 3, 3, 7}, 0, 3));
	}
	
	public static int fibonacci(int n) {
		
		if(n == 0 || n == 1) {
			return n;
		}
		
		int fnm1 = fibonacci(n - 1);
		int fnm2 = fibonacci(n - 2);
		
		int fn = fnm1 + fnm2;
		
		return fn;
	}
	
	public static void displayArray(int[] arr, int vidx) {
		
		if(vidx == arr.length) { //base case
			
			return;
		}
		
		System.out.println(arr[vidx]);
		displayArray(arr, vidx + 1); 
	}
	
	public static boolean findBoolean(int[] arr, int vidx, int item) {
		
		
		if(vidx == arr.length) {  //Base case
			return false;
		}
		
		if(arr[vidx] == item) {  //self work
			return true;
		}
		
		return findBoolean(arr, vidx + 1, item); //recursive call
	}
	
	public static int findLastIndex(int[] arr, int vidx, int item) {
		
		if(vidx == arr.length) {
			return -1;
		}
		
		int ra = findLastIndex(arr, vidx + 1, item);
		
		if(ra == -1 && arr[vidx] == item) {
			return vidx;
		}
		
		return ra;
	}

}

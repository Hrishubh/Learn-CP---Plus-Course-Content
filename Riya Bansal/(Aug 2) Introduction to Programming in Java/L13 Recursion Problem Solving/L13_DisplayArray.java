package Introduction_to_Programming_In_Java_2;

public class L13_DisplayArray {

	public static void main(String[] args) {
		
		displayArray(new int[] {1, 2, 3, 4, 5}, 0);

	}
	
	public static void displayArray(int[] arr, int vidx) {
		
		if(vidx == arr.length) {
			return;
		}
		
		System.out.println(arr[vidx]);
		
		displayArray(arr, vidx + 1);
		
		
	}

}

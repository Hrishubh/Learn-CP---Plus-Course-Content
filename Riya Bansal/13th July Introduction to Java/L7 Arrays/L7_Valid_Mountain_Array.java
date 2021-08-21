package Introduction_to_Programming_In_Java;

public class L7_Valid_Mountain_Array {

	public static void main(String[] args) {
		
		int[] arr = {0, 2, 4, 5, 2, 1, 0};
		
		int i = 0;
		
		//walking up
		while(i + 1 < arr.length && arr[i] < arr[i + 1]) {
			i++;
		}
		
		if(i == 0 || i == arr.length - 1) {
			//peak not found
			
		}
		
		//walking down
		while(i + 1 < arr.length && arr[i] > arr[i + 1]) {
			i++;
		}

		System.out.println(i == arr.length - 1);
	}

}

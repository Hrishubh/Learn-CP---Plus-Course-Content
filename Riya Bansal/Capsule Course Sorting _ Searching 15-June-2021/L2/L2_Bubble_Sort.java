package Sorting_Searching_Course;

public class L2_Bubble_Sort {

	public static void main(String[] args) {
		
		bubbleSort(new int[] {6, 2, 5, 3, 9});

		//I -> 6 - 2
	}

	private static void bubbleSort(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			boolean swap = false;
			//i = 0, j --> 5 - 0 - 1 -> 4
			//i = 1, j --> 5 - 1 - 1 -> 3
			//i = 2, j --> 5 - 2 - 1 -> 2
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = true;
					
				}
			}
			
			if(swap == false) {
				break;
			}
			
			for(int val:arr) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		
		
		
	}

}

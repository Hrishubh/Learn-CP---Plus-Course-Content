package Sorting_Searching_Course;

public class L2_Selection_Sort {

	public static void main(String[] args) {
		
		selectionSort(new int[] {62, 23, 10, 20, 9});

	}

	//TC - O(n^2)
	//SC - O(1)
	private static void selectionSort(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			//find the min element in the unsorted region
			int min_idx = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			
			//swap the min element with the first element of unsorted region
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
			
			for(int val: arr) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		
		
		
	}

}

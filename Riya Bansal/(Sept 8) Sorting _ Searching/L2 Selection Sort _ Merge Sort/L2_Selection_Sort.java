package Sorting_Searching_Course_3;

public class L2_Selection_Sort {

	public static void main(String[] args) {
		
		
		selectionSort(new int[] {62, 23, 10, 20, 9});
		
		
	}
	
	public static void selectionSort(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			int min_idx = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			
			//swap
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
			
			for(int val: arr) {
				System.out.print(val + " ");
			}
			
			System.out.println();
			
		}
		
		for(int val: arr) {
			System.out.print(val + " ");
		}
	}

}

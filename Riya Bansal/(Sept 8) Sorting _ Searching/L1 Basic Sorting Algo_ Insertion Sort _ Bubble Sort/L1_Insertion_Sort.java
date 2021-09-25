package Sorting_Searching_Course_3;

public class L1_Insertion_Sort {

	public static void main(String[] args) {
		
		int[] arr = {7, 4, 5, 2};
		
		insertionSort(arr);
		
		for(int val: arr) {
			System.out.print(val + " ");
		}

	}

	private static void insertionSort(int[] arr) {
		
		int n = arr.length;
		
		for(int i = 1; i < n; i++) {
			
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
			
				//shift
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			
			arr[j + 1] = key;
			
//			for(int k = 0; k < arr.length; k++) {
//				
//				System.out.print(arr[k] + " ");
//			}
//			
//			System.out.println();
			
			
		}
		
	}

}

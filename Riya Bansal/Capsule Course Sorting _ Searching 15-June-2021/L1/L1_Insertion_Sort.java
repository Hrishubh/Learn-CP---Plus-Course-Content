package Sorting_Searching_Course;

public class L1_Insertion_Sort {

	public static void main(String[] args) {
		

		insertionSort(new int[] {4, 2, 1, 3, 0});
	}

	private static void insertionSort(int[] arr) {
		
		for(int i = 1; i < arr.length; i++) {
			
			int key = arr[i];
			
			int j = i - 1;
			while(j >= 0 && arr[j] > key) {
				//shift
				arr[j + 1] = arr[j];
				j--;
			}
			
			arr[j + 1] = key;
			
			System.out.println(i  + " th Iteration");
			for(int val : arr) {
				System.out.print(val + " ");
			}
			
			System.out.println();
		}
		
		
		
	}

}

package Sorting_Searching_Course_2;

public class L9_Search_Sorted_Rotated_Array {

	public static void main(String[] args) {
		
		int[] arr = {4, 5 ,6, 7, 0, 1, 2};
		
		System.out.println(search(arr, 6));

	}

	private static int search(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			
			if(arr[mid] == target) {
				return mid;
				
			}else if(arr[mid] >= start) {
				//region from start to mid is non-rotated, hence sorted.
				if(target >= arr[start] && target <= arr[mid]) {
					end = mid - 1;
				}else {
					start = mid + 1;
				}
			}else {
				//region from mid to end is non-rotated, hence sorted.
				
				if(target <= arr[end] && target > arr[mid]) {
					start = mid + 1;
				}else {
					end = mid - 1;
				}
			}
		}
		
		return -1;
	}

}

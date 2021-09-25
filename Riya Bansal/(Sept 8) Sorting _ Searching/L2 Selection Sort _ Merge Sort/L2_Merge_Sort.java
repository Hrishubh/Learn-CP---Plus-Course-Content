package Sorting_Searching_Course_3;

public class L2_Merge_Sort {

	public static void main(String[] args) {
		
		int[] arr = {12, 10, 15, 4, 5, 6};
		
		mergeSort(arr, 0, arr.length - 1);
		for(int val: arr) {
			System.out.print(val + " ");
		}
	}

	private static void mergeSort(int[] arr, int l, int r) {
		
		if(l < r) {
			
			int mid = l + (r - l) / 2;
			
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);
			
			merge(arr, l, mid, r);
		}
		
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		
		//size of first half
		int n1 = mid - l + 1;
		//size of second half
		int n2 = r - mid;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i = 0; i < n1; i++) {
			L[i] = arr[l + i];
		}
		
		for(int j = 0; j < n2; j++) {
			R[j] = arr[mid + 1 + j];
		}
		
		int i = 0;
		int j = 0;
		
		int k = l;
		
		while(i < n1 && j < n2) {
			
			if(L[i] < R[j]) {
				arr[k] = L[i];
				k++;
				i++;
			}else {
				arr[k] = R[j];
				j++;
				k++;
			}
		}
		
		while(i < n1) {
			arr[k] = L[i];
			k++;
			i++;
		}
		
		while(j < n2) {
			arr[k] = R[j];
			k++;
			j++;
		}
	}

}

package Basic_Fundamentals_of_Programming;

import java.util.ArrayList;

public class L5_ArraylistDemo {

	public static void main(String[] args) {
		

		ArrayList<Integer> list = new ArrayList<>();
		
		//System.out.println(list);
		
		//add
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		//System.out.println(list);
		
		//add at index
		list.add(2, 50);
//		System.out.println(list);
//		
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
		
		list.set(3,  70);
		//System.out.println(list);
		
		list.remove(2);
//		System.out.println(list);
		
		int[] one = {1, 1, 2, 3, 4, 7, 8};
		int[] two = {0, 1, 3, 3, 4, 5};
		
		System.out.println(intersection(one, two));
 
	}

	private static ArrayList<Integer> intersection(int[] one, int[] two) {
		
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		int i = 0;
		int j = 0;
		
		while(i < one.length && j < two.length) {
			if(one[i] < two[j]) {
				i++;
			}else if(one[i] > two[j]) {
				j++;
			}else {
				ans.add(one[i]);
				i++;
				j++;
			}
			
		}
		
		return ans;
	}
	
	

}

package Basic_Data_Structures_10;

import java.util.Stack;

public class Next_Greater_Element {

	public static void main(String[] args) {
		

		int[] arr = {11, 4, 3 ,2, 10, 12};
		
		nextGreater(arr);
	}

	private static void nextGreater(int[] arr) {
	

		Stack<Integer> s = new Stack<>();
		
		s.push(arr[0]);
		
		for(int i = 0; i < arr.length; i++) {
		
			int val = arr[i];
			
			if(!s.isEmpty()) {
				int ele = s.pop();
				
				while(ele < val) {
					
					System.out.println(ele + " --> " + val);
					if(s.isEmpty()) {
						break;
					}
					
					ele = s.pop();
				}
				
				if(ele > val) {
					s.push(ele);
				}
			}
			
			s.push(val);
		}
		
		
		while(!s.isEmpty()) {
			
			int ele = s.pop();
			int next = -1;
			
			System.out.println(ele + " --> " + next);
		}
		
	}

}

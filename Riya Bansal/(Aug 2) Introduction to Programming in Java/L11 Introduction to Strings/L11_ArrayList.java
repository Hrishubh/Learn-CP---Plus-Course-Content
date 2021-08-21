package Introduction_to_Programming_In_Java_2;

import java.util.ArrayList;

public class L11_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		//size
		System.out.println(list.size());
		
		//print the list
		System.out.println(list);
		
		//add
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		//get
		//ranges: 0 to size - 1
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		//set
		list.set(0, 40);
		System.out.println(list);
		
		//remove
		list.remove(1);
		System.out.println(list);
		
		for(int i =0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}

package Basic_Data_Structures_Course;

import java.util.PriorityQueue;

public class L22_Heap_Client {

	public static void main(String[] args) {
		
		L22_Heap p = new L22_Heap();
		p.add(100);
		p.add(25);
		p.add(80);
		p.add(40);
		p.add(50);
		
		p.display();
		System.out.println(p.remove());
		p.display();
		System.out.println(p.remove());
		p.display();
		System.out.println(p.remove());
		p.display();
		System.out.println(p.remove());
		p.display();
		System.out.println(p.remove());
		p.display();
		

		PriorityQueue<Integer> pNew = new PriorityQueue<>();
	
	}

}

package Basic_Data_Structures_Course;

public class L4_LinkedListClient {

	public static void main(String[] args) {
		
		L4_LinkedListDemo ll = new L4_LinkedListDemo();
		
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addFirst(5);
		ll.addAt(65, 2);
		ll.display();

	}

}

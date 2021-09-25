package Basic_Data_Structures_Course;

public class L4_LinkedListDemo {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node head;

	public boolean isEmpty() {
		return this.head == null;
	}

	public void display() {

		Node temp = this.head;
		while (temp != null) {

			System.out.println(temp.data);
			temp = temp.next;

		}
	}

	public void addFirst(int data) {

		Node n = new Node(data);
		n.next = this.head;
		this.head = n;
	}

	public void addLast(int data) {

		if (this.head == null) {
			addFirst(data);
			return;
		}

		Node n = new Node(data);
		Node temp = this.head;

		while (temp.next != null) {

			temp = temp.next;
		}
		temp.next = n;
	}

	public void addAt(int data, int idx) {

		if (idx < 0) {
			return;
		}

		if (idx == 0) {

			addFirst(data);
			return;
		}

		Node nn = new Node(data);
		Node temp = this.head;

		
		for (int i = 0; i < idx - 1; i++) {
			
			temp = temp.next;
			
		}

		Node forward = temp.next;

		temp.next = nn;
		nn.next = forward;
	}

}

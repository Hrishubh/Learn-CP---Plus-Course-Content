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

		System.out.println("-------------------");
		Node temp = this.head;
		while (temp != null) {

			System.out.print(temp.data + " ");
			temp = temp.next;

		}
		System.out.println();
		System.out.println("-------------------");
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

	public int removeLast() {

		Node temp = this.head;

		while (temp.next.next != null) {

			temp = temp.next;
		}

		int rv = temp.next.data;
		temp.next = null;

		return rv;
	}

	public int removeFirst() {

		if (this.head == null) {
			return -1;
		}

		int rv = this.head.data;
		this.head = this.head.next;

		return rv;
	}

	public int removeAt(int idx) {

		if (idx < 0) {
			return -1;
		}
		if (idx == 0) {
			return removeFirst();
		}

		Node temp = this.head;
		for (int i = 0; i < idx - 1; i++) {
			temp = temp.next;
		}

		int rv = temp.next.data;
		temp.next = temp.next.next;

		return rv;
	}

	public void reverse() {

		Node prev = null;
		Node curr = head;
		Node next = null;

		while (curr != null) {

			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}

		head = prev;

	}

	public int findMid() {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow.data;
	}

	public void reorderList() {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node prev = null;
		Node curr = slow;
		Node next = null;

		while (curr != null) {

			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}

		Node first = head;
		Node second = prev;
		Node temp;

		while (second.next != null) {

			temp = first.next;
			first.next = second;
			first = temp;

			temp = second.next;
			second.next = first;
			second = temp;
		}
	}

}

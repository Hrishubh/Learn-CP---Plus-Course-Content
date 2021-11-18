package Greedy_Algorithms_Course_1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class L8_Huffman {

	static class Node {
		int data;
		char c;

		Node left;
		Node right;
	}

	static class MyComparator implements Comparator<Node> {

		@Override
		public int compare(Node x, Node y) {

			return x.data - y.data;

		}

	}

	public static void main(String[] args) {

		int n = 6;
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f' };
		int[] freq = { 5, 9, 12, 13, 16, 45 };

		PriorityQueue<Node> q = new PriorityQueue<>(n, new MyComparator());

		for (int i = 0; i < n; i++) {
			Node nn = new Node();

			nn.c = arr[i];
			nn.data = freq[i];

			nn.left = null;
			nn.right = null;

			q.add(nn);
		}

		Node root = null;

		while (q.size() > 1) {

			Node x = q.remove();

			Node y = q.remove();

			Node nn = new Node();
			nn.data = x.data + y.data;

			nn.c = '-';
			nn.left = x;
			nn.right = y;

			root = nn;

			q.add(nn);

		}

		decode(root, "");
	}

	private static void decode(Node root, String s) {

	
		if(root.left == null & root.right == null && Character.isLetter(root.c)) {
			System.out.println(root.c + " : " + s);
			return;
		}
		
		decode(root.left, s + "0");
		decode(root.right, s + "1");
		
	}

}

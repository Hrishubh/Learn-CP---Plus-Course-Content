package Basic_Data_Structures_Course;

import java.util.LinkedList;
import java.util.Queue;

public class L12_First_Non_Repeating_Char {

	public static void main(String[] args) {

		find("abacccb");

	}

	private static void find(String string) {

		int[] count = new int[26];

		Queue<Character> q = new LinkedList<Character>();

		for (int i = 0; i < string.length(); i++) {

			char ch = string.charAt(i);

			q.add(ch);

			count[ch - 'a']++;

			while (!q.isEmpty()) {
				if (count[q.peek() - 'a'] > 1) {
					q.remove();
				} else {
					System.out.print(q.peek() + " ");
					break;
				}
			}
			
			if(q.isEmpty()) {
				System.out.print(-1 + " ");
			}
		}

	}

}

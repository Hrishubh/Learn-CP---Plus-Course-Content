package Basic_Data_Structures_Course;

import java.util.Stack;

public class L7_Stack_Client {

	public static void main(String[] args) throws Exception {
		
		L7_Stack_Demo s = new L7_Stack_Demo();
		
		s.push(20);
		s.display();
		//System.out.println(s.top());
		s.push(30);
		s.display();
		s.pop();
		s.display();
		s.push(40);
		s.display();
		s.push(50);
		s.display();
		s.pop();
		s.display();
		
		System.out.println(s.top());
		
		
		Stack<Integer> st = new Stack<>();
		
		st.push(20);
		st.pop();

	}

}

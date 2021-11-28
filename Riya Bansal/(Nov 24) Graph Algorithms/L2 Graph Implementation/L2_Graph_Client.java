package Graph_Algorithms_3;

public class L2_Graph_Client {

	public static void main(String[] args) {

		L2_Graphs g = new L2_Graphs();

		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");

		g.addEdge("A", "B", 8);
		g.addEdge("B", "D", 2);
		g.addEdge("C", "E", 3);
		g.addEdge("A", "D", 1);
		g.addEdge("E", "B", 5);

		g.display();
		

	}

}

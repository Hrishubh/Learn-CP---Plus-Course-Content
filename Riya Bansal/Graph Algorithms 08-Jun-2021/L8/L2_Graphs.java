package Graph_Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class L2_Graphs {

	private class Vertex {
		HashMap<String, Integer> nbrs = new HashMap<>();
	}

	HashMap<String, Vertex> vtces;

	public L2_Graphs() {
		vtces = new HashMap<>();
	}

	public void addVertex(String vname) {

		if (vtces.containsKey(vname)) {
			return;
		}

		Vertex vtx = new Vertex();

		vtces.put(vname, vtx);
	}

	public void addEdge(String vname1, String vname2, int cost) {

		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}

		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);
	}

	public void removeVertex(String vname) {

		Vertex vtx = vtces.get(vname);
		ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());

		for (String key : keys) {

			Vertex nbrVtx = vtces.get(key);
			nbrVtx.nbrs.remove(vname);
		}

		vtces.remove(vname);
	}

	public void removeEdge(String vname1, String vname2) {

		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}

		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);
	}

	public void display() {
		System.out.println("----------------------------------");

		ArrayList<String> vnames = new ArrayList<>(vtces.keySet());

		for (String vname : vnames) {

			String str = vname + " => ";
			Vertex vtx = vtces.get(vname);
			str += vtx.nbrs;

			System.out.println(str);
		}

		System.out.println("----------------------------------");
	}

	public void dfs() {

		HashMap<String, Boolean> processed = new HashMap<>();

		Stack<String> stack = new Stack<>();

		for (String key : vtces.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}

			stack.push(key);

			while (!stack.isEmpty()) {
				String rp = stack.pop();
				if (processed.containsKey(rp)) {
					continue;
				}

				processed.put(rp, true);

				System.out.print(rp + " ");

				Vertex rpvtx = vtces.get(rp);

				ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

				for (String nbr : nbrs) {
					if (!processed.containsKey(nbr)) {
						stack.push(nbr);
					}
				}
			}

		}
	}

	public void bfs() {

		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<String> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}

			queue.add(key);

			while (!queue.isEmpty()) {

				String rp = queue.removeFirst();

				if (processed.containsKey(rp)) {
					continue;
				}

				processed.put(rp, true);

				System.out.print(rp + " ");

				Vertex rpvtx = vtces.get(rp);
				ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

				for (String nbr : nbrs) {
					if (!processed.containsKey(nbr)) {
						queue.addLast(nbr);
					}
				}
			}

		}
	}

	public boolean isConnected() {

		int flag = 0;
		HashMap<String, Boolean> processed = new HashMap<>();

		Stack<String> stack = new Stack<>();

		for (String key : vtces.keySet()) {
			if (processed.containsKey(key)) {
				continue;
			}

			flag++;

			stack.push(key);

			while (!stack.isEmpty()) {
				String rp = stack.pop();
				if (processed.containsKey(rp)) {
					continue;
				}

				processed.put(rp, true);

				System.out.print(rp + " ");

				Vertex rpvtx = vtces.get(rp);

				ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

				for (String nbr : nbrs) {
					if (!processed.containsKey(nbr)) {
						stack.push(nbr);
					}
				}
			}

		}

		if (flag >= 2) {
			return false;
		} else {
			return true;
		}
	}

	public ArrayList<ArrayList<String>> getCC() {
		// <<a, b, c, d>, <e, f>>

		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<String> queue = new LinkedList<>();
		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}

			ArrayList<String> subans = new ArrayList<>();
			queue.add(key);

			while (!queue.isEmpty()) {

				String rp = queue.removeFirst();

				if (processed.containsKey(rp)) {
					continue;
				}

				processed.put(rp, true);
				subans.add(rp);
				System.out.print(rp + " ");

				Vertex rpvtx = vtces.get(rp);
				ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

				for (String nbr : nbrs) {
					if (!processed.containsKey(nbr)) {
						queue.addLast(nbr);
					}
				}
			}

			ans.add(subans);
		}

		return ans;

	}

	public boolean isCyclic() {

		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<String> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}

			queue.add(key);

			while (!queue.isEmpty()) {

				String rp = queue.removeFirst();

				if (processed.containsKey(rp)) {
					return true;
				}

				processed.put(rp, true);

				System.out.print(rp + " ");

				Vertex rpvtx = vtces.get(rp);
				ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());

				for (String nbr : nbrs) {
					if (!processed.containsKey(nbr)) {
						queue.addLast(nbr);
					}
				}
			}

		}

		return false;

	}

	public boolean isTree() {

		return isConnected() == true && isCyclic() == false;
	}

	class Pair {
		String vname;
		String color;
	}

	public boolean isBipartite() {
		// Node name, Color
		HashMap<String, String> processed = new HashMap<>();
		LinkedList<Pair> queue = new LinkedList<>();
		for (String key : vtces.keySet()) {

			if (processed.containsKey(key))
				continue;

			Pair sp = new Pair();
			sp.vname = key;
			sp.color = "r";
			queue.add(sp);
			while (!queue.isEmpty()) {

				Pair rp = queue.removeFirst();

				if (processed.containsKey(rp.vname)) {

					String nc = rp.color;
					String oc = processed.get(rp.vname);
					if (!nc.equals(oc))
						return false;
					continue;
				}

				processed.put(rp.vname, rp.color);
				Vertex rpvtx = vtces.get(rp);
				ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());
				for (String nbr : nbrs) {
					if (!processed.containsKey(nbr)) {

						Pair np = new Pair();
						np.vname = nbr;
						np.color = rp.color.equals("r") ? "g" : "r";
						queue.addLast(np);
					}
				}
			}

		}
		return true;
	}

	private class EdgePair implements Comparable<EdgePair> {

		String v1;
		String v2;

		int cost;

		public int compareTo(EdgePair o) {
			return this.cost - o.cost;
		}

		public String toString() {
			return v1 + "-" + v2 + " : " + cost;
		}

	}

	public class DisjointSet {

		HashMap<String, Node> map = new HashMap<>();

		private class Node {
			String data;
			Node parent;
			int rank;
		}

		public void create(String value) {
			Node nn = new Node();
			nn.data = value;
			nn.parent = nn;
			nn.rank = 0;

			map.put(value, nn);
		}

		public String find(String value) {
			return find(map.get(value)).data;
		}

		private Node find(Node node) {

			if (node == node.parent) {
				return node;
			}

			Node rr = find(node.parent);
			node.parent = rr; // path compression
			return rr;
		}

		public void union(String value1, String value2) {

			Node n1 = map.get(value1);
			Node n2 = map.get(value2);

			Node re1 = find(n1);
			Node re2 = find(n2);

			if (re1.data.equals(re2.data)) {
				return;
			} else {
				if (re1.rank == re2.rank) {
					re2.parent = re1;
					re1.rank = re1.rank + 1;
				} else if (re1.rank > re2.rank) {
					re2.parent = re1;
				} else {
					re1.parent = re2;
				}
			}
		}
	}

	public void kruskal() {

		// Store all the edges
		ArrayList<EdgePair> edges = getAllEdges();

		// Sort all the edges
		Collections.sort(edges);

		DisjointSet set = new DisjointSet();

		// Add every node of the graph to the disjoint set.
		for (String vname : vtces.keySet()) {
			set.create(vname);

		}

		// iterating over all the edges
		for (EdgePair edge : edges) {

			// For a edge, we check the vertices at its both end.
			String re1 = set.find(edge.v1);
			String re2 = set.find(edge.v2);

			// If same root,
			if (re1.equals(re2)) {
				continue;
			} else {
				System.out.println(edge);
				set.union(edge.v1, edge.v2);
			}

		}

	}

	private ArrayList<EdgePair> getAllEdges() {

		ArrayList<EdgePair> edges = new ArrayList<>();

		for (String vname : vtces.keySet()) {

			Vertex vtx = vtces.get(vname);

			for (String nbr : vtx.nbrs.keySet()) {

				EdgePair ep = new EdgePair();

				ep.v1 = vname;
				ep.v2 = nbr;
				ep.cost = vtx.nbrs.get(nbr);

				edges.add(ep);
			}
		}

		return edges;
	}

	//TC - > O(VE)
	public HashMap<String, Integer> bellmanFord(String src) throws Exception {

		ArrayList<EdgePair> edges = getAllEdges();

		HashMap<String, Integer> map = new HashMap<>();

		for (String vname : vtces.keySet()) {
			map.put(vname, 100000);

			if (src.equals(vname)) {
				map.put(vname, 0);
			}
		}
		
		int V = vtces.size();
		//relax every edge V-1 times
		
		for(int i = 1; i <= V; i++) {
			
			for(EdgePair edge: edges) {
				
				int oc = map.get(edge.v2);
				int nc = map.get(edge.v1) + edge.cost;
				
				if(oc > nc) {
					
					if(i <= V - 1) {
						map.put(edge.v2, nc);
					}else {
						throw new Exception("-ve wt cycle present");
					}
				}
			}
		}
		return map;
	}

}

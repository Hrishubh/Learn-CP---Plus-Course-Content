package Graph_Algorithms_2;

import java.util.*;

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

		System.out.println("--------------------------");

		ArrayList<String> vnames = new ArrayList<>(vtces.keySet());

		for (String vname : vnames) {

			String str = vname + " => ";
			Vertex vtx = vtces.get(vname);
			str += vtx.nbrs;

			System.out.println(str);
		}

		System.out.println("--------------------------");
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
				System.out.println(rp + " ");

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
		
		
		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		HashMap<String, Boolean> processed = new HashMap<>();
		LinkedList<String> queue = new LinkedList<>();

		for (String key : vtces.keySet()) {

			if (processed.containsKey(key)) {
				continue;
			}

			queue.add(key);
			ArrayList<String> subans = new ArrayList<>();
			while (!queue.isEmpty()) {
				String rp = queue.removeFirst();
				if (processed.containsKey(rp)) {
					continue;
				}

				processed.put(rp, true);
				subans.add(rp);
				System.out.println(rp + " ");

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
				System.out.println(rp + " ");

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
		
		return isConnected() && !isCyclic();
	}

}

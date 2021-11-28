package Graph_Algorithms_3;

import java.util.*;

public class L2_Graphs {

	public class Vertex {
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
		
		if(vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		
		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);
		
	}
	
	public void removeVertex(String vname) {
		
		Vertex vtx = vtces.get(vname);
		ArrayList<String> keys = new ArrayList<>(vtx.nbrs.keySet());
		
		for(String key: keys) {
			Vertex nbrVtx = vtces.get(key);
			nbrVtx.nbrs.remove(vname);
		}
		
		vtces.remove(vname);
		
	}
	
	public void removeEdge(String vname1, String vname2) {
		
		Vertex vtx1 = vtces.get(vname1);
		Vertex vtx2 = vtces.get(vname2);
		
		if(vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		
		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);
	}
	
	public void display() {
		
		System.out.println("--------------------------");
		
		ArrayList<String> vnames = new ArrayList<>(vtces.keySet());
		
		for(String vname: vnames) {
			
			String str = vname + "=> ";
			Vertex vtx = vtces.get(vname);
			
			str += vtx.nbrs;
			
			System.out.println(str);
		}
		
		System.out.println("--------------------------");
	}
	
	

}

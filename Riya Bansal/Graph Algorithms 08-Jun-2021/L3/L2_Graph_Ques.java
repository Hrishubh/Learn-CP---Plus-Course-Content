package Graph_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class L2_Graph_Ques {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1)); 
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(2)); 
		List<Integer> l3 = new ArrayList<Integer>(Arrays.asList(3)); 
		List<Integer> l4 = new ArrayList<Integer>(Arrays.asList(0));
		
		List<List<Integer>> l = new ArrayList<>(Arrays.asList(l1, l2, l3, l4));
		System.out.println(visitRoomsWithKeys(l));
	}
	
	public static boolean  visitRoomsWithKeys(List<List<Integer>> rooms) {
		
		boolean[] seen = new boolean[rooms.size()];
		
		seen[0] = true;
		Stack<Integer> s = new Stack<>();
		
		s.push(0);
		
		while(!s.isEmpty()) {
			int node = s.pop();
			
			List<Integer> nbrs = rooms.get(node);
			for(int nbr: nbrs) {
				if(!seen[nbr]) {
					seen[nbr] = true;
					s.push(nbr);
				}
			}
			
		}
		
		for(boolean v: seen) {
			if(!v) return false;
		}
		
		return true;
	}
	
	
	public List<List<Integer>> allPaths(int[][] graph){
		
		List<List<Integer>> ans = new ArrayList<>();
		
		List<Integer> path = new ArrayList<>();
		
		path.add(0);
		dfs(graph, 0, ans, path);
		
		return ans;
 	}

	private void dfs(int[][] graph, int node, List<List<Integer>> ans, List<Integer> path) {
		
		if(node == graph.length - 1) {
			ans.add(path);
			return;
		}
		
		for(int nbr: graph[node]) {
			//do
			path.add(nbr);
			//recurse
			dfs(graph, nbr, ans, path);
			//undo
			path.remove(path.size() - 1);
		}
		
	}

}

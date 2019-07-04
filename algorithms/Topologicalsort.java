package algorithms;
import java.util.Stack;

import data_strctures.Digraph;

//Topological sort is the reverse order of DFS of DAG (directed acyclic graph)
public class Topologicalsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private Digraph G;
	Stack<Integer> tstack;
	private boolean marked [];
	
	public Topologicalsort(Digraph G) {
		this.G = G;
		this.tstack = new Stack<Integer>();
		marked = new boolean [G.V()];
	}
	
	public Iterable<Integer> tp() {
		for (int i=0; i<G.V(); i++) {
			if (!marked[i]) {
				dfs(G, i);
			}
		}
		return tstack;
	}
	
	public void dfs(Digraph G, int x) {
		marked[x] = true;
		for (int w : G.getAdj(x)) {
			if (!marked[w]) {
				dfs(G, w);
			}
		}
		tstack.push(x);
	}

}

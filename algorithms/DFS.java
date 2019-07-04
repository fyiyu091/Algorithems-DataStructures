package algorithms;
import java.util.Stack;

import data_strctures.Graph;

public class DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private boolean[] marked;
    
	public DFS(Graph G, int s) {
		marked = new boolean [G.V()];
		dfs(G, s);
	}
	
	public void dfs(Graph G, int x) {
		marked[x] = true;
		for (int y : G.getAdj(x)) {
			if (marked[y] == false) {
				dfs(G, y);
			}
		}
	}
	
	//The order of marking
	public void dfsiter(Graph G, int x) {
		Stack<Integer> mys = new Stack<Integer>();
		marked[x] = true;
		mys.push(x);
		while (!mys.empty()) {
			int y = mys.peek();
			marked[y] = true;
			mys.pop();
			for (int w : G.getAdj(y)) {
				if (!marked[w]) {
					mys.push(w);
				}
			}	
		}
	}
}

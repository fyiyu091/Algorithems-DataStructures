package data_strctures;

import data_strctures.Bag;

public class Graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Graph mygraph = new Graph(8);
        mygraph.addEdge(1, 6);
        mygraph.addEdge(1, 7);
        for (int x : mygraph.getAdj(7)) {
        	System.out.println(x);
        }
	}
	
	private final int V;
	private Bag<Integer>[] adj;
	
	//V means number of nodes
	public Graph(int V) {
		this.V = V;
		//The array cast!!!
        this.adj = (Bag<Integer>[]) new Bag[V];
		for (int i=0; i<V; i++) {
			adj[i] = new Bag<Integer>();
		}
	}
	
	public void addEdge(int x, int y) {
		adj[x].add(y);
		adj[y].add(x);
	}
	
	public Iterable<Integer> getAdj(int x) {
		return adj[x];
	}
	
	public int V() {
		return V;
	}

}

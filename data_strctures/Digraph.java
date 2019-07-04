package data_strctures;
import data_strctures.Bag;

public class Digraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private final Bag<Integer>[] tbag;
	//Number of vertices 
	private final int V;
	
	public Digraph(int V) {
		this.V = V;
		tbag = (Bag<Integer>[]) new Bag [V];
		for (int i=0; i<V; i++) {
			tbag[i] = new Bag<Integer>();
		}
	}
	
	public void addEdge(int w, int v) {
		tbag[w].add(v);
	}
	
	public Iterable<Integer> getAdj(int w) {
		return tbag[w];
	}
	
	public int V() {
		return V;
	}

}

package data_strctures;
import data_strctures.Directededge;
import data_strctures.Bag;

public class EdgeweightedDigraph {
	private int N;
	private Bag<Directededge>[] tbag;
	
	public EdgeweightedDigraph(int N) {
		this.N = N;
		this.tbag = (Bag<Directededge>[]) new Bag [N];
		for (int i=0; i<N; i++) {
			tbag[i] = new Bag<Directededge>();
		}
	}
	
	public void addEdge(Directededge e) {
		int s = e.from();
		tbag[s].add(e);
	}
	
	public Iterable<Directededge> getAdj(int x) {
		return tbag[x];
	}
	
	public int V() {
		return N;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

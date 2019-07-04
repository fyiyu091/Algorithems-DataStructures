package algorithms;
import data_strctures.EdgeweightedDigraph;
import data_strctures.IndexMinPQ;
import data_strctures.MinPQ;
import data_strctures.Directededge;

public class Dijkstra {
	private Directededge [] edgeto;
	private double [] disto;
	//The minpq is not good enough, will need a indexminpq for the vertices associate with the weight
	//The purpose of the indexminpq is to always get the lowest weight to dqueue next
	private IndexMinPQ queue;
	
	public Dijkstra(EdgeweightedDigraph G, int s) {
		queue = new IndexMinPQ(G.V());
		queue.insert(s, 0.0);
		edgeto = new Directededge [G.V()];
		disto = new double [G.V()];
		for (int i=0; i<G.V(); i++) {
			disto[i] = Integer.MAX_VALUE;
		}
		disto[s] = 0;
		
		//Dijkstra algorithm
		while (!queue.isEmpty()) {
			int v = queue.getMin();
			//edge relaxation
			for (Directededge e : G.getAdj(v)) {
				if (disto[e.to()] > disto[e.from()] + e.weight()) {
					disto[e.to()] = disto[e.from()] + e.weight();
					edgeto[e.to()] = e;
				}
			}
		}
	}
	
	public Directededge edgeTo(int v) {
		return edgeto[v];
	}
	
	public double disTo(int v) {
		return disto[v];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package algorithms;
import data_strctures.Graph;
import data_strctures.Queue;

public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private boolean [] marked;
	
	public BFS(Graph G, int x) {
		marked = new boolean [G.V()];
		bfs(G, x);
	}
	
	//The order of marking
	public void bfs(Graph G, int x) {
		Queue myq = new Queue();
		myq.enqueue(x);
		while (!myq.isEmpty()) {
			int y = myq.dequeue();
			marked[y] = true;
			for (int w : G.getAdj(y)) {
				if (!marked[w]) {
					myq.enqueue(w);
				}
			}
		}
	}

}

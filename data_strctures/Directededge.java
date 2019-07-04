package data_strctures;

public class Directededge {
	private final int v;
	private final int w;
	private final double weight;
	
	public Directededge(int v, int w, double weight) {
		this.v = v;
		this.w = w;
		this.weight = weight;
	}
	
	public int to() {
		return w;
	}
	
	public int from() {
		return v;
	}
	
	public double weight() {
		return weight;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package data_strctures;

//Create the index min priority queue, the key is the deciding factor of the priority of the element
//To serve the dijkstra algorithm to find the shortest path to a source
public class IndexMinPQ {
	int [] pq;
	int [] qp;
	double [] keys;
	int n;
	
	public IndexMinPQ(int Maxn) {
		this.pq = new int [Maxn+1];
		this.qp = new int [Maxn+1];
		this.keys = new double [Maxn+1];
		n = 0;
	}
	
	public void insert(int value, double key) {
		n++;
		keys[value] = key;
		pq[n] = value;
		qp[value] = n;
		swim(n);
	}
	
	public boolean isEmpty() {
		return n == 0;
	}
	
	public int getMin() {
	    int res = pq[1];
	    swap(1, n);
	    n--;
	    keys[pq[n]] = 0.0;
	    sink(1);
	    return res;
	}
	
	public void decreaseKey(int value, double key) {
		keys[qp[value]] = key;
		swim(qp[value]);
	}
	
	//The swim is based on the key
	public void swim(int i) {
		while (i > 1 && keys[pq[i]] < keys[pq[i/2]]) {
			swap(i, i/2);
			i = i/2;
		}
	}
	
	public void sink(int i) {
		while (2*i <= n) {
			int j = 2*i;
			if (keys[pq[j+1]] < keys[pq[j]]) j++;
			if (keys[pq[i]] < keys[pq[j]]) break;
			else {
				swap(i, j);
				i = j;
			}
		}
	}
	
	public void swap(int i, int j) {
		int tmp = pq[i];
		pq[i] = pq[j];
		pq[j] = tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "asdfg";
		System.out.println(s.substring(1,1));
        IndexMinPQ myipq = new IndexMinPQ(5);
        myipq.insert(0, 1.0);
        myipq.insert(1, 2.6);
        myipq.insert(2, 9.5);
        myipq.insert(3, 2.345);
        myipq.insert(4, 9.4);
//        System.out.println(myipq.getMin());
//        System.out.println(myipq.getMin());
//        System.out.println(myipq.getMin());
//        System.out.println(myipq.getMin());
//        System.out.println(myipq.getMin());
	}

}

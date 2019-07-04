package data_strctures;

//Implement minimum priority queue using binary heap
public class MinPQ<E> {
	public E [] pq;
	public int N;
	public Comparable<E> comparator;
	
	public MinPQ(int capacity) {
		this.pq = (E[]) new Object [capacity+1];
		this.N = 0;
	}
	
	public boolean isEmpty( ) {
		return N == 0;
	}
	
	public void insert(E element) {
		pq[++N] = element;
		swim(N);
	}
	
	public E getMin() {
		E min = pq[1];
		//N has to minus one for the new insert item
		swap(1, N--);
		sink(1);
		pq[N+1] = null;
		return min;
	}
	
	public void sink(int i) {
		while(2*i <= N) {
			int j = 2*i;
			if (less(j+1, j)) j++;
			if (less(i, j)) break;
			swap(i, j);
			i = j;
		}
	}
	
	public void swim(int i) {
		while (i > 1 && less(i, i/2)) {
				swap(i, i/2);
				i = i/2;
			}
		}

	
	public void swap(int pos1, int pos2) {
		E tmp;
		tmp = pq[pos1];
		pq[pos1] = pq[pos2];
		pq[pos2] = tmp;
	}
	
	public boolean less(int pos1, int pos2) {
		return ((Comparable<E>) pq[pos1]).compareTo(pq[pos2]) < 0;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MinPQ<String> mympq = new MinPQ<String>(15);
        mympq.insert("a");
        mympq.insert("b");
        mympq.insert("c");
        mympq.insert("d");
        mympq.insert("e");
        mympq.insert("f");
        System.out.println(mympq.getMin());
        System.out.println(mympq.getMin());
	}

}

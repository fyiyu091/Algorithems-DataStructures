package data_strctures;

public class Binaryheap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Binaryheap mybh = new Binaryheap(10);
        mybh.add(34);
        mybh.add(1231);
        mybh.add(1);
        mybh.add(456);
        mybh.add(234);
        mybh.add(68);
        System.out.println(mybh.getMax());
        System.out.println(mybh.getMax());
        System.out.println(mybh.getMax());
	}
	
	private int [] theap;
	private int curr;
	public Binaryheap(int size) {
		//Staring from 1
		theap = new int [size+1];
		theap[0] = 0;
		curr = 0;
	}
	
	public void add(int x) {
		theap[++curr] = x;
		swim(curr);
	}
	
	public void swim(int x) {
		//x is the location
		while (x > 1 && theap[x] > theap[x/2]) {
			swap(theap, x, x/2);
			x = x/2;
		}
	}
	
	public void sink(int x) {
		//x is the location
		while (2*x <= curr) {
			int j = 2*x;
			if (theap[j+1] > theap[j]) {
				j++;
			}
			if (theap[x] > theap[j]) {
				break;
			}
			swap(theap, x, j);
			x = j;
		}
	}
	
	public void swap(int [] tarray, int x, int y) {
		int tmp;
		tmp = tarray[x];
		tarray[x] = tarray[y];
		tarray[y] = tmp;
	}
	
    public int getMax() {
    	  int res = theap[1];
    	  swap(theap, 1, curr--);
    	  sink(1);
    	  return res;
    }
}

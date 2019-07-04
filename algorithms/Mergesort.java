package algorithms;

public class Mergesort {
    private int [] arr;
    
    public Mergesort(int [] inputarray) {
    	arr = inputarray;
    	int [] aux = new int [arr.length];
    	sort(aux, 0, arr.length-1);
    }
    
    public void sort(int [] aux, int lo, int hi) {
    	if (lo >= hi) return;
    	int mid = lo + (hi - lo)/2;
    	sort(aux, lo, mid);
    	sort(aux, mid+1, hi);
    	merge(aux, lo, mid, hi);
    }
    
    public void merge(int [] aux, int lo, int mid, int hi) {
    	
    	for (int i=lo; i<=hi; i++) {
    		aux[i] = arr[i];
    	}
    	int i=lo, j=mid+1;
    	for (int k=lo; k<=hi; k++) {
    		if (i > mid) arr[k] = aux[j++];
    		else if (j > hi) arr[k] = aux[i++];
    		else if (aux[i] < aux[j]) arr[k] = aux[i++];
    		else arr[k] = aux[j++];
    	}
    }
    
    public void printall() {
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myarray = {1,2,3,41,4,12,312,341,231,23,5123};
        Mergesort myms = new Mergesort(myarray);
        myms.printall();
	}

}

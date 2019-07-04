package algorithms;

public class Quicksort {

    private int [] arr;
    
    public Quicksort(int [] inputarray) {
    	arr = inputarray;
    	sort(arr, 0, arr.length-1);
    }
    
    public void sort(int [] tarray, int lo, int hi) {
    	if (lo >= hi) return;
    	int i = partition(lo, hi);
    	sort(arr, lo, i-1);
    	sort(arr, i+1, hi);
    }
    
    public int partition(int lo, int hi) {
    	int i = lo;
    	int j = hi+1;
    	while(true) {
    		while (arr[++i] < arr[lo]) {
    			if (i == hi) break;
    		}
    		while (arr[--j] > arr[lo]) {
    			
    		}
    		if (i >= j) break;
    		swap(i, j);
    	}
    	swap(lo, j);
    	return j;
    }
    
	public void swap(int i, int j) {
	    int tmp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = tmp;
	}
	
	public void printall() {
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] myarray = {1,2,3,41,4,12,312,341,231,23,5123};
        Quicksort myqs = new Quicksort(myarray);
        myqs.printall();
	}

}

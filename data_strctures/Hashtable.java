package data_strctures;

public class Hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Hashtable myht = new Hashtable();
        myht.put(2,3);
        myht.put(234,567);
        myht.put(67,234234);
        myht.put(24,56);
        myht.put(1234,456);
        System.out.println(myht.get(234));
	}
	
	public class node {
		int key;
		int val;
		node next;
		
		public node(int key, int val) {
			this.key = key;
			this.val = val;
			this.next = null;
		}
	}
	
    private node [] tarray;
    private int M;
	
    public Hashtable( ) {
    	this.M = 10000;
    	tarray = new node [M];
    }
    
    public int getposition(int x) {
    	int hashcode = Integer.hashCode(x);
    	return hashcode % M;
    }
    
    public void put(int key, int val) {
    	int pos = getposition(key);
    	if (tarray[pos] == null) {
    		node tmp = new node(key, val);
    		tarray[pos] = tmp;
    	}
    	//key collision
    	else {
    		node tmphead = tarray[pos];
    		node tmp = new node(key, val);
    		while(tmphead.next != null) {
    			tmphead = tmphead.next;
    		}
    		tmphead.next = tmp;
    	}
    }
    
    public int get(int key) {
    	int pos = getposition(key);
    	node tmphead = tarray[pos];
    	int res = Integer.MAX_VALUE;
    	while (tmphead != null) {
    		if (tmphead.key == key) {
    			res = tmphead.val;
    			break;
    		}
    		tmphead = tmphead.next;
    	}
    	return res;
    }

}

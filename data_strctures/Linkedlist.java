package data_strctures;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Linkedlist myll = new Linkedlist();
        myll.insert(2);
        myll.insert(234);
        myll.insert(345);
        myll.insert(1234);
        myll.insert(345);
        myll.insert(234);
        node curr = myll.getroot();
        myll.delete(2);
        while (curr != null) {
        	System.out.println(curr.val);
        	curr = curr.next;
        }
	}
	
	public node root;
	
	public class node {
		int val;
		node next;
		
		public node(int x) {
			this.val = x;
			this.next = null;
		}
	}
	
	public Linkedlist() {
		root = null;
	}
	
	public node getroot() {
		return this.root;
	}
	
	public void insert(int x) {
		node newroot = new node(x);
		newroot.next = root;
		root = newroot;
	}
	
	public void delete(int x) {
		node curr = root;
		while(curr != null) {
			if (curr.next.val == x) {
				break;
			}
			curr = curr.next;
		}
		if (curr != null) {
			curr.next = curr.next.next;
		}
	}

}

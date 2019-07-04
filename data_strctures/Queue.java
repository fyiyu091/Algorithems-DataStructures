package data_strctures;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue myq = new Queue();
        for (int i=0; i<10; i++) {
        	myq.enqueue(i);
        }
        System.out.println(myq.dequeue());
        System.out.println(myq.dequeue());
        System.out.println(myq.dequeue());
	}
	
	public class node {
		int val;
		node next;
		public node(int x) {
			this.val = x;
			this.next = null;
		}
	}
	
	public node head;
	public node tail;
	
	public Queue() {
		head = null;
		tail = null;
	}
	
	public void enqueue(int x) {
		if (head == null && tail == null) {
			node tmp = new node(x);
			head = tmp;
			tail = tmp;
		}
		else {
		    node tmp = new node(x);
		    tail.next = tmp;
		    tail = tmp;
		}
	}
	
	public int dequeue() {
		int res;
		res = head.val;
		head = head.next;
		return res;
	}
	
	public boolean isEmpty() {
		return tail == null;
	}

}

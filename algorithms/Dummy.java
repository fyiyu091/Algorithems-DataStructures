package algorithms;

import java.util.PriorityQueue;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PriorityQueue<String> pq = new PriorityQueue();
        pq.add("AFK");
        pq.add("BFK");
        pq.add("CFK");
        pq.add("DFK");
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
	}

}

package data_strctures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<T> implements Iterable<T> {
	
	private static class node<T> {
		private T val;
		private node<T> next;
	}
	
	private node<T> first;
	
	public Bag() {
		first = null;
	}
	
	public void add(T element) {
		node<T> oldfirst = first;
		first = new node<T>();
		first.val = element;
		first.next = oldfirst;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public Iterator<T> iterator() {
		return new bagiterator(first);
	}
	
	private class bagiterator implements Iterator<T> {
		private node<T> curr;
		public bagiterator(node<T> curr) {
			this.curr = curr;
		}
		public boolean hasNext() {
			return curr != null;
		}
		public T next() {
			if (!hasNext()) {throw new NoSuchElementException();}
			T item = curr.val;
			curr = curr.next;
			return item;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bag<Integer> mybag = new Bag<Integer>();
        mybag.add(1);
        mybag.add(2352);
        mybag.add(67856);
        mybag.add(4);
        for (int i : mybag) {
        	System.out.println(i);
        }
        
	}

}

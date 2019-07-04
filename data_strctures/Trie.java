package data_strctures;

import java.util.HashMap;

public class Trie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie mytrie = new Trie();
		mytrie.insert("abcd");
		mytrie.insert("abch");
		mytrie.insert("abceh");
		mytrie.insert("abc");
		boolean res = mytrie.search("abceh");
		System.out.println(res);

	}
	
	class TrieNode {
		private HashMap<Character, TrieNode> children;
		private Boolean isword;
		
		public TrieNode () {
			this.children = new HashMap<Character, TrieNode>();
			this.isword = false; 
		}
	}
	
	private TrieNode root;
	
	public Trie () {
		root = new TrieNode();
	}
	
	//ToDo: Trie delete, recursively!!!!!!!!
	
	public void insert(String s) {
		int N = s.length();
		TrieNode head = root;
		for (int i=0; i<N; i++) {
			char ch = s.charAt(i);
			TrieNode curr = head.children.get(ch);
			if (curr == null) {
				curr = new TrieNode();
				head.children.put(ch, curr);
			}
			head = curr;
		}
		head.isword = true;
	}
	
	public boolean search(String s) {
		int N = s.length();
		TrieNode head = root;
		for (int i=0; i<N; i++) {
			char ch = s.charAt(i);
			TrieNode curr = head.children.get(ch);
			if (curr == null) {
				return false;
			}
			head = curr;
		}
		return head.isword;
	}

}

package com.interview.linkedlist;

/**
 * 
 * @author Anisweta
 * Purpose: Split linked list into two halves and return the start of second half
 * Logic: take two pointer slow and fast, move fast twice as slow until fast reaches end
 * then store slow's next to back and return back. Also make slow's next point to null
 */
public class FrontAndBackSplit {

	public Node frontBackSplit(Node root) {
		if (root == null) {
			return null;
		}
		Node slow = root;
		Node fast = root.next;
		while (fast!=null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node back = slow.next;
		slow.next = null;
		return back;
	}
	
	public static void main(String args[]) {
		NodeInsertion nodeInsertionObj = new NodeInsertion();
		Node root = null;
		root = nodeInsertionObj.insertNodeAtEnd(root, 15);
		root = nodeInsertionObj.insertNodeAtEnd(root, 7);	    
		FrontAndBackSplit frontbackObj = new FrontAndBackSplit();
		Node node = frontbackObj.frontBackSplit(root);
		Traversal traversalObj=new Traversal();
		traversalObj.traverse(node); 
		
	}

}

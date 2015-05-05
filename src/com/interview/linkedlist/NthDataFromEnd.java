package com.interview.linkedlist;

/**
 * 
 * @author Anisweta Purpose: to get nth data from end of linked list 
 * Logic: take two pointers slow and fast; move fast to n and then move slow and fast
 * one step until fast reaches end
 */
public class NthDataFromEnd {

	public Node getNthNodeFromEnd(Node root, int index) {
		if (root == null) {
			throw new IllegalArgumentException();
		}
		if (index < 0) {
			throw new IllegalArgumentException();
		}
		int i = 0;
		Node slow = root;
		Node fast = root;
		while (fast != null && i <= index) {
			fast = fast.next;
			i++;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		if (index != i) {
			throw new IllegalArgumentException();
		} else {
			return slow;
		}
	}

	public static void main(String args[]) {
		NodeInsertion nodeInsertionObj = new NodeInsertion();
		Node root = null;
		root = nodeInsertionObj.insertNodeAtEnd(root, 15);
		root = nodeInsertionObj.insertNodeAtEnd(root, 7);
		root = nodeInsertionObj.insertNodeAtEnd(root, 10);
		root = nodeInsertionObj.insertNodeAtEnd(root, 3);
		NthDataFromEnd nthDataObj = new NthDataFromEnd();
		Node node = nthDataObj.getNthNodeFromEnd(root, 4);
		System.out.println(node.data);
	}

}

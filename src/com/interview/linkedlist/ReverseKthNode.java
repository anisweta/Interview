package com.interview.linkedlist;

/**
 * 
 * @author Anisweta
 * Purpose: Reverse k elements and assign that to root.next
 *
 */
public class ReverseKthNode {

	public Node reverseEveryKthNode(Node root, int k) {
		if (root == null || root.next == null) {
			return root;
		}
		int i = 0;
		Node prev = null;
		Node current = root;
		Node next = null;
		while (current != null && i < k) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			i++;
		}
		root.next = reverseEveryKthNode(current, k);
		return prev;
	}

	public static void main(String args[]) {
		NodeInsertion nodeInsertionObj = new NodeInsertion();
		ReverseKthNode reverseObj = new ReverseKthNode();
		Node root = null;
		root = nodeInsertionObj.insertNodeAtEnd(root, 5);
		root = nodeInsertionObj.insertNodeAtEnd(root, 7);
		root = nodeInsertionObj.insertNodeAtEnd(root, -1);
		root = nodeInsertionObj.insertNodeAtEnd(root, 34);
		root = nodeInsertionObj.insertNodeAtEnd(root, 55);
		root = nodeInsertionObj.insertNodeAtEnd(root, 17);
		root = nodeInsertionObj.insertNodeAtEnd(root, -14);
		root = nodeInsertionObj.insertNodeAtEnd(root, 4);
		root = reverseObj.reverseEveryKthNode(root,3);
		Traversal traversalObj = new Traversal();
		traversalObj.traverse(root);
	}

}

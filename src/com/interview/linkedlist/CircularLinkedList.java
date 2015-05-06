package com.interview.linkedlist;
/**
 * 
 * @author Anisweta
 * Purpose: To create a circular linked list by adding nodes at end and 
 * make that node point to root.
 * To find length of circular linked list - traverse through circular 
 * linked list and maintain count until you reach root again
 * To Traverse through circular linked list - print root data and then 
 * traverse until you reach root again
 */

public class CircularLinkedList {

	public Node insertNodeAtEndOfCircularLinkedList(Node root, int data) {
		Node node = Node.createNode(data);
		if (root == null) {
			node.next = node;
			return node;
		}
		Node temp = root.next;
		while (temp.next != root) {
			temp = temp.next;
		}
		temp.next = node;
		node.next = root;
		return root;
	}

	public int findLengthOfCircularLinkedList(Node root) {
		if (root == null) {
			return 0;
		}
		Node temp = root.next;
		int count = 1;
		while (temp != root) {
			temp = temp.next;
			count++;
		}
		return count;
	}

	public void traverseCircularLinkedList(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data + "  ");
		Node temp = root.next;
		while (temp != root) {
			System.out.println(temp.data + "  ");
			temp = temp.next;
		}
	}

	public static void main(String args[]) {
		CircularLinkedList circularObj = new CircularLinkedList();
		Node root = null;
		root = circularObj.insertNodeAtEndOfCircularLinkedList(root, 5);
		root = circularObj.insertNodeAtEndOfCircularLinkedList(root, 6);
		root = circularObj.insertNodeAtEndOfCircularLinkedList(root, -1);
		root = circularObj.insertNodeAtEndOfCircularLinkedList(root, 34);
		int count = circularObj.findLengthOfCircularLinkedList(root);
		System.out.println(count);
		circularObj.traverseCircularLinkedList(root);
	}

}

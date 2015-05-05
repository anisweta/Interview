package com.interview.linkedlist;

/**
 * 
 * @author Anisweta
 * Purpose: to carry out insertion sort
 * Logic: get each node and pass it to sorted linked list. At the end, 
 * entire linked list will be sorted,
 * Things to watch out- use "result" and pass this sorted linked list to insertInSortedWat method
 *
 */
public class InsertionSort {

	public Node insertInSortedWay(Node root, Node node) {
		if (root == null) {
			return node;
		}
		if (node.data < root.data) {
			node.next = root;
			return node;
		}
		Node temp = root.next;
		Node connect = root;
		while (temp != null) {
			if (node.data < temp.data) {
				connect.next = node;
				node.next = temp;
				break;
			}
			connect = temp;
			temp = temp.next;
		}
		if (temp == null) {
			connect.next = node;
		}
		return root;
	}

	public Node insertionSort(Node root) {
		if (root == null) {
			return null;
		}	
		Node temp = root;
		Node connect = null;
		Node result=null;
		while(temp!=null){
			connect=temp;
			temp=temp.next;
			connect.next=null;			
			result = insertInSortedWay(result, connect);
		}
		return result;		
	}

	public static void main(String args[]) {
		NodeInsertion nodeInsertionObj = new NodeInsertion();
		Node root = null;
		root = nodeInsertionObj.insertNodeAtEnd(root, 15);
		root = nodeInsertionObj.insertNodeAtEnd(root, 7);
		root = nodeInsertionObj.insertNodeAtEnd(root, 10);
		root = nodeInsertionObj.insertNodeAtEnd(root, 3);
		InsertionSort insertionSortObj = new InsertionSort();
		root = insertionSortObj.insertionSort(root);
		Traversal traversalObj = new Traversal();
		traversalObj.traverse(root);
	}

}

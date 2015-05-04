package com.interview.linkedlist;

/**
 * 
 * @author Anisweta
 * Purpose:This class consists of basic structure of a node - data and next(address of next node).
 * Methods: It has a static method creatNode which helps in creating node.
 */
public class Node {
	public int data;
	public Node next;
	
	public static Node createNode(int data){
		Node node = new Node();
		node.data=data;
		node.next=null;
		return node;
	}
}

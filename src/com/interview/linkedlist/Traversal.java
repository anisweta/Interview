package com.interview.linkedlist;

/**
 * 
 * @author Anisweta
 * Purpose: To help in traversing a linked list
 * Methods: traverse()
 * Test Cases: 
 * Things to watch out: keep traversing till end of linked list
 *
 */
public class Traversal {

	public void traverse(Node root){
		Node temp=root;
		while(temp!=null){
			System.out.println(temp.data + "  ");
			temp=temp.next;			
		}
	}
}

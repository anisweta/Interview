package com.interview.linkedlist;

/**
 * 
 * @author Anisweta
 * Logic: take prev,current and next pointers, store current next value, 
 * break connection of a node and connect it to its previous node. 
 * and then move all three nodes
 *
 */
public class Reverse {
	
	public Node reverse(Node root){
		if(root==null){
			return null;
		}
		Node prev=null;
		Node current=root;
		Node next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		return prev;
	}
	
	public static void main(String args[]){
		NodeInsertion nodeInsertionObj=new NodeInsertion();
		Reverse reverseObj= new Reverse();
		Node root=null;
	    root=nodeInsertionObj.insertNodeAtEnd(root,5);
	    root=nodeInsertionObj.insertNodeAtEnd(root,7);
	    root=nodeInsertionObj.insertNodeAtEnd(root,-1);
	    root=nodeInsertionObj.insertNodeAtEnd(root,34);
	    root=reverseObj.reverse(root);
	    Traversal traversalObj=new Traversal();
	    traversalObj.traverse(root); 
	}

}

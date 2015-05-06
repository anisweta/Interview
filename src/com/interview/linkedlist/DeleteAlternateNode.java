package com.interview.linkedlist;
/**
 * 
 * @author Anisweta
 *Purpose: to delete alternate nodes, logic is to connect current 
 *to next to next by storing connection
 */
public class DeleteAlternateNode {

	public void deleteAlternate(Node root){
		if(root==null || root.next==null){
			return;
		}
		Node temp=root;
		Node connect=null;
		while(temp!=null && temp.next!=null){
			connect=temp.next;
			temp.next=connect.next;
			temp=temp.next;
		}
	}
	
	public static void main(String args[]){
		NodeInsertion nodeInsertionObj=new NodeInsertion();
		Node root=null;
	    root=nodeInsertionObj.insertNodeAtEnd(root,5);
	    root=nodeInsertionObj.insertNodeAtEnd(root,7);
	    root=nodeInsertionObj.insertNodeAtEnd(root,-1);
	    root=nodeInsertionObj.insertNodeAtEnd(root,34);
	    DeleteAlternateNode deleteObj=new DeleteAlternateNode();
	    deleteObj.deleteAlternate(root);
	    Traversal traversalObj=new Traversal();
	    traversalObj.traverse(root);   	    
	}
}

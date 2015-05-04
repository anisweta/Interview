package com.interview.linkedlist;

/**
 * 
 * @author Anisweta
 * Purpose: to get node count
 * Methods: deleteNode() - this method removes desired node from the linked list
 * Test Cases: null, size=1,size=n,index out of range
 * Things to watch out: check for size 1,handle data not found, index out of bound scenarios
 */
public class DeleteNthNode {
	
	public Node deleteNode(Node root,int index){
		if(root==null || index<0){
			throw new IllegalArgumentException();
		}
		if(index==0){
			return root.next;
		}
		Node temp=root;Node connect=null;
		int i=0;
		while(temp!=null && temp.next!=null){
			i++;
			connect=temp;
			temp=temp.next;
			if(i==index){
				connect.next=temp.next;
				break;
			}
		}
		if(index>i){
			throw new IllegalArgumentException();
		}else{
			return root;
		}			
	}
	
	public static void main(String args[]){
		NodeInsertion nodeInsertionObj=new NodeInsertion();
		Node root=null;
	    root=nodeInsertionObj.insertNodeAtEnd(root,5);
	    root=nodeInsertionObj.insertNodeAtEnd(root,7);
	    root=nodeInsertionObj.insertNodeAtEnd(root,-1);
	    root=nodeInsertionObj.insertNodeAtEnd(root,34);
	    DeleteNthNode deleteObj=new DeleteNthNode();
	    root=deleteObj.deleteNode(root,0);
	    Traversal traversalObj=new Traversal();
	    traversalObj.traverse(root);   	    
	}

}

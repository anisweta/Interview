package com.interview.linkedlist;

/**
 * 
 * @author Anisweta Purpose: To insert a node in linked list
 *  Methods: 
 *  1) insertNodeAtEnd() - this method adds a node if root is null or iterates
 *  till the end and then adds a node.
 *  2) insertNodeAtFront() - this method adds a node at the front of the linked list,
 *  (so remember, everytime root will change).
 *  3) insertAtNthIndex() - this method will add a node to nth index
 *  Test Cases: add node at front, add node at end
 *  Things to watch out: null pointer exception if you reach end of linked list
 */
public class NodeInsertion {

	public Node insertNodeAtEnd(Node root, int data) {
		if (root == null) {
			return Node.createNode(data);
		}
		Node temp = root;
		while (temp != null && temp.next != null) {
			temp = temp.next;
		}
		temp.next = Node.createNode(data);
		return root;
	}
	
	public Node insertAtFront(Node root,int data){
		if(root==null){
			return Node.createNode(data);
		}
		Node node=Node.createNode(data);
		node.next=root;
		return node;		
	}
	
	public Node insertAtNthIndex(Node root,int index,int data){
		if(root==null || index<0){
			throw new IllegalArgumentException();
		}
		Node node=Node.createNode(data);
		if(index==0){			
			node.next=root;
			return node;
		}
		Node temp=root;
		Node connect=null;
		int i=0;
		while(temp!=null){
			i++;
			connect=temp;
			temp=temp.next;
			if(i==index){
				connect.next=node;
				node.next=temp;
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
	    root=nodeInsertionObj.insertAtNthIndex(root, 5, 20);
	    Traversal traversalObj=new Traversal();
	    traversalObj.traverse(root);   	    
	}
}

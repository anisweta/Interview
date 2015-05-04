package com.interview.linkedlist;

/**
 * 
 * @author Anisweta Purpose: To insert a node in linked list
 *  Methods: 
 *  1) insertNodeAtEnd() - this method adds a node if root is null or iterates
 *  till the end and then adds a node.
 *  2) insertNodeAtFront() - this method adds a node at the front of the linked list,
 *  (so remember, everytime root will change)
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
	
	public static void main(String args[]){
		NodeInsertion nodeInsertionObj=new NodeInsertion();
		Node root=null;
	    root=nodeInsertionObj.insertNodeAtEnd(root,5);
	    root=nodeInsertionObj.insertNodeAtEnd(root,7);
	    root=nodeInsertionObj.insertNodeAtEnd(root,-1);
	    root=nodeInsertionObj.insertAtFront(root,34);
	    Traversal traversalObj=new Traversal();
	    traversalObj.traverse(root);
	    
	    
	}
}

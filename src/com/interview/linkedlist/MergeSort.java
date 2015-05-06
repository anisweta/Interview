package com.interview.linkedlist;

/**
 * 
 * @author Anisweta
 * Split linked list into halves using front and back split and then merge using merge function
 */
public class MergeSort {
	
	public Node merge(Node node1,Node node2){
		if(node1==null){return node2;}
		if(node2==null){return node1;}
		if(node1.data<=node2.data){
			node1.next=merge(node1.next,node2);
			return node1;
		}else{
			node2.next=merge(node2.next,node1);
			return node2;
		}
	}
	
	public Node mergeSort(Node root){
		if(root==null || root.next==null){
			return root;
		}
		FrontAndBackSplit frontbackObj = new FrontAndBackSplit();
		Node back = frontbackObj.frontBackSplit(root);
		root=mergeSort(root);
		back=mergeSort(back);
		return merge(root,back);
	}
	
	public static void main(String args[]){
		NodeInsertion nodeInsertionObj=new NodeInsertion();
		Node root=null;
	    root=nodeInsertionObj.insertNodeAtEnd(root,5);
	    root=nodeInsertionObj.insertNodeAtEnd(root,7);
	    root=nodeInsertionObj.insertNodeAtEnd(root,-1);
	    root=nodeInsertionObj.insertNodeAtEnd(root,34);
	    MergeSort mergeObj=new MergeSort();
	    root=mergeObj.mergeSort(root);	    
	    Traversal traversalObj=new Traversal();
	    traversalObj.traverse(root);   	    
	}

}

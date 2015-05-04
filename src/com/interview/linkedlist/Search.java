package com.interview.linkedlist;

/**
 * 
 * @author Anisweta
 * Purpose: to get node count
 * Methods: 
 * 1) searchData() - this method looks for data in the linked list
 * 2) searchNthData()- this methods looks for index n data
 * Test Cases: null, index out of range
 * Things to watch out: handle data not found, index out of bound scenarios
 */

public class Search {
	
	public Node searchData(Node root,int data){
		if(root==null){
			throw new IllegalArgumentException();
		}
		Node temp=root;
		while(temp!=null){
			if(temp.data==data){
				return temp;
			}
			temp=temp.next;
		}
		throw new IllegalArgumentException();
	}
	
	public Node searchNthData(Node root,int index){
		if(root==null || index<0){
			throw new IllegalArgumentException();
		}
		
		int i=0;
		Node temp=root;
		while(temp!=null){
			if(i==index){
				return temp;
			}
			temp=temp.next;
			i++;
		}
		throw new IllegalArgumentException();
	}

	public static void main(String args[]){
		NodeInsertion nodeInsertionObj=new NodeInsertion();
		Search searchObj= new Search();
		Node root=null;
	    root=nodeInsertionObj.insertNodeAtEnd(root,5);
	    root=nodeInsertionObj.insertNodeAtEnd(root,7);
	    root=nodeInsertionObj.insertNodeAtEnd(root,-1);
	    root=nodeInsertionObj.insertAtFront(root,34);
	   // Node node=searchObj.searchData(root,7); 
	   // System.out.println(node.data);
	    Node node=searchObj.searchNthData(root,2); 
	    System.out.println(node.data);
	}

}

package com.interview.linkedlist;

/**
 * 
 * @author Anisweta
 * Purpose: to get node count
 * Methods: getSize() - this method returns you the size of linked list
 * Test Cases: null, size=1,size=n
 * Things to watch out: check for size 1
 */
public class Size {
	
	public int getSize(Node root){
		if(root==null){
			return 0;
		}
		Node temp=root;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;			
		}
		return count;
	}
	
	public static void main(String args[]){
		NodeInsertion nodeInsertionObj=new NodeInsertion();
		Size sizeObj=new Size();
		Node root=null;
	    root=nodeInsertionObj.insertNodeAtEnd(root,5);
	    root=nodeInsertionObj.insertNodeAtEnd(root,7);
	    root=nodeInsertionObj.insertNodeAtEnd(root,-1);
	    root=nodeInsertionObj.insertNodeAtEnd(root,34);
	    int count=sizeObj.getSize(root); 
	    System.out.println(count);
	}

}

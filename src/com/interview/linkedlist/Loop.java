package com.interview.linkedlist;

public class Loop {
	
	public boolean checkLoop(Node root){
		if(root==null){
			return false;
		}
		Node slow=root;
		Node fast=root.next;
					
		while(fast.next!=null || slow!=fast){
			slow=slow.next;
			fast=fast.next;
		}
		if(slow==fast){
			return true;
		}else
		return false;			
	}
	
	
	public int findLengthOfLoop(Node root){
		if(root==null){
			return 0;
		}
		Node slow=root;
		Node fast=root.next;
		while(fast.next!=null || slow!=fast){
			slow=slow.next;
			fast=fast.next.next;
		}
		if(slow==fast){
			int count=1;
			fast=fast.next;
			while(slow!=fast){
				fast=fast.next;
				count++;
			}
			return count;
		}
		return 0;		
	}

}

package com.interview.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Anisweta
 * Logic is to get the maximum number from end and compare 
 * that with elements moving from right to left. If element 
 * is greater than max reset max to that element and add that 
 * element to list and then return the list.
 *
 */

public class LeaderElement {
	
	public List<Integer> leaderElement(int arr[]){
		if(arr==null){
			throw new IllegalArgumentException();
		}
		List<Integer> list=new ArrayList<Integer>();
		int max=arr[arr.length-1];
		list.add(max);
		for(int i=arr.length-2;i>=0;i--){
			if(arr[i]>max){
				max=arr[i];
				list.add(arr[i]);
			}
		}
		return list;		
	}
	
	public static void main(String args[]){
		int arr[]={6,4,7,5,2,3,-1,2};
		LeaderElement obj= new LeaderElement();
		List<Integer> list = obj.leaderElement(arr);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}				
	}
}

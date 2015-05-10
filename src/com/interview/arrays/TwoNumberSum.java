package com.interview.arrays;

import java.util.HashSet;
import java.util.Set;


class Data{
	int x;
	int y;
	public Data(int x,int y){
		this.x=x;
		this.y=y;
	}
}

public class TwoNumberSum {	
	
	// method for unsorted array - logic is to check if sum-number is present in set; 
	//if yes print both else add that number
	public Data checkSum(int arr[], int sum){
		if(arr==null || arr.length<2){
			throw new IllegalArgumentException();
	    }
		Set<Integer> s= new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
			if(s.contains(sum-arr[i])){
				return new Data(arr[i],sum-arr[i]);
			}else{
				s.add(arr[i]);				
			}
		}
		throw new IllegalArgumentException();
	}
	
	//method for sorted array - logic is too add first and last number and check if 
	//that equals sum else if sum is more than move i otherwise move j
	public Data checkSum1(int arr[],int sum){
		if(arr==null || arr.length<2){
			throw new IllegalArgumentException();
	    }
		int i=0;
		int j=arr.length-1;
		while(i<j){
			if(arr[i]+arr[j]==sum){
				return new Data(arr[i],arr[j]);
			}else if(arr[i]+arr[j]>sum){
				j--;
			}
			else{
				i++;
			}
		}		
		throw new IllegalArgumentException();
		
	}
	
	public static void main(String args[]){
		int arr[]={3,2,-9,0,4,5};
		int arr1[]={0,1,2,3,4,5,6};
		int sum=5;
		TwoNumberSum obj= new TwoNumberSum();
		Data data = obj.checkSum1(arr1, sum);	
		System.out.println(data.x);
		System.out.println(data.y);
		
	}

}

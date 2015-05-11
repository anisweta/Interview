package com.interview.arrays;

/**
 * 
 * @author Anisweta
 * Logic is to increment count if the next element is same otherwise decrement it. 
 * If count becomes less than 0, reset it to 1 and make the next element as candidate 
 * for majority element. Now iterate through the array again and get the count for the candidate
 * If this count of candidate is greater than half of the array length, then return this element 
 * otherwise return exception
 * 
 *
 */
public class MajorityElement {
	
	public int majorityElement(int arr[]){
		if(arr==null){
			throw new IllegalArgumentException();
		}
		int count=1;
		int candidate=arr[0];
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]==arr[i+1]){
				count++;
			}else{
				count--;
				if(count==0){
					count=1;
					candidate=arr[i+1];
				}
			}
		}
		int counter =0;
		for(int j=0;j<arr.length;j++){
			if(arr[j]==candidate){
				counter++;
			}
		}
		if(counter>arr.length/2){
			return candidate;
		}else{
			throw new IllegalArgumentException();
		}		
	}
	
	public static void main(String args[]){
		int arr[]={2,3,2,3,2};
		int arr1[]={0,1,2,3,4,5,6};
		MajorityElement obj= new MajorityElement();
		int num = obj.majorityElement(arr);	
		System.out.println(num);		
	}

}

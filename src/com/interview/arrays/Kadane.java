package com.interview.arrays;

public class Kadane {
	class Data{
		int x;
		int y;
		public Data(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	
	//take maxSum as first element, if currentSum becomes greater than maxSum
	//then assign currentSum value to maxSum and make maxIndex same as currentIndex.
	//If currentSum becomes less than 0, then reset it to 0 and make next index as currentIndex
	public Data longestContigousSum(int arr[]){
		if(arr==null || arr.length<1){
			throw new IllegalArgumentException();
		}
		int maxSum=arr[0];
		int maxIndex=0;
		int currentSum=arr[0];
		int currentIndex=1;
		for(int i=1;i<arr.length;i++){
			currentSum+=arr[i];
			if(currentSum>maxSum){
				maxSum=currentSum;
				maxIndex=currentIndex;
			}
			if(currentSum<0){
				currentSum=0;
				currentIndex=i+1;
			}
		}
		return new Data(maxSum,maxIndex);		
	}
	
	public static void main(String args[]){
		int arr[]={3,2,-9,0,4,5};
		int arr1[]={0,1,2,3,4,5,6};
		Kadane obj= new Kadane();
		Data data = obj.longestContigousSum(arr);	
		System.out.println(data.x);
		System.out.println(data.y);
		
	}

}

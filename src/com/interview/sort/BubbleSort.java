package com.interview.sort;

public class BubbleSort {
	
	
	public void swap(int arr[],int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public void bubbleSort(int arr[]) {
		if (arr == null) {
			return;
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}	
	
	}
	
	public void display(int arr[]){
		int i =0;
		while(i<arr.length){
			System.out.println(arr[i]);
			i++;
		}
	}
	
	public static void main(String args[]){
		int arr[]={3,1,0,9,5,-8};
		BubbleSort obj= new BubbleSort();
		obj.bubbleSort(arr);
		obj.display(arr);
	}


}

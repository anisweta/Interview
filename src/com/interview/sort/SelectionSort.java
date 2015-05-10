package com.interview.sort;

public class SelectionSort {
	
	public void swap(int arr[],int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public void selectionSort(int arr[]){
		if (arr == null) {
			return;
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					swap(arr,i,j);
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
		int arr[]={-3,1,0,9,5,-8};
		SelectionSort obj= new SelectionSort();
		obj.selectionSort(arr);
		obj.display(arr);
	}

}

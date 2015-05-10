package com.interview.sort;

public class QuickSort {
	
	public void swap(int arr[],int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public void quickSort(int arr[],int low,int high){
		if(low>=high){
			return;
		}
		int pivot=selectPivot(arr,low,high);
		quickSort(arr,low,pivot-1);
		quickSort(arr,pivot+1,high);		
	}
	
	/*public int selectPivot(int arr[],int low,int high){
		if(arr==null){
			throw new IllegalArgumentException();
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
		QuickSort obj= new QuickSort();
		obj.quickSort(arr,1,6);
		obj.display(arr);
	}*/

}

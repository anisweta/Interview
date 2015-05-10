package com.interview.sort;

public class InsertionSort {
	
	public void swap(int arr[],int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public void insertionSort(int arr[]) {
		if (arr == null) {
			return;
		}
		int i,j;
		for(i=1;i<arr.length;i++){
			j=i;
			while(j>0){
				if(arr[j-1]>arr[j]){
					swap(arr,j,j-1);
					j--;
				}
				else{
					break;
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
		InsertionSort obj= new InsertionSort();
		obj.insertionSort(arr);
		obj.display(arr);
	}

}

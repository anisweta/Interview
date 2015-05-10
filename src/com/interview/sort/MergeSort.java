package com.interview.sort;

public class MergeSort {
	
	public void mergeSort(int arr[],int low,int high){
		if(low>=high){
			return;
		}
		int mid=(low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,high);
	}
	
	public void merge(int arr[],int low,int high){
		int result[]=new int[high-low+1];
		int i=low;
		int mid=(low+high)/2;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=high){
			if(arr[i]<=arr[j]){
				result[k]=arr[i];
				k++;
				i++;
			}else{
				result[k]=arr[j];
				k++;
				j++;
			}
		}
		while(i<=mid){
			result[k++]=arr[i++];
		}
		while(j<=high){
			result[k++]=arr[j++];
		}
		k=0;
		for(int a=low;a<=high;a++){
			arr[a]=result[k];
			k++;
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
		MergeSort obj= new MergeSort();
		obj.mergeSort(arr,0,5);
		obj.display(arr);
	}

}

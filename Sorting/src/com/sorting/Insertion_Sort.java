package com.sorting;

import java.util.Arrays;

public class Insertion_Sort {
	public static void main(String[] args) {
		int[] arr= {77,89};
		insert_Sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insert_Sort(int[] arr) {
		
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else
				{
					break;
				}
			}
		}
	}

}

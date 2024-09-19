package com.sorting;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	int[] arr= {77,89,123,8,90,11,2};
	select_Sort(arr);
	System.out.println(Arrays.toString(arr));
}

public static void select_Sort(int[] arr) {
	
	for(int i=0;i<arr.length;i++) {
		int last_index=arr.length-i-1;
		int start=0;
		int max_index=get_max(arr,start, last_index);
		swap(arr,max_index,last_index);
	}
	

	
}

public static void swap(int[] arr, int start,int end) {
	int temp=arr[start];
	arr[start]=arr[end];
	arr[end]=temp;
}


public static int get_max(int[] arr, int start, int end) {
	int max=start;
	for(int i=start;i<=end;i++) {
		if(arr[max]<arr[i]) {
			max=i;
		}
	}
	return max;
}
}

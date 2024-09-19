package com.searching;

public class OrderAgnostSearch {
	public static void main(String[] args) {
		
		int[] arr= {3,5,6,34,65,88,90,100};
		int[] arr1= {100,89,77,65,45,34,22,9};
		int result=order_Agnost(arr1, 34);
		System.out.println("Found at location: " +result);
	}
	
	public static int order_Agnost(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		boolean isAsc=arr[0]<arr[end];
		
		while(start<=end) {
			int mid=start+ (end-start)/2;
			
			if(target==arr[mid])
				return mid;
			
			if(isAsc==true) {
				if(target<arr[mid])
					end=mid-1;
				else
					start=mid+1;
			}else
			{
				if(target<arr[mid])
					start=mid+1;
				else
					end=mid-1;
			}
		}
		return -1;
	}

}

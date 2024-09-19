package com.searching;

public class Binary_Search {
	public static void main(String[] args) {
		int[] arr= {3,5,6,34,65,88,90,100};
		int result=bin_Search(arr, 90);
		System.out.println("Found at location: " +result);
	}
	
	public static int bin_Search(int[] arr, int target) {
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			
			
			
			int mid=start+(end-start)/2;
			
			if(target<arr[mid]) {
				end=mid-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else 
				return mid;
			
		}
		
		return -1;
	}

}

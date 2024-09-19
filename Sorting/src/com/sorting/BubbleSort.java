package com.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,9,1,4,2};
		sorting(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sorting(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				
			}
			count++;
			System.out.println("Pass "+ count + Arrays.toString(arr));
			
		}
	}
	
	
	
	public static void sort(int[] arr) {
		
			
	}

}

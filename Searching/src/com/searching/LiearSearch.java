package com.searching;

import java.util.Arrays;

public class LiearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] arr1= new int[3][];
		arr1[0] = new int[]{11, 23, 34}; // Initialize the first row
        arr1[1] = new int[]{27, 8, 7};   // Initialize the second row
        arr1[2] = new int[]{78, 100};    
		int search=78;
		
		int[] result3=search_2d(arr1, search);
		
			System.out.println(Arrays.toString(result3));
			
			
			int max11=max_2d(arr1);
			System.out.println("Max in 2d is: "+max11);

		int[] arr = { 22, 4, 33, 100, 23,90,23 };
		int result = linear_Search(arr, 23);

		int result1 = range_Search(arr, 2,2,6);
		
		int min=find_Min(arr);
		System.out.println("Min is:" +min);
		
		
		int max=find_Max(arr);
		System.out.println("Max is:" +max);
		if (result1 != -1) {
			System.out.println("Found at range: " + result);
		}

		
		String str = "Nikita";
		char target = 'r';
		if (result != -1) {
			System.out.println("Found at position: " + result);
		}

		System.out.println(Arrays.toString(str.toCharArray()));
		boolean flag = string_Search(str, target);

		if (flag == true) {
			System.out.println("Found  ");
		} else {
			System.out.println("Not Found ");
		}

	}

	public static int linear_Search(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {

				return i;

			}

		}
		return -1;

	}
	
	public static int range_Search(int[] arr, int target, int start, int end) {
		for (int i = start; i < end; i++) {
			if (arr[i] == target) {

				return i;

			}

		}
		return -1;

	}

	public static boolean string_Search(String str, char target) {

		/*
		 * for(int i=0;i<str.length();i++) { if(str.charAt(i)==target) return true; }
		 * return false; }
		 */

		for (char ch : str.toCharArray()) {
			if (ch == target)
				return true;
		}
		return false;

	}
	

	public static int find_Min(int[] arr) {

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	
	
	public static int find_Max(int[] arr) {

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	
	
	public static int[] search_2d(int[][] arr, int target) {
		
		for(int  i=0;i<arr.length;i++) {
			
			for(int j=0; j<arr[i].length;j++)
			{
				if(arr[i][j]==target)
					 return new int[]{i,j};
			}
			
		}
		return new int[] {-1,-1};
	}
	
	
public static int max_2d(int[][] arr) {
		
	int max=Integer.MIN_VALUE;
		
for(int[] max_arr:arr) {
	for(int element:max_arr) {
		if(element>max)
			max=element;
	}
}
return max;
}
}

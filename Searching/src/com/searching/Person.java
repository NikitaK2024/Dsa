package com.searching;

public class Person {
	
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{3,9,1},{3,2,7}};
		
		int max=wealth_max(arr);
		System.out.println(max);
	}
	
	static int wealth_max(int[][] arr) {
		
		int max=Integer.MIN_VALUE;
		for(int person=0;person<arr.length;person++) {
			
			int sum=0;
			for(int account=0;account<arr[person].length;account++)
			{
				sum +=arr[person][account];
			}
			if(sum>max)
				max=sum;
		}
		return max;
	}

}

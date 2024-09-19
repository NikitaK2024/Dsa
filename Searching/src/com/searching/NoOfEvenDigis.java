package com.searching;

public class NoOfEvenDigis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,345,2,6,7865,987659};
		System.out.println(findevennumber(arr));
		

	}
	
	static int findevennumber(int[] arr)
	{
		int count=0;
		for(int num:arr) {
			if(even(num))
				count++;
		}
		return count;
	}
	
	static boolean even(int num)
	{
		int even_no=digit(num);
		return even_no % 2 == 0;
	}

	
	static int digit(int num) {
		int count=0;
		
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	}
}

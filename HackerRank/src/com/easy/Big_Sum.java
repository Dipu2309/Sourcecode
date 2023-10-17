package com.easy;

import java.util.Scanner;

public class Big_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		long arr[]=new long[n],sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=obj.nextLong();
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}

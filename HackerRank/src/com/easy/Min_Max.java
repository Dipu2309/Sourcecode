package com.easy;

import java.util.Scanner;

public class Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
			arr[i]=kb.nextInt();
		int min=0,max=0;
		for(int i=0;i<=3;i++)
			min=min+arr[i];
		for(int i=1;i<=4;i++)
			max=max+arr[i];
		System.out.println(+min+" "+max);
		//System.out.println(max);
	}

}

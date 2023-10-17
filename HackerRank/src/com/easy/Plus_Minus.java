package com.easy;

import java.util.Scanner;

public class Plus_Minus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		double a=0,b=0,c=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=kb.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
				a++;
			else
				if(arr[i]<0 &&arr[i]!=0)
					b++;
				else
					c++;
		}
		System.out.println((float)a/n);
		System.out.println(b);
		System.out.println(c);
	}

}

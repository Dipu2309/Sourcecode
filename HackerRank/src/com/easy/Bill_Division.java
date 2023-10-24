package com.easy;

import java.util.Scanner;

public class Bill_Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=kb.nextInt();
		int b=kb.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
			sum=sum+a[i];
		int anna=(sum-a[k])/2;
		if(anna==b)
			System.out.println("Bon Appetit");
		else
			System.out.println(b-anna);
	}

}

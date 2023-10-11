package com.easy;

import java.util.Scanner;
class Array_Sum
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int arr[]=new int[n],sum=0;
        
        for(int i=0;i<n;i++)
            arr[i]=kb.nextInt();
        for(int i=0;i<n;i++)
            sum=sum+arr[i];
        System.out.print(sum);
    }
}
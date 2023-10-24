package com.easy;

import java.util.Scanner;

public class Min_Max_Sum {  
	  
/* Function to merge the subarrays of a[] */  
void merge(long a[], long beg, long mid, long end)    
{    
    long i, j, k;  
    long n1 = mid - beg + 1;    
    long n2 = end - mid;    
      
   /* temporary Arrays */  
        long LeftArray[] = new long[n1];  
        long RightArray[] = new long[n2];  
      
    /* copy data to temp arrays */  
    for (i = 0; i < n1; i++)    
    LeftArray[i] = a[beg + i];    
    for (j = 0; j < n2; j++)    
    RightArray[j] = a[mid + 1 + j];    
      
    i = 0; /* initial index of first sub-array */  
    j = 0; /* initial index of second sub-array */   
    k = beg;  /* initial index of merged sub-array */  
      
    while (i < n1 && j < n2)    
    {    
        if(LeftArray[i] <= RightArray[j])    
        {    
            a[k] = LeftArray[i];    
            i++;    
        }    
        else    
        {    
            a[k] = RightArray[j];    
            j++;    
        }    
        k++;    
    }    
    while (i<n1)    
    {    
        a[k] = LeftArray[i];    
        i++;    
        k++;    
    }    
      
    while (j<n2)    
    {    
        a[k] = RightArray[j];    
        j++;    
        k++;    
    }    
}    
  
void mergeSort(long a[], long beg, long end)  
{  
    if (beg < end)   
    {  
        long mid = (beg + end) / 2;  
        mergeSort(a, beg, mid);  
        mergeSort(a, mid + 1, end);  
        merge(a, beg, mid, end);  
    }  
}  
/* Function to print the array */  
void min_max_sum(long a[], int n)  
{  
    long s1=0,s2=0;
    for(int i=0;i<n-1;i++)
    	s1=a[i]+s1;
    for(int i=1;i<n;i++)
    	s2=a[i]+s2;
    System.out.println(s1+" "+s2);
}  
  
public static void main(String args[])  
{  
    //int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };
	Scanner kb=new Scanner(System.in);
    int n = 5;
    long a[]=new long[n];
    for(int i=0;i<n;i++)
    	a[i]=kb.nextInt();
    Min_Max_Sum m1 = new Min_Max_Sum();    
    m1.mergeSort(a, 0, n - 1);  
    m1.min_max_sum(a, n); 
}  
  
  }  

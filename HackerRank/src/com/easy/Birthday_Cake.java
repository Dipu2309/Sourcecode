package com.easy;

import java.util.Scanner;

public class Birthday_Cake {  
	  
/* Function to merge the subarrays of a[] */  
void merge(int a[], int beg, int mid, int end)    
{    
    int i, j, k;  
    int n1 = mid - beg + 1;    
    int n2 = end - mid;    
      
   /* temporary Arrays */  
        int LeftArray[] = new int[n1];  
        int RightArray[] = new int[n2];  
      
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
  
void mergeSort(int a[], int beg, int end)  
{  
    if (beg < end)   
    {  
        int mid = (beg + end) / 2;  
        mergeSort(a, beg, mid);  
        mergeSort(a, mid + 1, end);  
        merge(a, beg, mid, end);  
    }  
}  
/* Function to print the array */  
void birthDaycake(int a[], int n)  
{  
    int i,count=0;  
    int temp=a[n-1];
    for(i=0;i<n;i++)
    {
    	if(temp==a[i])
    		count++;
    }
    System.out.println(count);
}  
  
public static void main(String args[])  
{  
    //int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };
	Scanner kb=new Scanner(System.in);
    int n = kb.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    	a[i]=kb.nextInt();
    Birthday_Cake m1 = new Birthday_Cake();  
    m1.mergeSort(a, 0, n - 1);  
    m1.birthDaycake(a, n);  
}  
  
  }  

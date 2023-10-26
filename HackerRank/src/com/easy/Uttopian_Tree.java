package com.easy;

import java.util.Scanner;
class Solution
{
    public static void main(String args[])
    {
        Scanner kb=new Scanner(System.in);
        int t=kb.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=kb.nextInt(),h=0;
            
                for(int j=0;j<=n;j++)
                {
                    if(h%2==0)
                    h++;
                    else
                    h=2*h;
                }
          
            System.out.println(h);
           
        }
    }
}


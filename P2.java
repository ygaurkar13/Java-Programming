class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        long i=A.length;
        long j=B.length;
                           //equality by length of the arrays..
                if(i!=j)
                return false;
                
            //Sorting both arrays
            Arrays.sort(A);
            Arrays.sort(B);
        
        //to compare both the arrays elements simultenously..in linear fashion
        for(int n=0;n<i;n++)
        
            if (A[n]!=B[n])
            return false;
            
            return true;
        
        
    }
}


import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);

		long t=sc.nextLong();

		while(t-->0)
		{
		  int n=sc.nextInt();
		  long arr[]=new long[n];
		  long brr[]=new long[n];

		  for(int i=0;i<n;i++)
		  {
		      arr[i]=sc.nextLong();
		  }

		  for(int i=0;i<n;i++)
		  {
		      brr[i]=sc.nextLong();
		  }
		  Solution ob = new Solution();
		  System.out.println(ob.check(arr,brr,n)==true?"1":"0");


		}
	}
}
//

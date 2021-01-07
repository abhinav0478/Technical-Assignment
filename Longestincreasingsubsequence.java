package pattern.matching;
import java.util.*;
public class Longestincreasingsubsequence {
	/* Dynamic Programming Java implementation 
	of LIS problem */
	public static void main(String...s)
	{
		int A[] = { 10, 22, 9, 33, 21, 50, 41, 60,70,80,90 }; 
			int n = A.length; 
			int value = lis( A, n )  ;
			System.out.println("The Longest Increasing Subsequence:" + value);
	}
		/* lis() returns the length of the longest 
		increasing subsequence in arr[] of size n */
		static int lis(int arr[],int n) 
		{ 
			if(arr.length<1)//if length of arr is below 0 then it is invalid
			{
				System.out.println("Invalid");
				return -1;
			}
			if(arr.length>2500)//if length of arr is greater than 2500 than its invalid
			{
				System.out.println("Invalid");
				return -1;
			}
			int lis[] = new int[n]; 
			int i,j,max = 0; 

			/* Initialize LIS values for all indexes */
			for ( i = 0; i < n; i++ ) 
				
				{lis[i] = 1; }

			/* Compute optimized LIS values in 
				bottom up manner */
			for ( i = 1; i < n; i++ ) 
				{for ( j = 0; j < i; j++ ) 
				{				
					if(arr[i]<1 || arr[i]>2000)//if value of element of arr is below 0 or above 2000 then it is invalid
					{
						System.out.println("Invalid");
						return -1;
					}	
					if ( arr[i] > arr[j] && 
									lis[i] < lis[j] + 1) 
						lis[i] = lis[j] + 1; }}

			/* Pick maximum of all LIS values */
			for ( i = 0; i < n; i++ ) 
				if ( max < lis[i] ) 
					max = lis[i]; 
				return max; 
		}  
	} 


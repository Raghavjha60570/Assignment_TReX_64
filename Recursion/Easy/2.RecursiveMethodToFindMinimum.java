import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
	   int n= sc.nextInt();
	   
		int a[]= new int[n];
		for(int i=0 ; i<n ;i++){
		    a[i]= sc.nextInt();
		}
       System.out.println(findMin(a ,n));
       
	}
	
	public static int findMin(int a[] , int n ){
	    if(n==1){
	        return a[n];
	        
	    }
	    return Math.min(a[n-1], findMin(a , n-1));
	    
	}
}


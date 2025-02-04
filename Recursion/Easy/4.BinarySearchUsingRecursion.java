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
	   int start=0;
	   int end=n-1;
	   int target =sc.nextInt();
		int a[]= new int[n];
		for(int i=0 ; i<n ;i++){
		    a[i]= sc.nextInt();
		}
		int result=binarySearch(a,target, start ,end);
		System.out.println(result);
          
	}
	
	public static int binarySearch(int a[] , int target ,int start , int end ){
	    int mid=start+(end-start)/2;
	 
	   
	    if(a[mid]>target){
	        
	        return binarySearch(a , target , start ,mid);
	    
	        
	    } else if(a[mid]<target){
	        
	        return binarySearch(a,target ,mid+1 , end );
	     }
	   return mid;
	    
	}
}

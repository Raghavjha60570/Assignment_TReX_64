import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
	
		int a[]= new int[5];
		for(int i=0 ; i<5 ;i++){
		    a[i]= sc.nextInt();
		}
		printTriangle(a);
	}
	
	public static void printTriangle(int a[]){
	    
	    if(a.length==1){
	        System.out.println(Arrays.toString(a));
	        return;
	        
	    }
	    
	    int temp[]= new int[a.length-1];
	    for(int i=0 ; i<a.length-1 ; i++){
	        temp[i]=a[i]+a[i+1];
	    }
	    
	    printTriangle(temp);
	    
	    System.out.println(Arrays.toString(a));
	}
}


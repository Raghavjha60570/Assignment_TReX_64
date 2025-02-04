import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
	    String a= sc.next();
	    int n=0;
		searchUpperCase(a ,n );
		
          
	}
	
	public static void  searchUpperCase(String a ,int n ){
	    
	    if(n==a.length()){
	        System.out.println("No UpperCase Letter Found");
	        return;
	        
	    }
	    
	    
	     if(Character.isUpperCase(a.charAt(n))){
	         System.out.println(a.charAt(n));
	         return;
	     }
	     
	     searchUpperCase(a, n+1);
	}
}

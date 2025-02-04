import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner (System.in);
	    int n=sc.nextInt();
	   
	    System.out.println(fibo(n));
          
	}
	
	public static int  fibo( int n ){
	   if(n==0){
	       return 0;
	   }else if(n==1){
	       return 1;
	   }
	   
	   return fibo(n-1)+fibo(n-2);
	}
}

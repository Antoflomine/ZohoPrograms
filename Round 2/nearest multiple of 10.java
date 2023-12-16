// Java Code for Round the given number 
// to nearest multiple of 10

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt(); //4722 ->4720 4730
	    
	   int a=(n/10)*10;//4720  4722-4720=2 n-a=2
	   int b=a+10;//4730   4730-4722=7  b-n=7
	 
	   if(n-a<b-n){
	       System.out.print(a);
	   }
	   else{
	       System.out.print(b);
	   }
		
	}
}

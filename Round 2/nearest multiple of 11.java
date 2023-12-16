   

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt(); //4722 ->4720 4730
	    
	   int a=(n/10)*11;
	   int b=a+11;
	 
	   if(n-a<b-n){
	       System.out.print(a);
	   }
	   else{
	       System.out.print(b);
	   }
		
	}
}

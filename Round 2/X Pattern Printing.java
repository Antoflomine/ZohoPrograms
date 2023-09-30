import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	   int n=sc.nextInt();
	   int[][] arr=new int[n][n];
	   
	   int m=(n+1)/2;
	   for(int i=0;i<n;i++){
	       for(int j=0;j<n;j++){
	           if(i==j){
	               if(i<m){
	                   System.out.print(n-i);
	               }
	               else{
	                     System.out.print(i+1);
	               }
	           }
	           else if(i+j==n-1){
	               if(i<m){
	                   System.out.print(i+1);
	               }
	               else{
	                   System.out.print(j+1);
	               }
	               
	           }
	           else{
	               System.out.print(" ");
	           }
	       }
	       System.out.println();
	   }
		System.out.println("Hello World");
	}
}

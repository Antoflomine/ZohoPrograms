import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int n=str.length();
	    char arr[][]=new char[n][n];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(i==j){
	                System.out.print(str.charAt(i));
	            }
	           else if(i+j==n-1 && i!=j){
	                System.out.print(str.charAt(j));
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	    
	}
}

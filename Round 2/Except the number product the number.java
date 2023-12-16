// Except the number product the number
// 4
// 1 2 3 4

// 24 12 8 6

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n]; 
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	  
	    for(int i=0;i<n;i++){ 
	          int product=1;  
	        for(int j=0;j<n;j++){ 
	            if(i!=j){
	                product*=arr[j]; 
	            }
	            
	        }
	        
	        System.out.print(product+" "); 
	    }
	    
		
	}
}

// 5

// 1 
// 1 2 1
// 1 2 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n =sc.nextInt();
	    
	    
	    for(int i=0;i<n;i++){
	        int c=1;
	        for(int j=0;j<=i;j++){
	            System.out.print(c);
	            c++;
	        }
	        
	        if(i>=1){
	            for(int j=i;j>=1;j--){
	                System.out.print(j);
	            }
	        }
	        System.out.println();
	    }
	}
}

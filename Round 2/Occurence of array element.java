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
	    int[] f=new int[n];
	    int visited=-1;
	    
	    for(int i=0;i<n;i++){
	        int c=1;
	        for(int j=i+1;j<n;j++){
	            if(arr[i]==arr[j]){
	                c++;
	                f[j]=visited;
	            }
	        }
	        if(f[i]!=visited){
	            f[i]=c;
	        }
	    }
	    for(int i=0;i<n;i++){
	        if(f[i]!=visited && i==0){
	            System.out.print(arr[i]+"("+f[i]+")");
	            
	        }
	        
	        if(f[i]!=visited && i!=0){
	            System.out.print(","+arr[i]+"("+f[i]+")");
	        }
	        
	    }

	}
}

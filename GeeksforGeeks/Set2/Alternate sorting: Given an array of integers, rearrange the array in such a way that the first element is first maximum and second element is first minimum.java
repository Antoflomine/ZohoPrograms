import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int k=0;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int j=n-1;j>=n/2;j--){
		    System.out.print(arr[j]);
		    if(k==j){
		    break;
		    }
		    else{
		    System.out.print(arr[k]);
		    k++;
		    }
		    
		}
	}
}

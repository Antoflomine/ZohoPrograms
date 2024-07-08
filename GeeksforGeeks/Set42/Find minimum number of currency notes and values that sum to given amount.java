import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   
	    int amount=sc.nextInt();
	    int[] arr=new int[]{2000,500,200,100,50,20,10,5,1};
	    int[] c=new int[9];
	    for(int i=0;i<9;i++){
	        if(amount>=arr[i]){
	            c[i]=amount/arr[i];
	            amount=amount%arr[i];
	        }
	    }
	    for(int i=0;i<9;i++){
	        if(c[i]!=0){
		System.out.println(arr[i]+" "+c[i]);
	        }
	    }
	}
}

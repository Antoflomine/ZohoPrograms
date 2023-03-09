
// Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
//     1. 5 if a perfect square
//     2. 4 if multiple of 4 and divisible by 6
//     3. 3 if even number

// And sort the numbers based on the weight and print it as followsimport java.util.*;

public class Main

{
    static boolean perfectSquare(int h){
        for(int i=1;i*i<=h;i++){
            if(h%i==0 && h/i==i){
                return true;
            }
           
        }
         return false;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    int[] w1=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	       
	    }
	    //int w=0;
	    for(int i=0;i<n;i++){
	        	    int w=0;

	         if(perfectSquare(arr[i])){
	             w+=5;
	           
	        }
	         if(arr[i]%4==0 && arr[i]%6==0){
	            w+=4;
	           
	        }
	        if((arr[i]%2)==0){
	            w+=3;
	            
	            
	        }
	       // System.out.println("<"+arr[i]+","+w+">");
	       // w=0;
	       w1[i]=w;
	    }
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	        if(w1[i]>w1[j]){
	             int tp=w1[i];
	            int t=arr[i];
	           w1[i]=w1[j];
	            arr[i]=arr[j];
	            w1[j]=tp;
	            arr[j]=t;
	        }
	            
	        }
	    }
	    for(int i=0;i<n;i++){
	        System.out.println(arr[i]+"-"+w1[i]);
	    }
	    //System.out.print(Arrays.toString(w1));	        

	
	
}
}

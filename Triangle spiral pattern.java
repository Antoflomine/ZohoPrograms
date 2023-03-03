import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=7;
	    int arr[][]=new int[n][n];
	    int count=1;
	    int col=0,row=0;
	    int flag=1;
	    while(count<=n*4){
	  
	        while(row<n && arr[row][col]==0){
	            arr[row++][col]=count++;
	        }
	        row--;
	        col++;
	        while((row>=flag && col>=flag) &&  arr[row][col]==0){
	            arr[row--][col]=count++;
	        }
	         col++;
	       row++;
	        row++;
	     
	      flag++; 
	      flag++;
	         //System.out.println(col+" "+row+" "+flag);
	      
	      
	
	   }
	     for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]!=0){
                System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
	}
}

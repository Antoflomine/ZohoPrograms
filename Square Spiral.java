import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = 5;
	    int arr[][]=new int[n][n];
	    int row=0,col=-1;
	    int count=1;
	    while(count<=(n*n)){
	    col++;
            while(col<n && arr[row][col]==0) arr[row][col++]=count++;
            col--;
           row++;
           while( row<n && arr[row][col]==0 ){
               arr[row++][col]=count++;
           }
           row--;
           col--;
         while(col>=0 && arr[row][col]==0 ){
             arr[row][col--]=count++;
         }
         row--;
         col++;
         while( row>=0 && arr[row][col]==0 ){
             arr[row--][col]=count++;
         }
         row++;
     
           


	    }
	      for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	   // System.out.print(Arrays.deepToString(arr));
	}
}

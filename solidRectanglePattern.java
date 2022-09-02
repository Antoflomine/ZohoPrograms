
public class Main
{
	public static void main(String[] args) {
		int n=4;
		int s=(n*2)-1;
		int front=0;
		int end=s-1;
		int arr[][]=new int[s+1][s+1];
		while(n!=0){
		    for(int i=front;i<=end;i++){
		        for(int j=front;j<=end;j++){
		            if(i==front || j==front || i==end || j==end){
		                arr[i][j]=n;
		            }
		        
		        }
		       
		    }
		    n--;
		    front++;
		    end--;
		}
		for(int i=0;i<s;i++){
		    for(int j=0;j<s;j++){
		        System.out.print(arr[i][j]);
		    }
		    System.out.println();
		}
	}
}

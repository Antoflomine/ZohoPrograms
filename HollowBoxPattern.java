
public class Main
{
	public static void main(String[] args) {
		int n=4;
		int s=(n*2)-1;
            for(int i=0;i<s;i++){
		        for(int j=0;j<s;j++){
		            if(i==0 || j==0 || i==s-1 || j==s-1){
		               System.out.print("*");
		            }
		            else{
		                System.out.print(" ");
		            }
		        
		        }
		        System.out.println();
		       
		    }
	
	}
}

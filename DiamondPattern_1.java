

public class DiamondPattern_1
{
	public static void main(String[] args) {
	    String str="racecar";
	    int n=str.length();
	    int l=n/2;
	    int r=l;
	    boolean b=true;
	    
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(j==l || j==r){
	                System.out.print(str.charAt(j)+" ");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	    
	    if(l==0) b=false;
	    if(b){ l--;r++;}
	    else{ l++;r--;}
	    System.out.println();
	    }
	}
}

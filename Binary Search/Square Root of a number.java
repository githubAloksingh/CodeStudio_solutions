import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		 int ans=0;
		 for(int i=0;i<=N;i++){
			 if(i*i<=N){
			  ans=i;
			 }
			 else{
				 break;
			 }
		 }
		 
		 return ans;
	}
}

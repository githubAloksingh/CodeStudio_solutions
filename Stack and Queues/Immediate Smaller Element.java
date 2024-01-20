public class Solution {
    public static void immediateSmaller(int []a) {
        // Write your code here.
        int n=a.length;
        for(int i=0;i<n-1;i++){
            if(a[i]<a[i+1]){
                a[i]=-1;
            }
            else{
                a[i]=a[i+1];
            }
        }
        a[n-1]=-1;
    }
}





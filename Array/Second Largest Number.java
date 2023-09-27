public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max)         
            max=a[i];
            if(a[i]<min)
            min=a[i];
        }
        for(int i=0;i<n;i++){
            if(a[i]>secondMax && a[i]!=max){
                secondMax=a[i];
            }
           
            if(a[i]<secondMin && a[i]!=min)
            secondMin=a[i];
        }
        return new int[]{secondMax,secondMin};
    }
}

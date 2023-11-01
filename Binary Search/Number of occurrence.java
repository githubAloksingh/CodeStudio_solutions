public class Solution {
    public static int count(int arr[], int n, int x) {
       
        int f=first(arr,n,x);
        if(f==-1)
        return 0;
        int l=last(arr,n,x);
        int c=l-f+1;
        return c;
    }

      public static int first(int arr[],int n,int x){
           int low=0;
            int high=n-1;
            int ans =-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]==x){
                    ans=mid;
                    high=mid-1;
                }
                else if(arr[mid]>x){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return ans;
        }

        
       public static int last(int arr[],int n,int x){
           int low=0;
            int high=n-1;
            int ans =-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]==x){
                    ans=mid;
                    low=mid+1;
                }
                else if(arr[mid]>x){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return ans;
        }
}

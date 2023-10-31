public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
             for (int i = 0; i < n; i++) {
            if (arr[i] >= x) {
                // lower bound found:
                return i;
            }
        }
        return n;
    }
    }



public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        //Write your code here
             int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
                }
                else if (arr[mid]>x){
                    high=mid-1;
                    
                } 
            else {
                low = mid + 1; 
            }
        }
        return ans;
    }
}

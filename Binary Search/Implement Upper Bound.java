public class Solution {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                // upper bound found:
                return i;
            }
        }
        return n;
    }
    }


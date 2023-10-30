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

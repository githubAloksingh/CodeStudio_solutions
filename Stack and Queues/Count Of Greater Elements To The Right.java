public class Solution {
    public static int[] countGreater(int[] arr, int[] query) {
        int[] ans = new int[query.length];
        int n = query.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            int valueCheck = query[i];
            int val = search(arr, i, count, valueCheck);
            ans[i] = val;
        }
        return ans;
    }

    public static int search(int[] arr, int i, int count, int valueCheck) {
        int valueCheck1=arr[valueCheck];
        for (int j = valueCheck+1; j < arr.length; j++) {
            if (arr[j] > valueCheck1) {
                count++;
            }
        }
        return count;
    }
}

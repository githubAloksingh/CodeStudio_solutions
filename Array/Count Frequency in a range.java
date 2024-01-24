import java.util.HashMap;
public class Solution {
    public static int[] countFrequency(int n, int x, int[] nums) {
        int[] count = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>(); 
      for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
        }
      for (int i = 1; i <= n; i++) {
            count[i - 1] = map.getOrDefault(i, 0); 
        }
      return count;
    }
}

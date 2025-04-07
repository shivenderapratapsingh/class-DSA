package SlidingWindow;

import java.util.HashMap;

public class distict {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;

      
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];
        }

        long maxsum = 0;
        if (map.size() == k) {
            maxsum = sum;
        }

        
        for (int i = k; i < nums.length; i++) {
          
            int out = nums[i - k];
            map.put(out, map.get(out) - 1);
            if (map.get(out) == 0) {
                map.remove(out);
            }

           
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            sum += nums[i] - out;

            if (map.size() == k) {
                maxsum = Math.max(maxsum, sum);
            }
        }

        return maxsum;
    }
}

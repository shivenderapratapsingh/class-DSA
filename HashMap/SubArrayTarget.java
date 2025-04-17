package HashMap;

import java.util.HashMap;

public class SubArrayTarget {


    public static int countSubarrays(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;

           
            if (map.containsKey(currentSum - target)) {
                count += map.get(currentSum - target);
            }

           
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, -1, 1, 2, -3, 1, 1, 1};
        int target = 3;

        int result = countSubarrays(arr, target);
        System.out.println("Number of subarrays with sum = " + target + " is: " + result);
    
}

}

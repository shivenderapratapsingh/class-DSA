package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencySort {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 3, 2};

        // Step 1: Frequency map
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a frequency-based sorted array
        Integer[] result = new Integer[nums.length];
        int index = 0;

        // Sort by frequency and then by value (descending if same frequency)
        while (!freq.isEmpty()) {
            int minFreq = Integer.MAX_VALUE;

            // Find the element with the smallest frequency
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                int currentFreq = entry.getValue();
                if (currentFreq < minFreq) {
                    minFreq = currentFreq;
                }
            }

            // For each element with the same frequency, add it to the result
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                if (entry.getValue() == minFreq) {
                    for (int i = 0; i < entry.getValue(); i++) {
                        result[index++] = entry.getKey();
                    }
                    freq.remove(entry.getKey());
                }
            }
        }

        // Step 3: Copy back to the original array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }

        // Output the result
        System.out.println(Arrays.toString(nums));
    }
}

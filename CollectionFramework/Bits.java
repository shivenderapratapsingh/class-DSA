package CollectionFramework;

import java.util.*;

public class Bits {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 3, 8, 7, 6, 4);

        // Sort by number of set bits (ascending order)
        Collections.sort(nums, (a, b) -> Integer.bitCount(a) - Integer.bitCount(b));

        System.out.println(nums);  // Output: [3, 5, 6, 7, 4, 8]
    }
}


import java.util.*;
public class Question18 {

    public int findMaximumXOR(int[] nums) {
        int ans = 0;
        int mask = 0;

        for (int i = 31; i >= 0; i--) {
            mask = mask | (1 << i);

            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num & mask);
            }

            int temp = ans | (1 << i);

            for (int prefix : set) {
                if (set.contains(prefix ^ temp)) {
                    ans = temp;
                    break;
                }
            }
        }

        return ans;
    }
}



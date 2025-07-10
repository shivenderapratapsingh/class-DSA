import java.util.*;
public class Question6 {
   

 
    public void nextPermutation(int[] nums) {
        // Step 1: Convert array to list
        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);

        // Step 2: Perform logic on list
        int idx = -1;
        for (int i = list.size() - 2; i >= 0; i--) {
            if (list.get(i) < list.get(i + 1)) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            Collections.reverse(list);
        } else {
            for (int i = list.size() - 1; i > idx; i--) {
                if (list.get(i) > list.get(idx)) {
                    Collections.swap(list, i, idx);
                    break;
                }
            }
            Collections.reverse(list.subList(idx + 1, list.size()));
        }

        // Step 3: Copy back to array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    }
}





import java.util.HashMap;
import java.util.Stack;

public class Question25 {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            HashMap<Integer, Integer> map = new HashMap<>();
            Stack<Integer> hs = new Stack<>();
            
            for (int i = nums2.length - 1; i >= 0; i--) {
                int element = nums2[i];
                
                // ✅ FIX #1: Change condition to check before accessing peek
                while (!hs.isEmpty() && hs.peek() <= element) {
                    hs.pop();
                }
    
                // ✅ FIX #2: Fix this block logic only
                if (hs.isEmpty()) {
                    map.put(element, -1);
                } else {
                    map.put(element, hs.peek());
                }
    
                hs.push(element);
            }
    
            int[] ans = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                ans[i] = map.get(nums1[i]);
            }
    
            return ans;
        }
    }
    
        public static void main(String[] args) {

            
        }
    
}

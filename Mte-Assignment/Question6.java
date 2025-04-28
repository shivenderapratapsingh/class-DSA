import java.util.HashMap;
import java.util.Map;
public class Question6 {
    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();

        for (int right = 0; right < arr.length; right++) {
            int idx = map.getOrDefault(arr[right], -1);

            if (idx != -1 && idx >= left) {
                res = Math.max(res, right - left);
                left = idx + 1;
            }

            map.put(arr[right], right); // Update latest index
        }

        // Final check after loop ends
        res = Math.max(res, arr.length - left);

        return res;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }

}



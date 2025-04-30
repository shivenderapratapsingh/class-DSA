import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
public class Question6 {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int maxlen=0;
        int right=0;
        int left=0;
        while(right<s.length()){
            char c=s.charAt(right);
            if(hs.contains(c)){
                hs.remove(s.charAt(left));
                left++;
            }
            else{
                maxlen=Math.max(maxlen,right-left+1);
                hs.add(c);
                right++;
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }

}



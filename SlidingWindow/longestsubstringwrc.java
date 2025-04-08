package SlidingWindow;

import java.util.HashSet;

public class longestsubstringwrc {
     public int lengthOfLongestSubstring(String s) {
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
}

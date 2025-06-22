package String;
public class LongestRepeatingCharacter {
    public int characterReplacement(String s, int k) {
        int [] occurence=new int [26];
        int left=0;
        // int right=0;
        int maxcount=0;
        int maxlength=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            int idx=c-'A';
            occurence[idx]++;
            maxcount=Math.max(maxcount,occurence[idx]);
            if(right-left+1-maxcount>k){
                occurence[s.charAt(left)-'A']--;
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
    
}

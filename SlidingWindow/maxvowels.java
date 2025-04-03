package SlidingWindow;

public class maxvowels {
    public boolean isvowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
               return true;
           }
           return false;
   }
   public int maxVowels(String s, int k) {
       int count=0;
       for(int i=0;i<k;i++){
           char ch=s.charAt(i);
           if(isvowel( ch)) count++;

       }
       int max=count;
       for(int i=k ;i<s.length();i++){
           char new_ch=s.charAt(i);
           char old_ch=s.charAt(i-k);
           if(isvowel(old_ch)) count--;
           if(isvowel(new_ch)) count++;
           max=Math.max(max,count);
       }
       return max;
   }
}

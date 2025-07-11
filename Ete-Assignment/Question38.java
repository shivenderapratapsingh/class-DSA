import java.util.Arrays;

public class Question38 {
        public int findContentChildren(int[] g, int[] s) {
        int ans=0;
        int l=0;
        int r=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l<g.length && r<s.length){
            if(g[l]<=s[r]){
                ans++;
                l++;
                r++;
            }
            else{
                r++;
            }
        }
        return ans;
    }
}

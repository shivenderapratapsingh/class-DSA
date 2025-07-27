import java.util.Arrays;
public class Question11 {

  
    public String longestCommonPrefix(String[] strs) {
        StringBuilder st=new StringBuilder();
        Arrays.sort(strs);
        char [] first=strs[0].toCharArray();
        char [] second=strs[strs.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i]!= second[i]) break;
                st.append(first[i]);
            
        }
        return st.toString();

    }
    public static void main(String[] args) {
        Question9 q = new Question9();
        String[] strs = {"flower", "flow", "flight"};
        String result = q.longestCommonPrefix(strs);
        System.out.println("The longest common prefix is: " + result);
}
}




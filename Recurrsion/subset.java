package Recurrsion;
public class subset {
    static void sub(String s,String curr,int index){
        if(index==s.length()){
            System.out.println(curr);
            return;
        }
        sub(s, curr, index + 1);
        sub(s, curr + s.charAt(index), index + 1);
        
    }
    public static void main(String[] args) {
        String s = "abc";
        sub(s, "", 0);
    }
}

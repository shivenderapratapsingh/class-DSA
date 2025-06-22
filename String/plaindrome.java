package String;

public class plaindrome {
    public static boolean check(String s){
        boolean ans=true;
        s=s.toLowerCase();
        int i=0;
        int l=s.length()-1;
        while(i<=l){
            if(s.charAt(i)==s.charAt(l)){
                ans=true;
            }
            else{
                return false;
            }
            i++;
            l--;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(check("mo"));
    }
    
}

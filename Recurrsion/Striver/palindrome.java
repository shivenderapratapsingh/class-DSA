package Striver;

public class palindrome {
    public static boolean pal(int n,String s,int size){
        if(n>=size/2) return true;
        if(s.charAt(n) !=s.charAt(size-n-1)) return false;
       return pal(n+1, s, size);
    }

    public static void main(String[] args) {
        String s="MAM";
        int size=s.length();
        System.out.println(pal(0, s, size));
    }

    
}

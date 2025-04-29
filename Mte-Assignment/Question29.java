public class Question29 {
    public static boolean palindrome(int n){
        int sum=0;
        int c=n;
        while(c>0){
            int r=c%10;
            sum=r+(sum*10);
            c=c/10;
        }
        if(sum==n) return true;
        return false;
    }
    public static void main(String[] args) {
        int n=121;
        if(palindrome(n)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}

package Recurrsion;

public class printn {
   public static  void pr(int n){
        if(n==0) return;
        pr(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
       pr(5);
    }
    
}

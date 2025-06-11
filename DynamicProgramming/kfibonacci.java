public class kfibonacci {
    public static int fib(int n,int k){
        if(n<=k) return 1;
        int [] dp=new int[n+1];
        for(int i=0;i<k;i++){
            dp[i]=1;
        }
        
        for(int i=k;i<=n;i++){
            for(int j=1;j<=k;j++){
                dp[i]+=dp[i-j];
            }
            if(i==n) return dp[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(fib(7, 6));
    }
}

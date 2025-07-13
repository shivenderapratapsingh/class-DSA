

public class Question33 {
    public static int clim(int n){
        if(n==1) return 1;
        int [] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}


// import java.util.Arrays;

// public class climbingstairmemo {
//        public int climbStairs(int n) {
//         int[] arr = new int[n + 1];
//         Arrays.fill(arr, -1);
//         return climb(n, arr);
//     }

//     public int climb(int n, int[] memo) {
//         if (memo[n] != -1) {
//             return memo[n];
//         }
//         if (n == 0 || n == 1 || n == 2) {
//             memo[n] = n;
//             return memo[n];
//         }
//         memo[n] = climb(n - 1, memo) + climb(n - 2, memo);
//         return memo[n];
//     }
// }

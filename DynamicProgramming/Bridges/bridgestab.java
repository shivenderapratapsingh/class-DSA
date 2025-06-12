package Bridges;

public class bridgestab {
    
    public static int maxBridges(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i - 1] == b[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

 
        return dp[n][m];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        int[] b = {1, 2, 1, 2, 1};
        System.out.println(maxBridges(a, b)); 
    }
}

    


package Bridges;
public class bridgesmemo {
    public static int maxBridges(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[][] memo = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                memo[i][j] = -1;
            }
        }

        return maxBridgesutility(a, b, n, m, memo);
    }

    public static int maxBridgesutility(int[] a, int[] b, int n, int m, int[][] memo) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (memo[n][m] != -1) {
            return memo[n][m];
        }

        if (a[n - 1] == b[m - 1]) {
            memo[n][m] = 1 + maxBridgesutility(a, b, n - 1, m - 1, memo);
        } else {
            memo[n][m] = Math.max(
                maxBridgesutility(a, b, n - 1, m, memo),
                maxBridgesutility(a, b, n, m - 1, memo)
            );
        }

        return memo[n][m];
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        int[] b = {1, 2, 1, 2, 1};
        System.out.println(maxBridges(a, b)); // Output: 3
    }
    
}

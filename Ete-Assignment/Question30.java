public class Question30 {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        // Every single character is a palindrome of length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Build the DP table
        for (int L = 2; L <= n; L++) {
            for (int i = 0; i <= n - L; i++) {
                int j = i + L - 1;

                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }

        return dp[0][n - 1];
    }
}

// class Solution {
//     int[][] dp = new int[1001][1001];

//     public int LPS(String s, int i, int j) {
//         if (i > j) return 0;
//         if (i == j) return 1;

//         if (dp[i][j] != -1) return dp[i][j];

//         if (s.charAt(i) == s.charAt(j)) {
//             return dp[i][j] = 2 + LPS(s, i + 1, j - 1);
//         } else {
//             return dp[i][j] = Math.max(LPS(s, i + 1, j), LPS(s, i, j - 1));
//         }
//     }

//     public int longestPalindromeSubseq(String s) {
//         int m = s.length();
        
//         // Initialize dp array with -1
//         for (int[] row : dp) {
//             Arrays.fill(row, -1);
//         }

//         return LPS(s, 0, m - 1);  // Approach 1: Top-down DP
//     }
// }




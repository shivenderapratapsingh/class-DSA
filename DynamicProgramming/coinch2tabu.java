public class coinch2tabu {
    //memorization
    public static int coinchange(int[] coins, int target) {
      
        int[][] memo = new int[coins.length + 1][target + 1];
        for (int i = 0; i <= coins.length; i++) {
            for (int j = 0; j <= target; j++) {
                memo[i][j] = -1; 
            }
        }
        return countWays(coins, coins.length, target, memo);
    }
    public static int countWays(int[] coins, int n, int target, int[][] memo) {
        if (target == 0) return 1; // Base case: one way to make change for 0
        if (n == 0 || target < 0) return 0; // No coins left or target is negative

        if (memo[n][target] != -1) return memo[n][target]; // Return cached result

        // Include the coin at index n-1 or exclude it
        int includeCoin = countWays(coins, n, target - coins[n - 1], memo);
        int excludeCoin = countWays(coins, n - 1, target, memo);

        memo[n][target] = includeCoin + excludeCoin; // Store result in memoization table
        return memo[n][target];
    }


    
    
}

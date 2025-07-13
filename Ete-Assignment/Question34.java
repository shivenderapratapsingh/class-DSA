public class Question34 {
    public int coinChange(int[] coins, int amount) {
    // Edge case: if amount is less than 1, no coins needed
    if (amount < 1) return 0;

    // DP array: minCoinsDP[i] stores the minimum coins needed for amount 'i'
    int[] minCoinsDP = new int[amount + 1];

    // Initialize the DP array
    for (int i = 1; i <= amount; i++) {
        minCoinsDP[i] = Integer.MAX_VALUE;

        // Try each coin for the current amount 'i'
        for (int coin : coins) {
            if (coin <= i && minCoinsDP[i - coin] != Integer.MAX_VALUE) {
                minCoinsDP[i] = Math.min(minCoinsDP[i], 1 + minCoinsDP[i - coin]);
            }
        }
    }

    // If no valid coin combination found, return -1
    return (minCoinsDP[amount] == Integer.MAX_VALUE) ? -1 : minCoinsDP[amount];
}

}

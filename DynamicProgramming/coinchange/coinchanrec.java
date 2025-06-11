package CoinChange;

public class coinchanrec {
    public static int count(int coins[], int sum) {
        return countRec(coins, coins.length, sum);
        
    }

    private static int countRec(int coins[], int n, int sum) {
        if (sum == 0) return 1;
        if (n == 0) return 0;
        if (sum < 0) return 0;

        return countRec(coins, n - 1, sum) + countRec(coins, n, sum - coins[n - 1]);
    }
    public static void main(String[] args) {
        int coins[] = {1, 2, 3};
        int sum = 4;
        System.out.println("Number of ways to make change: " + count(coins, sum));
    }

}
    

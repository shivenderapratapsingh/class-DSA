public class coinchange {

    public static int change(int[] coins, int target) {
        return countWays(coins, 0, target);
    }

    public static int countWays(int[] coins, int index, int target) {
        if (target == 0) return 1; 
        if (target < 0 || index == coins.length) return 0;

        int pos1 = countWays(coins, index, target - coins[index]); 
        int pos2= countWays(coins, index + 1, target); 

        return pos1+ pos2;
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int target = 4;
        System.out.println("no of ways" + change(coins, target));
    }
}

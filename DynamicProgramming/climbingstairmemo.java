
import java.util.Arrays;

public class climbingstairmemo {
       public int climbStairs(int n) {
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        return climb(n, arr);
    }

    public int climb(int n, int[] memo) {
        if (memo[n] != -1) {
            return memo[n];
        }
        if (n == 0 || n == 1 || n == 2) {
            memo[n] = n;
            return memo[n];
        }
        memo[n] = climb(n - 1, memo) + climb(n - 2, memo);
        return memo[n];
    }
}

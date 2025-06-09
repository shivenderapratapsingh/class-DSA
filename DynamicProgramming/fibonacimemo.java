import java.util.Arrays;

public class fibonacimemo {
    public int fib(int n) {
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);
        return fib(n, arr);
    }

    public int fib(int n, int[] memo) {
        if (memo[n] != -1) {
            return memo[n];
        }
        if (n == 0 || n == 1) {
            memo[n] = n;
            return memo[n];
        }
        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];
    }
    
}

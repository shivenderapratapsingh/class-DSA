package Bridges;
public class bridges {
    public static int maxBridges(int[] a, int[] b) {
        return maxBridgesRecursive(a, b, a.length, b.length);
    }

    public static int maxBridgesRecursive(int[] a, int[] b, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (a[n - 1] == b[m - 1]) {
            return 1 + maxBridgesRecursive(a, b, n - 1, m - 1);
        } else {
            return Math.max(
                maxBridgesRecursive(a, b, n - 1, m),
                maxBridgesRecursive(a, b, n, m - 1)
            );
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        int[] b = {1, 2, 1, 2, 1};
        System.out.println(maxBridges(a, b));  // Output: 3
    }
}

public class climbingstairtabulation {
      public int climbStairs(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
    public static void main(String[] args) {
        climbingstairtabulation cs = new climbingstairtabulation();
        int n = 5; // Example input
        int result = cs.climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + result);
    }
}

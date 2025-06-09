

public class printn {
     static int sum(int n) {
        if (n < 10) return n;
         int ans= (n % 10) + sum(n / 10);
         return ans;
    }

    static int repeatedSumOfDigits(int N) {
         int n = sum(N);
        if (n<= 9) {
            return n;
        }
        
        return repeatedSumOfDigits(n);
    }
    public static void main(String[] args) {
        int a=repeatedSumOfDigits(987261);
        System.out.println(a);
    }
    
}

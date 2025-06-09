public class power {
    // in logn time
    // power of 2^n
    
      static int power1(int p) {
        if (p == 0) return 1;
        int smallAns = power1(p / 2);
        if (p % 2 == 0) {
            return smallAns * smallAns;
        } else {
            return smallAns * smallAns * 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(power1(6));  // Output: 64
    }

}

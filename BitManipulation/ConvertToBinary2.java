package BitManipulation;

public class ConvertToBinary2 {
       public static String binary(int n) {
        String res = "";
        while (n > 1) {
            if (n % 2 == 1) res = 1 + res;
            else res = 0 + res;
            n = n / 2;
        }
        res = 1 + res; // include the final '1' when n == 1
        return res;
    }

    public static void main(String[] args) {
        System.out.println(binary(8));
    }
}


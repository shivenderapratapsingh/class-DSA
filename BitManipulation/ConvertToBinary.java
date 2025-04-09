package BitManipulation;

public class ConvertToBinary {
    public static String binary(int n) {
        StringBuilder res = new StringBuilder();
        if (n == 0) return "0";

        while (n > 0) {
            res.append(n % 2);
            n = n / 2;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(binary(8));  
    }
}

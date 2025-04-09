package BitManipulation;

public class ConvertToDecimal2 {
    public static int dec(String s) {
        int num = 0;
        int p = 1; 

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                num += p;
            }
            p *= 2;
        }

        return num;
    }

    public static void main(String[] args) {
        int a = dec("1101");
        System.out.println(a); // Output: 13
    }
}

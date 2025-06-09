public class permutaion {
    static void permute(String s, String curr) {
        if (s.length() == 0) {
            System.out.println(curr);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            permute(s.substring(0, i) + s.substring(i + 1), curr + s.charAt(i));
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        permute(s, "");
    }
}

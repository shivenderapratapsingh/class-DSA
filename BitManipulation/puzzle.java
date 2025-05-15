package BitManipulation;

public class puzzle {
    public static int puz(int rupees) {
        int cost1 = 1;
        int totalchoc = rupees / cost1;
        int wrappers = totalchoc;

        while (wrappers >= 3) {
            int extra = wrappers / 3;
            totalchoc += extra;
            wrappers = wrappers % 3 + extra;
        }

        return totalchoc;
    }

    public static void main(String[] args) {
        int a = 15;
        System.out.println(puz(a));
    }
}

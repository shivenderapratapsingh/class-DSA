
import java.util.Stack;

public class Question32 {


    public static int maxArea(int[] a) {
        int maxAns = 0;
        int[] ps = prevSmaller(a);  // Previous smaller indices
        int[] ns = newSmaller(a);   // Next smaller indices

        for (int i = 0; i < a.length; i++) {
            int width = ns[i] - ps[i] - 1;
            int area = width * a[i];
            maxAns = Math.max(maxAns, area);
        }

        return maxAns;
    }

    public static int[] prevSmaller(int[] a) {
        int[] ps = new int[a.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < a.length; i++) {
            while (!s.isEmpty() && a[s.peek()] >= a[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                ps[i] = -1;
            } else {
                ps[i] = s.peek();
            }

            s.push(i);
        }

        return ps;
    }

    public static int[] newSmaller(int[] a) {
        int[] ns = new int[a.length];
        Stack<Integer> s = new Stack<>();

        for (int i = a.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && a[s.peek()] >= a[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                ns[i] = a.length;
            } else {
                ns[i] = s.peek();
            }

            s.push(i);
        }

        return ns;
    }

    // Example usage
    public static void main(String[] args) {
        int[] histogram = {2, 1, 5, 6, 2, 3};
        System.out.println("Maximum area: " + maxArea(histogram));
    }
}



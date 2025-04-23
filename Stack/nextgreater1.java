import java.util.*;

public class nextgreater1 {
    public ArrayList<Integer> greater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
       
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            
            if (st.isEmpty()) {
                list.add(-1);
            } else {
                list.add(st.peek());
            }

            st.push(arr[i]);
        }

        
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        nextgreater1 obj = new nextgreater1();
        int[] arr = {4, 5, 2, 10, 8};
        ArrayList<Integer> res = obj.greater(arr);
        System.out.println(res); 
    }
}

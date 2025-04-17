package CollectionFramework;
import java.util.*;

public class SimpleArraytoList {
   

        public static List<Integer> arr(int[] a) {
            List<Integer> list = new ArrayList<>();  // Create a new list
    
            // Manually box each int and add to the list
            for (int num : a) {
                list.add(num);  // Autoboxing: int to Integer automatically happens here
            }
    
            System.out.println(list);  // Output: [1, 2, 3, 4]
            return list;
        }
    
        public static void main(String[] args) {
            int[] a = {1, 2, 3, 4};
            List<Integer> result = arr(a);
            System.out.println(result);  // Output: [1, 2, 3, 4]
        }
    
     
}

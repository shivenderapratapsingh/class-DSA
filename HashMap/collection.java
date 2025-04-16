package HashMap;
import java.util.*;
public class collection {
    public static void main(String[] args) {
       
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 3, 9, 4, 1, 6));

       
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                boolean isO1Even = o1 % 2 == 0;
                boolean isO2Even = o2 % 2 == 0;

                if (isO1Even && !isO2Even) {
                    return -1; // o1 comes first same order -1;
                } else if (!isO1Even && isO2Even) {
                    return 1;  // o2 comes first in this reverse order
                } else {
                    return o1 - o2; // Sort in ascending order if both are even or both are odd
                }
            }
        });
        
        System.out.println("Even numbers first, then odd numbers: " + list);



    }
}

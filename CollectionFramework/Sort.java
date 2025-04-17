package CollectionFramework;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        // Sort in descending order
        Collections.sort(numbers, (a, b) -> b - a);

        System.out.println(numbers);  // Output: [8, 5, 3, 2, 1]
    }
}


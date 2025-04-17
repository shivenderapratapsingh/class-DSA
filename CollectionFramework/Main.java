package CollectionFramework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "pear");

        // Sort by length, then lexicographically
        Collections.sort(words, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b); // Compare lexicographically if same length
            }
            return a.length() - b.length(); // Compare by length
        });

        System.out.println(words);  // Output: [kiwi, pear, apple, banana]
    }
}


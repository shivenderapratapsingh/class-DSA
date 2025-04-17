package CollectionFramework;

import java.util.*;

public class LastSort {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "pear");

        // Sort by last character
        Collections.sort(words, (a, b) -> {
            return a.charAt(a.length() - 1) - b.charAt(b.length() - 1);
        });

        System.out.println(words);  // Output: [banana, apple, pear, kiwi]
    }
}


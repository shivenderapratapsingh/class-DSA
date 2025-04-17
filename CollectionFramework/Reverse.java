package CollectionFramework;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "pear");

        // Sort in reverse alphabetical order
        Collections.sort(words, (a, b) -> b.compareTo(a));

        System.out.println(words);  // Output: [pear, kiwi, banana, apple]
    }
}


package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Frequency1 {
    public int[] frequencySort(int[] nums) {
    Map<Integer, Integer> freq = new HashMap<>();
    List<Integer> list = new ArrayList<>();

    for (int n : nums) {
        freq.put(n, freq.getOrDefault(n, 0) + 1);
        list.add(n);
    }

    Collections.sort(list, (a, b) -> {
        int fa = freq.get(a), fb = freq.get(b);
        return fa == fb ? b - a : fa - fb;
    });

    return list.stream().mapToInt(i -> i).toArray(); // Clean final step
}

}

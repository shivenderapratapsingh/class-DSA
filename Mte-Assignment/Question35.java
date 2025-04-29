import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Question35 {
     public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency using HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Max-Heap based on frequency (PriorityQueue with custom comparator)
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(freqMap.entrySet());

        // Step 3: Extract top k elements
        List<Integer> resultList = new ArrayList<>();
        while (k-- > 0 && !maxHeap.isEmpty()) {
            resultList.add(maxHeap.poll().getKey());
        }

        // Convert List<Integer> to int[]
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}

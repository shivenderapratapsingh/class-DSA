import java.util.HashMap;

public class Question40 {
    
    // Method to find the element with maximum frequency
    public static int maxfreq(int[] arr) {
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Populate the frequency map
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        // Initialize max element and frequency
        int maxe = arr[0];
        int maxf = map.get(maxe);
        
        // Iterate through the map to find the element with the maximum frequency
        for (int key : map.keySet()) {
            if (map.get(key) > maxf) {
                maxf = map.get(key);
                maxe = key;
            }
        }
        
        // Return the element with the maximum frequency
        return maxe;
    }

    // Main method to test the maxfreq method
    public static void main(String[] args) {
        // Sample array
        int[] arr = {1, 3, 3, 2, 2, 2, 3, 4, 5, 3};
        
        // Call the maxfreq method and print the result
        System.out.println("Element with maximum frequency: " + maxfreq(arr));
    }
}

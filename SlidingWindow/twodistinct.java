package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;

public class twodistinct {
    public static ArrayList<Integer> disa(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i : arr) {
            if (hashMap.containsKey(i)) {
                int val = hashMap.get(i);
                hashMap.put(i, val + 1);
            } else {
                hashMap.put(i, 1);
            }
        }

        
        ArrayList<Integer> result = new ArrayList<>();
        for (int key : hashMap.keySet()) {
            if (hashMap.get(key) == 1) {
                result.add(key);
            }
        }

        return result;
    }

   
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        ArrayList<Integer> distincts = disa(arr);

        System.out.println("Elements that appear only once: " + distincts);
    }
}

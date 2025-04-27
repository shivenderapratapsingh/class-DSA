package SlidingWindow;

import java.util.ArrayList;


public class maxelement {
    public static ArrayList<Integer> max(int[] arr, int k) {
        int a = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i <= a - k; i++) { 
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                max = Math.max(max, arr[j]);
            }
            result.add(max);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        ArrayList<Integer> result = max(arr, k);
        System.out.println(result);
    }
}

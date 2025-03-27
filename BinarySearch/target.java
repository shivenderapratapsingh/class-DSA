package BinarySearch;
public class target {
    public static int tar(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }
        
        return low; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int targetValue = 4;
        System.out.println("Index of target or insertion point: " + tar(arr, targetValue));
    }
}

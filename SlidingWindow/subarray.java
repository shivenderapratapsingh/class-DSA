package SlidingWindow;

public class subarray {
    public static int sub(int[] arr, int k) {
        int currentsum = 0;
        int count = 0;
        int sum = Integer.MIN_VALUE; 
        int j = 0;

        while (j < arr.length) {
            currentsum += arr[j];
            count++;

            if (count == k) {
                sum = Math.max(sum, currentsum);
                currentsum -= arr[j - k + 1]; 
                count--; 
            }

            j++;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int result = sub(arr, k);
        System.out.println("The maximum sum of subarrays of size " + k + " is: " + result);
    }
}



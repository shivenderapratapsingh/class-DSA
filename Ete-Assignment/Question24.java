import java.util.*;
public class Question24 {



    static int inversionCount = 0; // ✅ Global variable to store count

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                // All remaining elements in left subarray are greater than arr[right]
                inversionCount += (mid - left + 1); // ✅ Use global variable
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static int numberOfInversions(int[] a, int n) {
        inversionCount = 0; // ✅ Reset before use
        mergeSort(a, 0, n - 1);
        return inversionCount;
    }

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        int n = a.length;
        int cnt = numberOfInversions(a, n);
        System.out.println("The number of inversions are: " + cnt);
    }
}



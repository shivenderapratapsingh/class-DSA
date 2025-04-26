public class Question3 {
    
    // Checks if the array can be split into two parts with equal sum
    public static boolean cansplit(int [] arr){
        int total = 0, left = 0;
        for(int i : arr){
            total += i;
        }
        for(int i = 0; i < arr.length; i++){
            left += arr[i];
            if(left == total - left) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(cansplit(arr));

        int [] arr2 = {1, 2, 3};
        System.out.println(cansplit(arr2));

        int [] arr3 = {2, 1, -1};
        System.out.println(cansplit(arr3));
    }
}

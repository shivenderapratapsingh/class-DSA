package SlidingWindow;

public class sub2 {
    public static int subb(int [] arr,int k){
        int i=0;
        int j=0;
        int currentsum=0;
        int count=0;
        int sum=Integer.MIN_VALUE;
        while(j<arr.length){
            if(i==j){
                currentsum+=arr[i];
                count++;
            }
            else{
                currentsum+=arr[j];
                count++;
                if(count==k){
                    sum=Math.max(currentsum, sum);
                    currentsum=0;
                    count=0;
                    i++;
                }

            }
            j++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int result = subb(arr, k);
        System.out.println("The maximum sum of subarrays of size " + k + " is: " + result);
    }
}

public class Question5 {
    public static int max(int [] arr,int k){
        int st=0;
        int end=0;
        int max=0;
        int curr=0;
        while(end<arr.length){
            curr+=arr[end];
            if(end-st+1<k){
                end++;
            }
            else if(end-st+1==k){
                max=Math.max(curr,max);
                curr-=arr[st];
                st++;
                end++;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int result = max(arr, k);
        System.out.println("The maximum sum of subarrays of size " + k + " is: " + result);
        
    }
    
}

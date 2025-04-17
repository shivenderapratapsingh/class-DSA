package SlidingWindow;

public class Many {
    public static int arr(int [] arr,int target){
        int left=0;
        int right=0;
        int sum=0;
        int count=0;
        while(right<arr.length-1){
           sum+=arr[right];
            if(sum==target){
                count++;
            }
            else if(sum>target){
                sum=0;
                left++;
                right=left;
            }
            else{
                right++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr={3,-3,1,2,-3,1,1,1};
        System.out.println(arr(arr,3)); 
        
    }
    
}

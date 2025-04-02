package SlidingWindow;

public class sub {
    public static int s(int [] arr,int k){
        int n=arr.length;
        int sum=0;
        int l=0;
        int r=k-1;
        for(int i=0;i<=k-1;i++){
            sum+=arr[i];
        }
        int maxsum=sum;
        while(r<n-1){
            sum=sum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];
            maxsum=Math.max(sum, maxsum);

        }
        return maxsum;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int a=s(arr, 3);
        System.out.println("answer"+a);
    }
    
}

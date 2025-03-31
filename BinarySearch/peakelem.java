package BinarySearch;

public class peakelem {
    public int peakIndexInMountainArray(int[] a) {
        int low = 0;
        int high = a.length - 1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]<a[mid+1]){
                low=mid+1;
                ans=mid+1;
            } 
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}

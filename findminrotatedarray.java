public class findminrotatedarray {
    public int findMin(int[] nums) {
        int a=nums.length-1;
        int low=0;
        int high=a;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=nums[a]){
                ans=nums[mid];
                high=mid-1;
               
                
            }
            else{
                 low=mid+1;
                
            }
        }
        return ans;
    }
}

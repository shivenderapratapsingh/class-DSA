package BinarySearch;

public class searchtwo {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
            }
            else if(nums[mid]<=nums[high]){
                if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else{
                if(nums[low]<=target && target< nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }

        }
        return false;
    }
    
}

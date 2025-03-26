package BinarySearch;

public class firstandlastOcurrence {
    public int[] searchRange(int[] nums, int target) {
        int [] arr={-1,-1};
        int a=firstandlast(nums,target,true);
        int b=firstandlast(nums,target,false);
        arr[0]=a;
        arr[1]=b;
        return arr;     
    }
    public int firstandlast(int [] nums,int target,boolean found){
        int low=0;
        int fo=-1;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
              if(target==nums[mid]){
                fo=mid;
                if(found) high=mid-1;
                else low=mid+1;  
        }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
            return fo;
        }
    
}
